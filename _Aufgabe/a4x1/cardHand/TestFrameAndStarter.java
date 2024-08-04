// This source code is UTF-8 coded - see https://stackoverflow.com/questions/9180981/how-to-support-utf-8-encoding-in-eclipse
package cardHand;


import static cards.Card.*;
import static cards.Card.Constant.*;
//
import cards.*;
import cards.Card.*;
import stuffBeginnersDontHaveToUnderstand.EnvironmentAnalyzer;
import stuffBeginnersDontHaveToUnderstand.GivenCodeVersion;
import stuffBeginnersDontHaveToUnderstand.Version;
import java.util.*;


/**
 * Die Klasse {@link TestFrameAndStarter} startet den Test Ihrer Klasse Card-{@link Hand} - see task.
 * 
 * @author  Michael Schaefers  ([UTF-8]:"Michael Schäfers");
 *          P1@Hamburg-UAS.eu 
 * @version {@value #encodedVersion} 
 */
public class TestFrameAndStarter {
    //
    //--VERSION:-------------------------------#---vvvvvvvvv---vvvv-vv-vv--vv
    //  ========                               #___~version~___YYYY_MM_DD__dd_
    final static private long encodedVersion = 2___00002_002___2024_05_27__01L;
    //-----------------------------------------#---^^^^^-^^^---^^^^-^^-^^--^^
    final static private Version version = new Version( encodedVersion );
    static public String getDecodedVersion(){ return version.getDecodedVersion(); }
    // Obiges (ab VERSION) dient nur der Versionierung
    
    
    
    
    
