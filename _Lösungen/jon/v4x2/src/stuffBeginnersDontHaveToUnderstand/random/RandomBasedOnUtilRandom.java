package stuffBeginnersDontHaveToUnderstand.random;


import java.util.Random;
import stuffBeginnersDontHaveToUnderstand.Version;;


/**
 * The class {@link RandomBasedOnUtilRandom} implements the interface {@link RandomGenerator}.
 * Actually it's some wrapper for {@link java.util.Random}.
 * 
 * @author  Michael Schaefers  ([UTF-8]:"Michael Schäfers");
 *          Px@Hamburg-UAS.eu
 * @version {@value #encodedVersion}
 */
public class RandomBasedOnUtilRandom implements RandomGenerator {
    //
    //--VERSION:-------------------------------#---vvvvvvvvv---vvvv-vv-vv--vv
    //  ========                               #___~version~___YYYY_MM_DD__dd_
    final static private long encodedVersion = 2___00001_001___2023_03_08__01L;
    //-----------------------------------------#---^^^^^-^^^---^^^^-^^-^^--^^
    final static private Version version = new Version( encodedVersion );
    /**
     * The method {@link #getDecodedVersion()} delivers the code version as reground/readable String.
     * @return version as decoded/readable String.
     */
    static public String getDecodedVersion(){ return version.getDecodedVersion(); }
    // Obiges (ab VERSION) dient nur der Versionierung.
    //
    // serial version unique ID is based on given code version
    final static private long  serialVersionUID = version.getEncodedVersion();
    
    
    
    
    
    final private Random randomGenerator;
    
    
    
    
    
    /**
     * ...
     * 
     * @param seed
     */
    public RandomBasedOnUtilRandom( final long seed ){
        randomGenerator = new Random( seed );
    }//constructor()
    /**
     * 
     */
    public RandomBasedOnUtilRandom(){
        randomGenerator = new Random();
    }//constructor()
    
    
    
    
    
    @Override
    public int nextInt( final int excludingMaximum ){
        assert 0<excludingMaximum;
        return randomGenerator.nextInt( excludingMaximum );
    }//method()
    
    
    @Override
    public String identifyImplementation(){
        return randomGenerator.getClass().getName() + "  -  util.Random";
    }//method()
    
}//class
