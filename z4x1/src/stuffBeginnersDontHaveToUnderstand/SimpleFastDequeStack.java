// This source code is UTF-8 coded - see https://stackoverflow.com/questions/9180981/how-to-support-utf-8-encoding-in-eclipse
// "Home"-VCS: git@git.HAW-Hamburg.de:shf/Px/LabExercise/ZZZ_SupportStuff[.git]
package stuffBeginnersDontHaveToUnderstand;


import java.io.Serializable;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;
import java.util.List;


/**
 * Die Klasse {@link SimpleFastDequeStack} implementiert einen schnellen und sehr einfachen
 * Stack als Alternative zu der Klasse java.util.Stack, die sich von Vector ableitet
 * und threadsafe ist und in der Konsequenz auch &quot;langsam&quot;.<br />
 * Die Klasse {@link SimpleFastDequeStack} ist <strong>nicht threadsafe</strong>.
 * 
 * @param <T>  ...
 * 
 * 
 * @author   Michael Schaefers  ([UTF-8]:"Michael Schäfers");
 *           P1@Hamburg-UAS.eu 
 * @version {@value #encodedVersion}
 */
public class SimpleFastDequeStack<T> implements Stack<T>, Serializable {
    //
    //--VERSION:-------------------------------#---vvvvvvvvv---vvvv-vv-vv--vv
    //  ========                               #___~version~___YYYY_MM_DD__dd_
    final static private long encodedVersion = 2___00001_003___2023_05_01__01L;
    //-----------------------------------------#---^^^^^-^^^---^^^^-^^-^^--^^
    final static private Version version = new Version( encodedVersion );
  //static public String getDecodedVersion(){ return version.getDecodedVersion(); }
    final static private long serialVersionUID = version.getEncodedVersion();
    
    
    
    final private Deque<T> stack;
    private int elemCnt;                                                        // ArrayList::size() is considered slower, especially in pop()
    
    
    
    /**
     * ...
     */
    public SimpleFastDequeStack(){
        stack = new ArrayDeque<T>();                                            // <-> ConcurrentLinkedDeque
        elemCnt = 0;
    }//constructor()
    
    
    
    @Override
    public void push( final T elem ){
        stack.addFirst( elem );
        elemCnt++;
    }//method()
    
    @Override
    public T pop(){
        if( 0 >= elemCnt-- )  throw new RuntimeException( "Stack-Underflow" );
        return stack.removeFirst();
    }//method()
    
    @Override
    public T peek(){
        if( 0 >= elemCnt )  throw new RuntimeException( "Stack-Underflow" );
        return stack.getFirst();
    }//method()
    
    @Override
    public void clear(){
        stack.clear();
    }//method()
    
    @Override
    public boolean isEmpty(){
        return 0 >= elemCnt;
    }//method()
    
    @Override
    public int size(){
        return elemCnt;
    }//method()
    
    /**
     * ...
     * <br />
     * <br />
     * ATTENTION! : This method works the simple and insecure way.
     * <table>
     *  <tr> <td valign="top">&bull;</td> <td>
     *      Originals are given away e.g. by {@link #toList()}.
     *  <td> </tr>
     *  <tr> <td valign="top">&bull;</td> <td>
     *      Client has "full control" over internal matter. E.g. after {@link #toList()}
     *      Client has all references to each single element stored inside stack.
     *  <td> </tr>
     * </table>
     * Hence this method has to used in well encapsulated internal scope.
     * 
     * @return  ...
     */
    @SuppressWarnings("unchecked")
    @Override
    public List<T> toList(){
        return Arrays.asList( ((T[])( stack.toArray() )) );
    }//method()
    
}//class
