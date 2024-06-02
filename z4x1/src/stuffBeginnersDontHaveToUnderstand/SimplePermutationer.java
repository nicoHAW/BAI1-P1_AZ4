// This source code is UTF-8 coded - see https://stackoverflow.com/questions/9180981/how-to-support-utf-8-encoding-in-eclipse
// "Home"-VCS: git@git.HAW-Hamburg.de:shf/Px/LabExercise/ZZZ_SupportStuff[.git]
package stuffBeginnersDontHaveToUnderstand;


import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


/**
 * Die Klasse {@link SimplePermutationer} .. - see task
 * 
 * @param <T>  ...
 * 
 * 
 * @author  Michael Schaefers  ([UTF-8]:"Michael Schäfers");
 *          Px@Hamburg-UAS.eu
 * @version {@value #encodedVersion}
 */
public class SimplePermutationer<T> implements Permutationer<T>,Serializable {
    //
    //--VERSION:-------------------------------#---vvvvvvvvv---vvvv-vv-vv--vv
    //  ========                               #___~version~___YYYY_MM_DD__dd_
    final static private long encodedVersion = 2___00002_001___2023_05_01__01L;
    //-----------------------------------------#---^^^^^-^^^---^^^^-^^-^^--^^
    final static private Version version = new Version( encodedVersion );
  //static public String getDecodedVersion(){ return version.getDecodedVersion(); }
    final static private long serialVersionUID = version.getEncodedVersion();
    
    
    
    
    
    private class ElemInfo {
        private final T elem;
        private final int localIndex;
        private List<Integer> localToDoList;
        
        private ElemInfo( final T elem,  final int localIndex,  List<Integer> localToDoList ){
            this.elem = elem;
            this.localIndex = localIndex;
            this.localToDoList = localToDoList;
        }//constructor()
        
        @Override
        public String toString(){
            return String.format(
                "%s  @<loc>%d  ->   %s",
                elem,
                localIndex,
                localToDoList
            );
        }//method()
    }//class
    
    
    
    
    
  //final private T[] unpermutatedOriginal;
    
    final private Stack<ElemInfo> coreState;
    
    private T[] currentPermutation; 
    private int numberOfPermutationsStillToDo;
    
    
    
    
    
    /**
     * ...
     * 
     * @param permutable
     */
    public SimplePermutationer( final T[] permutable ){
        assert  2<=permutable.length : "Illegal Argument : At least 2 array elements are required for actual permutation";
        assert 12>=permutable.length : "Illegal Argument : Max. number of array elements allowed is 12 for permutation - consider computation time!";
        
      //unpermutatedOriginal = permutable;                                      // original is NOT needed
        currentPermutation = Arrays.copyOf( permutable, permutable.length );
      //for( int i=permutable.length; --i>=0; )  currentPermutation[i] = null;  // clearing is NOT necessary
        
        numberOfPermutationsStillToDo = facu( permutable.length );
        
        coreState = new SimpleFastDequeStack<ElemInfo>();
        
        T elem = permutable[0];
        currentPermutation[0] = elem;
        int localIndex = 0;
        List<Integer> localToDoList = new ArrayList<Integer>();
        for( int posi=0; posi<permutable.length; posi++ ) localToDoList.add( posi );
        ElemInfo ei = new ElemInfo( elem, localIndex, localToDoList );
        coreState.push( ei );
        
        for( int i=1; i<permutable.length; i++ ){
            // compute local ToDo-List based on old/last localIndex
            List<Integer> tmp = new ArrayList<Integer>( localToDoList.subList( 0, localIndex ));        // ???localToDoList.subList( ... ) allein reicht nicht -> Bug ???
            tmp.addAll( localToDoList.subList( localIndex+1, localToDoList.size() ));
            localToDoList = tmp;
            //
            //localIndex gets new view
            elem = permutable[i];
            currentPermutation[i] = elem;
            localIndex = 0;
            ei = new ElemInfo( elem, localIndex, localToDoList );
            coreState.push( ei );
        }//for
    }//constructor()
    
    
    
    
    
    @Override
    public boolean hasNext(){
        return  0 < numberOfPermutationsStillToDo;
    }//method()
    
    
    @Override
    public T[] next(){
        assert 0 < numberOfPermutationsStillToDo : "Illegal State : Underflow - NO more permutation available";
        
        final T[] resu = Arrays.copyOf( currentPermutation, currentPermutation.length );
        numberOfPermutationsStillToDo--;
        
        if( 0 < numberOfPermutationsStillToDo ){
            final Stack<T> tmpElemStack = new SimpleFastDequeStack<T>();
            ElemInfo ei;
            
            do {
                ei = coreState.pop();
                tmpElemStack.push( ei.elem );
            }while( ei.localIndex >= ei.localToDoList.size() -1 );
            
            T elem = tmpElemStack.pop();
            int localIndex = ei.localIndex +1;
            List<Integer> localToDoList = ei.localToDoList;
            currentPermutation[ localToDoList.get(localIndex) ] = elem;
            ei = new ElemInfo( elem, localIndex, localToDoList );
            coreState.push( ei );
            
            while( ! tmpElemStack.isEmpty() ) {
                // compute local ToDo-List based on old/last localIndex
                List<Integer> tmp = new ArrayList<Integer>( localToDoList.subList( 0, localIndex ));        // ???localToDoList.subList( ... ) allein reicht nicht -> Bug ???
                tmp.addAll( localToDoList.subList( localIndex+1, localToDoList.size() ));
                localToDoList = tmp;
                //
                //localIndex gets new view
                elem = tmpElemStack.pop();
                localIndex = 0;
                currentPermutation[ localToDoList.get(localIndex) ] = elem;
                ei = new ElemInfo( elem, localIndex, localToDoList );
                coreState.push( ei );
            }//while
            
        }else{
            currentPermutation = null;
        }//if
        return resu;
    }//method()
    
    
    
    
    
    private int facu( final int number ){
        assert  0<=number : "Illegal Argument : number has to be positive";
        assert 12>=number : "Illegal Argument : 12 is max. argument number to stay int range";
        
        int resu = 1;
        for( int i=number; i>=2; i-- )  resu *= i;
        return resu;
    }//method()
    
    /*
    private void dbgPrintCoreState(){
        while( ! coreState.isEmpty() ){
            final ElemInfo ei = coreState.pop();
            System.out.printf( "%s\n",  ei );
        }//while
    }//method()
    */
    
}//class
