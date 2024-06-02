// This source code is UTF-8 coded - see https://stackoverflow.com/questions/9180981/how-to-support-utf-8-encoding-in-eclipse
// "Home"-VCS: git@git.HAW-Hamburg.de:shf/Px/LabExercise/ZZZ_SupportStuff[.git]
package stuffBeginnersDontHaveToUnderstand;


import java.util.List;


/**
 * Das Interface {@link Stack} .. - see task
 * 
 * @param <T>  ...
 * 
 * 
 * @author  Michael Schaefers  ([UTF-8]:"Michael Schäfers");
 *          Px@Hamburg-UAS.eu
 * @version {@value #encodedInterfaceVersion}
 */
public interface Stack<T> {                                                     // <=> abstract
    //
    //--VERSION:-------------------#---vvvvvvvvv---vvvv-vv-vv--vv
    //  ========                   #___~version~___YYYY_MM_DD__dd_
    long encodedInterfaceVersion = 2___00002_001___2023_05_01__01L;             // <=> public static final
    //-----------------------------#---^^^^^-^^^---^^^^-^^-^^--^^
    Version stackInterfaceVersion = new Version( encodedInterfaceVersion );     // <=> public static final
    /**
     * The method {@link #getDecodedVersion()} delivers the code version as reground/readable String.
     * @return version as decoded/readable String.
     */
    static public String getDecodedVersion(){ return stackInterfaceVersion.getDecodedVersion(); }
    // Obiges (ab VERSION) dient nur der Versionierung
    
    
    
    
    
    /**
     * ...
     * 
     * @param elem  pushes given element on top of stack
     */
    void push( final T elem );
    
    
    
    /**
     * ...
     * 
     * @return  pops top element from stack
     */
    T pop();
    
    
    
    /**
     * ...
     * 
     * @return  retrieves, but does not remove, top element from stack
     */
    T peek();
    
    
    
    /**
     * ...
     */
    void clear();
    
    
    
    /**
     * ...
     * 
     * @return  true if stack empty, false otherwise
     */
    boolean isEmpty();
    
    
    
    /**
     * ...
     * 
     * @return  stack size
     */
    int size();
    
    
    
    /*#*
     * ...
     * 
     * @param elem
     * @return
     *#/
    T[] toArray( final T elem );
    */
    
    
    /**
     * ...
     * 
     * @return  list of all stack elements
     */
    List<T> toList();
    
}//interface
