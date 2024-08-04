package stuffBeginnersDontHaveToUnderstand.random;


import java.util.Arrays;

import stuffBeginnersDontHaveToUnderstand.Version;


/**
 * The class {@link RandomGeneratorImplementationWrapper} is wrapping an implementation for a class implementing the interface {@link RandomGenerator}.
 * ...
 * 
 * @author  Michael Schaefers  ([UTF-8]:"Michael Schäfers");
 *          Px@Hamburg-UAS.eu
 * @version {@value #encodedVersion}
 */

public class RandomGeneratorImplementationWrapper implements RandomGenerator {
    //
    //--VERSION:-------------------------------#---vvvvvvvvv---vvvv-vv-vv--vv
    //  ========                               #___~version~___YYYY_MM_DD__dd_
    final static private long encodedVersion = 2___00001_002___2023_04_23__01L;
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
    
    
    
    
    
    final private RandomGenerator randomGenerator;
    
    
    
    
    
    /**
     * ...
     * 
     * @param selectedImplementation  ...
     * @param seed  ...
     */
    public RandomGeneratorImplementationWrapper( final int selectedImplementation,  final Long... seed ){
        switch( selectedImplementation ){
            //
            // Math.random()
            case 111:{
                if( 1 <= seed.length )  throw new IllegalArgumentException( String.format( "NO seed is supported, but -> %s", Arrays.toString( seed )));
                randomGenerator = new RandomBasedOnMathRandom();
            };break;
            //
            // java.util.Random
            case 211:{
                if( 1 != seed.length )  throw new IllegalArgumentException( String.format( "Exactly ONE seed is requested&supported, but -> %s", Arrays.toString( seed )));
                randomGenerator = new RandomBasedOnUtilRandom( seed[0] );
            };break;
            //
            // PRBS
            case 811:{
                if( 1 <= seed.length )  throw new IllegalArgumentException( String.format( "NO seed is supported, but -> %s", Arrays.toString( seed )));
                randomGenerator = new RandomBasedOnPRBS32( -1 );
            };break;
            case 821:{
                if( 1 <= seed.length )  throw new IllegalArgumentException( String.format( "NO seed is supported, but -> %s", Arrays.toString( seed )));
                randomGenerator = new RandomBasedOnPRBS32( System.nanoTime() );
            };break;
            case 831:{
                if( 1 != seed.length )  throw new IllegalArgumentException( String.format( "Exactly ONE seed is requested&supported, but -> %s", Arrays.toString( seed )));
                randomGenerator = new RandomBasedOnPRBS32( seed[0] );
            };break;
            //
            // default -> java.util.Random
            default:{
                if( 1 <= seed.length )  throw new IllegalArgumentException( String.format( "NO seed is supported, but -> %s", Arrays.toString( seed )));
                randomGenerator = new RandomBasedOnUtilRandom( -1 );
            };break;
        }//switch
    }//contructor()
    //
    /**
     * ...
     */
    public RandomGeneratorImplementationWrapper(){
        this( -1, -1L );                                                        // __???__<230425> Bug ??? this( -1 ) ok ??? and "L" resp. L in -1L requested ???
    }//contructor()
    
    
    
    
    
    @Override
    public int nextInt( final int excludingMaximum ){
        assert 0<excludingMaximum;
        return randomGenerator.nextInt( excludingMaximum );
    }//method()
    
    @Override
    public String identifyImplementation(){
        return randomGenerator.identifyImplementation();
    }//method()
    
}//class
