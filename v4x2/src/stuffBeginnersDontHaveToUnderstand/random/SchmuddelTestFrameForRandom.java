package stuffBeginnersDontHaveToUnderstand.random;


import stuffBeginnersDontHaveToUnderstand.Version;


/**
 * The class {@link SchmuddelTestFrameForRandom} ...
 * 
 * @author  Michael Schaefers  ([UTF-8]:"Michael Schäfers");
 *          Px@Hamburg-UAS.eu
 * @version {@value #encodedVersion}
 */
public class SchmuddelTestFrameForRandom {
    //
    //--VERSION:-------------------------------#---vvvvvvvvv---vvvv-vv-vv--vv
    //  ========                               #___~version~___YYYY_MM_DD__dd_
    final static private long encodedVersion = 2___00001_001___2023_04_23__01L;
    //-----------------------------------------#---^^^^^-^^^---^^^^-^^-^^--^^
    final static private Version version = new Version( encodedVersion );
    /**
     * The method {@link #getDecodedVersion()} delivers the code version as reground/readable String.
     * @return version as decoded/readable String.
     */
    static public String getDecodedVersion(){ return version.getDecodedVersion(); }
    // Obiges (ab VERSION) dient nur der Versionierung.
    
    
    
    
    
    
    /**
     * method to start test
     * 
     * @param unused  is unused ;-)
     */
    public static void main( final String... unused ){
        
        final int amountOfTestNumbers = 37;
        final int excludingMaximum = 10;
        
        /*scope*/{
            final RandomGenerator rg = new RandomGeneratorImplementationWrapper();
            System.out.printf( "\"nix\" -> %s\n",  rg.identifyImplementation() );
            for( int i=0; i<amountOfTestNumbers; i++ )  System.out.printf( "%d  ",  rg.nextInt( excludingMaximum ));
            System.out.printf( "\n\n\n" );
        }//scope
        
        // no seed
        for( final int configId : new int[]{ -1, 111, 811, 821 }){
            final RandomGenerator rg = new RandomGeneratorImplementationWrapper( configId );
            System.out.printf( "%d -> %s\n",  configId, rg.identifyImplementation());
            for( int i=0; i<amountOfTestNumbers; i++ )  System.out.printf( "%d  ",  rg.nextInt( excludingMaximum ));
            System.out.printf( "\n" );
            //
            System.out.printf( "\n\n\n" );
        }//for
        
        // with seed
        for( final int configId : new int[]{ 211, 831 }){
            final RandomGenerator rg = new RandomGeneratorImplementationWrapper( configId, -1L );
            System.out.printf( "%d -> %s\n",  configId, rg.identifyImplementation());
            for( int i=0; i<amountOfTestNumbers; i++ )  System.out.printf( "%d  ",  rg.nextInt( excludingMaximum ));
            System.out.printf( "\n" );
            //
            System.out.printf( "\n\n\n" );
        }//for
        
    }//method()
    
}//class