    /**
     * Die Methode {@link #main()} testet und startet Ihre Lösung zur Aufgabe: "CardHand".
     * Hierfür müssen Sie den Test durch Entfernen der Blockkommentarzeichen "aktivieren",
     * sobald Ihre Klasse Hand fertiggestellt ist.
     * Die Tests in dieser Methode dürfen nicht geändert werden.
     * Aber, Sie dürfen gerne eigene Tests am Ende der Methode ergänzen.
     * 
     * @param unused wird nicht genutzt, aber "von Java eingefordert".
     */
    public static void main( final String... unused ){
        
        // print some information at start
        System.out.printf( "TestFrame information\n" );
        System.out.printf( "=====================\n" );
        System.out.printf( "\n" );
        //
        System.out.printf( "Release:\n" );
        System.out.printf( "    GivenCode version:      %s\n",  GivenCodeVersion.getDecodedVersion() );
        System.out.printf( "    Test version:           %s\n",  version.getDecodedVersion() );
        System.out.printf( "    Card version:           %s\n",  Card.getDecodedVersion() );
        System.out.printf( "    Deck version:           %s\n",  Deck.getDecodedVersion() );
        System.out.printf( "\n" );
        //
        System.out.printf( "Environment:\n" );
        System.out.printf( "    #Cores:                 %d\n",  EnvironmentAnalyzer.getAvailableCores() );
        System.out.printf( "    Java:                   %s\n",  EnvironmentAnalyzer.getJavaVersion() );
        System.out.printf( "    assert enabled?:        %s\n",  EnvironmentAnalyzer.isAssertEnabled() );
        System.out.printf( "    UTF-8 configured?:      %s      <- check output\n",  "[ÄËÏÖÜẞäëïöüß🙂😉🙁😟😓😎]" );
        System.out.printf( "\n\n\n\n" );
        //
        System.out.printf( "Start of actual test\n" );
        System.out.printf( "vvvvvvvvvvvvvvvvvvvv\n" );
        System.out.printf( "\n\n" );
        //
        System.out.flush();
        
        
        
        
        
        // Anfang des eigentlichen Tests
        //==============================
        
        // Sobald Sie Ihre Lösung(en) in der/den geforderten Klasse(n) implementiert
        // haben,  müssen die Blockkommentarzeichen entfernt werden.
        //vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv
        
        /*                                                                      // <- muss weg
        Hand someHand;                                                          // KEIN guter Name, aber hier für diesen Test ist ein besserer Name schwierig
        Hand anotherHand;                                                       // KEIN guter Name, aber hier für diesen Test ist ein besserer Name schwierig
        
        
        
        // Zunächst einfache Tests----------------------------------------------
        
        System.out.printf( "Expected ->   CK    (s)\n" );
        someHand = new Hand( CK );
        System.out.printf(
            "%s  %s\n",
            Arrays.toString( someHand.getHandCards() ),
            someHand.isSuited()  ?  "SUITED"  :  "NON suited"
        );
        System.out.printf( "\n\n" );
        
        
        System.out.printf( "Expected ->   CK,  C7, CT, C2, CQ, C5    (s)\n" );
        someHand = new Hand( CK );
        someHand.add( C7, CT, C2, CQ, C5 );
        System.out.printf(
            "%s  %s\n",
            Arrays.toString( someHand.getHandCards() ),
            someHand.isSuited()  ?  "SUITED"  :  "NON suited"
        );
        System.out.printf( "\n\n" );
        
        
        System.out.printf( "Expected ->   SQ    (s)\n" );
        Card[] temp = { SQ };
        anotherHand = new Hand( temp );
        System.out.printf(
            "%s  %s\n",
            Arrays.toString( anotherHand.getHandCards() ),
            someHand.isSuited()  ?  "SUITED"  :  "NON suited"
        );
        System.out.printf( "\n\n" );
        
        
        System.out.printf( "Expected ->   CK, C7, CT, C2, CQ, C5,  SQ    (n)\n" );
        anotherHand = new Hand( new Card[]{ SQ } );
        someHand.add( anotherHand );
        System.out.printf(
            "%s  %s\n",
            Arrays.toString( someHand.getHandCards() ),
            someHand.isSuited()  ?  "SUITED"  :  "NON suited"
        );
        System.out.printf( "\n\n" );
        
        
        System.out.printf( "Expected ->   DJ    (s)\n" );
        someHand.setHandCards( DJ );
        System.out.printf(
            "%s  %s\n",
            Arrays.toString( someHand.getHandCards() ),
            someHand.isSuited()  ?  "SUITED"  :  "NON suited"
        );
        System.out.printf( "\n\n" );
        
        
        System.out.printf( "Expected ->   HQ, DJ, SK    (n)\n" );
        someHand.setHandCards( HQ, DJ, SK );
        System.out.printf(
            "%s  %s\n",
            Arrays.toString( someHand.getHandCards() ),
            someHand.isSuited()  ?  "SUITED"  :  "NON suited"
        );
        System.out.printf( "\n\n" );
        
        
        System.out.printf( "Expected ->   CK, SQ, HJ    (n)\n" );
        someHand.setHandCards( CK, SQ, HJ );
        System.out.printf(
            "%s  %s\n",
            Arrays.toString( someHand.getHandCards() ),
            someHand.isSuited()  ?  "SUITED"  :  "NON suited"
        );
        System.out.printf( "\n\n" );
        
        
        System.out.printf( "Expected ->   SK, DK, HK,  CQ, DJ, HQ,  CT, D7,  DA, HA, CA    (n)\n" );
        someHand = new Hand( SK, DK, HK );
        someHand.add( CQ, DJ, HQ );
        someHand.add( CT, D7 );
        someHand.add( DA, HA, CA );
        System.out.printf(
            "%s  %s\n",
            Arrays.toString( someHand.getHandCards() ),
            someHand.isSuited()  ?  "SUITED"  :  "NON suited"
        );
        //
        System.out.printf( "~~~\n" );
        //
        System.out.printf( "Expected ->   H2, H7, H3,  H4, H5    (s)\n" );
        someHand.setHandCards( H2, H7, H3 );
        someHand.add( H4, H5 );
        System.out.printf(
            "%s  %s\n",
            Arrays.toString( someHand.getHandCards() ),
            someHand.isSuited()  ?  "SUITED"  :  "NON suited"
        );
        System.out.printf( "\n\n" );
        
        
        
        // (Schwierigere) Tests mit/von Sonderfällen----------------------------
        
        System.out.printf( "Expected ->   \"leeres Array\"    (s)\n" );
        someHand = new Hand();                                      // Leere Hand erzeugen
        System.out.printf(
            "%s  %s\n",
            Arrays.toString( someHand.getHandCards() ),
            someHand.isSuited()  ?  "SUITED"  :  "NON suited"
        );
        //
        System.out.printf( "Expected ->   \"leeres Array\"    (s)\n" );
        someHand = new Hand();
        someHand.setHandCards();                                                // Leere Hand setzen
        System.out.printf(
            "%s  %s\n",
            Arrays.toString( someHand.getHandCards() ),
            someHand.isSuited()  ?  "SUITED"  :  "NON suited"
        );
        //
        System.out.printf( "Expected ->   \"leeres Array\"    (s)\n" );
        someHand = new Hand();
        anotherHand = new Hand();
        someHand.add( anotherHand );                                            // Leere Hand hinzufügen
        System.out.printf(
            "%s  %s\n",
            Arrays.toString( someHand.getHandCards() ),
            someHand.isSuited()  ?  "SUITED"  :  "NON suited"
        );
        //
        System.out.printf( "Expected ->   \"leeres Array\"    (s)\n" );
        someHand = new Hand();
        someHand.add( someHand );                                               // Leere Hand sich selbst hinzufügen
        System.out.printf(
            "%s  %s\n",
            Arrays.toString( someHand.getHandCards() ),
            someHand.isSuited()  ?  "SUITED"  :  "NON suited"
        );
        System.out.printf( "\n\n" );
        
        
        
        // Test ob null richtig erkannt wird.
        // Ohne Vorwissen können Sie den nachfolgenden Code nicht verstehen.
        // Jeder dieser Tests führt (im richtigen Moment) zu einem AssertionError,
        // wenn alles richtig gemacht wurde. Dieser AssertionError wird dann
        // "abgefangen" und als Erfolg gemeldet
        //
        boolean expectedExceptionOccured;
        
        
        expectedExceptionOccured = false;
        try {
            someHand = new Hand( null );
        }catch( final AssertionError | IllegalArgumentException ex ){
            expectedExceptionOccured = true;
        }//try
        if( expectedExceptionOccured ){
            System.out.printf( "expected reaction happened\n" );
        }else{
            System.out.printf(
                "%s  %s\n",
                Arrays.toString( someHand.getHandCards() ),
                someHand.isSuited()  ?  "SUITED"  :  "NON suited"
            );
            System.out.printf( "expected reaction did NOT happen <<<<==== !!!\n" );
        }//if
        
        
        expectedExceptionOccured = false;
        try {
            someHand = new Hand( (Card[])( null ) );
        }catch( final AssertionError | IllegalArgumentException ex ){
            expectedExceptionOccured = true;
        }//try
        if( expectedExceptionOccured ){
            System.out.printf( "expected reaction happened\n" );
        }else{
            System.out.printf(
                "%s  %s\n",
                Arrays.toString( someHand.getHandCards() ),
                someHand.isSuited()  ?  "SUITED"  :  "NON suited"
            );
            System.out.printf( "expected reaction did NOT happen <<<<==== !!!\n" );
        }//if
        
        
        expectedExceptionOccured = false;
        try {
            someHand = new Hand( (Card)( null ) );
        }catch( final AssertionError | IllegalArgumentException ex ){
            expectedExceptionOccured = true;
        }//try
        if( expectedExceptionOccured ){
            System.out.printf( "expected reaction happened\n" );
        }else{
            System.out.printf(
                "%s  %s\n",
                Arrays.toString( someHand.getHandCards() ),
                someHand.isSuited()  ?  "SUITED"  :  "NON suited"
            );
            System.out.printf( "expected reaction did NOT happen <<<<==== !!!\n" );
        }//if
        
        
        
        expectedExceptionOccured = false;
        try {
            someHand = new Hand( HQ, null, DJ );
        }catch( final AssertionError | IllegalArgumentException ex ){
            expectedExceptionOccured = true;
        }//try
        if( expectedExceptionOccured ){
            System.out.printf( "expected reaction happened\n" );
        }else{
            System.out.printf(
                "%s  %s\n",
                Arrays.toString( someHand.getHandCards() ),
                someHand.isSuited()  ?  "SUITED"  :  "NON suited"
            );
            System.out.printf( "expected reaction did NOT happen <<<<==== !!!\n" );
        }//if
        
        
        
        System.out.printf( "\n\n" );
        System.out.printf( "END OF GIVEN TESTs\n" );
        System.out.printf( "-------------------------------------------------------------------------------\n" );
        System.out.printf( "OPTIONAL TESTs  from Student(s)\n" );
        System.out.printf( "\n\n" );
        */                                                                      // <- muss weg
        //###
        //###   Oberhalb dieser Position sind KEINE Änderungen am Code erlaubt.
        //###   Bei der Abgabe müssen die oberen Zeilen im Original-Zustand sein.
        //###   Während der Entwicklung wäre ein kurzzeitiges (teilweises) Auskommentieren,
        //###   das vor der Abgabe rückgängig gemacht wird,  erlaubt.
        //###
        //###-------------------------------------------------------------------
        //###
        //###   Ab HIER dürfen Sie gerne eigene Tests ergänzen
        //###
        //###                    VVVV
        //###                    VVVV
        //###                    VVVV
        //###   VVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVV
        //###      VVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVV
        //###         VVVVVVVVVVVVVVVVVVVVVVVVVV
        //###            VVVVVVVVVVVVVVVVVVVV
        //###               VVVVVVVVVVVVVV
        //###                  VVVVVVVV
        //###                     VV
        
        
        
        // HHH      HHH   III   EEEEEEEEEEEE   RRRRRRRRRRR          <<<                                  !!!
        // HHH      HHH   III   EEEEEEEEEEEE   RRRRRRRRRRRR        <<<                                   !!!
        // HHH      HHH   III   EEE            RRR      RRR       <<<                                    !!!
        // HHH      HHH   III   EEE            RRR      RRR      <<<                                     !!!
        // HHHHHHHHHHHH   III   EEEEEEEEEEEE   RRRRRRRRRRR      <<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<     !!!
        // HHHHHHHHHHHH   III   EEEEEEEEEEEE   RRRRRRRRRR       <<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<     !!!
        // HHH      HHH   III   EEE            RRR   RRR         <<<                                     !!!
        // HHH      HHH   III   EEE            RRR    RRR         <<<
        // HHH      HHH   III   EEEEEEEEEEEE   RRR     RRR         <<<                                   !!!
        // HHH      HHH   III   EEEEEEEEEEEE   RRR      RRR         <<<                                  !!!
        //
        //
        // Fügen Sie hier Ihre zusätzlichen Tests ein
        // bzw. ersetzen Sie diesen Kommentar durch Ihren Code.
        
        
        
        //^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^
        System.out.printf( "\n\n\n" );
        System.out.printf( "THE END" );
        System.out.flush();
    }//method()
    
    
    
    // Hilfsmethode als Angebot
    public void printlnCards( final Card... cards ){
        System.out.println( Arrays.toString( cards ) );
    }//method()
    
}//class
