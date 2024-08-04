// This source code is UTF-8 coded - see https://stackoverflow.com/questions/9180981/how-to-support-utf-8-encoding-in-eclipse
// "Home"-VCS: git@git.HAW-Hamburg.de:shf/Px/LabExercise/ZZZ_SupportStuff[.git]
package stuffBeginnersDontHaveToUnderstand;


/**
 * A {@link Permutationer} supports step by step permutation of a given array.
 *
 * @param <T>  ...
 * 
 * 
 * @author   Michael Schaefers  ([UTF-8]:"Michael Schäfers");
 *           P1@Hamburg-UAS.eu 
 * @version  {@value #encodedInterfaceVersion}
 */
public interface Permutationer<T> {                                             // <=> abstract
    //
    //--VERSION:-------------------#---vvvvvvvvv---vvvv-vv-vv--vv
    //  ========                   #___~version~___YYYY_MM_DD__dd_
    long encodedInterfaceVersion = 2___00002_001___2023_04_30__01L;             // <=> public static final
    //-----------------------------#---^^^^^-^^^---^^^^-^^-^^--^^
    Version permutationerInterfaceVersion = new Version( encodedInterfaceVersion ); // <=> public static final
    /**
     * The method {@link #getDecodedVersion()} delivers the code version as reground/readable String.
     * @return version as decoded/readable String.
     */
    static public String getDecodedVersion(){ return permutationerInterfaceVersion.getDecodedVersion(); }
    // Obiges (ab VERSION) dient nur der Versionierung.
    
    
    
    
    
    /**
     * ...
     * 
     * @return
     */
    boolean hasNext();
    
    /**
     * ...
     * 
     * @return
     */
    T[] next();
    
}//interface
