package stuffBeginnersDontHaveToUnderstand.random;


import java.io.Serializable;
import stuffBeginnersDontHaveToUnderstand.Version;


/**
 * The interface {@link RandomGenerator} defines operations needed.
 * ...
 * 
 * @author  Michael Schaefers  ([UTF-8]:"Michael Schäfers");
 *          Px@Hamburg-UAS.eu
 * @version {@value #encodedVersion}
 */
public interface RandomGenerator extends Serializable {
    //
    //--VERSION:-----------------------#---vvvvvvvvv---vvvv-vv-vv--vv
    //  ========                       #___~version~___YYYY_MM_DD__dd_
    final static long encodedVersion = 2___00001_003___2023_04_24__11L;
    //---------------------------------#---^^^^^-^^^---^^^^-^^-^^--^^
    final static Version randomGeneratorInterfaceVersion = new Version( encodedVersion );
    /**
     * The method {@link #getDecodedVersion()} delivers the code version as reground/readable String.
     * @return version as decoded/readable String.
     */
    static String getDecodedVersion(){ return randomGeneratorInterfaceVersion.getDecodedVersion(); }
    // Obiges (ab VERSION) dient nur der Versionierung
    //
    // serial version unique ID is based on given code version ;  interfaces might have implementations(!)
    final static long  serialVersionUID = randomGeneratorInterfaceVersion.getEncodedVersion();
    
    
    
    
    
    /**
     * ...
     * 
     * @param excludingMaximum ...
     * @return...
     */
    int nextInt( int excludingMaximum );
    
    /**
     * ...
     * 
     * @return ...
     */
    String identifyImplementation();
    
}//interface
