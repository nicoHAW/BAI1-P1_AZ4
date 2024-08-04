// This source code is UTF-8 coded - see https://stackoverflow.com/questions/9180981/how-to-support-utf-8-encoding-in-eclipse
package inheritanceDemo;


import stuffBeginnersDontHaveToUnderstand.Version;


/**
 * {@link TestFrameAndStarter2} for Demo 
 *
 * @author  Michael Schaefers  ([UTF-8]:"Michael Schäfers");
 *          P1@Hamburg-UAS.eu 
 * @version {@value #encodedVersion} 
 */
public class TestFrameAndStarter2 {
    //
    //--VERSION:-------------------------------#---vvvvvvvvv---vvvv-vv-vv--vv
    //  ========                               #___~version~___YYYY_MM_DD__dd_
    final static private long encodedVersion = 2___00001_003___2023_04_24__01L;
    //-----------------------------------------#---^^^^^-^^^---^^^^-^^-^^--^^
    final static private Version version = new Version( encodedVersion );
    static public String getDecodedVersion(){ return version.getDecodedVersion(); }
    // Obiges (ab VERSION) dient nur der Versionierung
    
    
    
    
    
    /**
     * Die Methode {@link #main()} startet die Demo.
     * 
     * @param unused wird nicht genutzt, aber "von Java eingefordert".
     */
    public static void main( final String... unused ){
        final K k = new K( 1, "k1" );
        final L l = new L( 2, "l2" );
        final M m = new M( 3, "m3" );
        final M n = new M();
        System.out.printf( "%s\n",  k ); //r  //[<K>: i=1, s=k1]
        System.out.printf( "%s\n",  new K() ); //r  //[<K>: i=0, s=k-]
        System.out.printf( "%s\n",  l ); //r  //[<L>: [<K>: i=2, s=l2]]
        System.out.printf( "%s\n",  new L() ); //r  //[<L>: [<K>: i=0, s=l-]]
        System.out.printf( "%s\n",  m ); //r  //[<M>: [<L>: [<K>: i=3, s=m3]]]
        System.out.printf( "%s\n",  n ); //r  //[<M>: [<L>: [<K>: i=0, s=m-]]]
    }//method()
    
}//class
