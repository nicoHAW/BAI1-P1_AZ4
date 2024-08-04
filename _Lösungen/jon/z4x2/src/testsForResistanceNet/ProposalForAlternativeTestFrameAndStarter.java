// This source code is UTF-8 coded - see https://stackoverflow.com/questions/9180981/how-to-support-utf-8-encoding-in-eclipse
package testsForResistanceNet;


/*
import resistanceNet.component.ComposedResistor;
import resistanceNet.component.ParallelResistor;
import resistanceNet.component.Potentiometer;
import resistanceNet.component.Resistor;
import resistanceNet.component.ResistanceNet;
import resistanceNet.component.OrdinaryResistor;
import resistanceNet.component.SeriesResistor;
*/
import stuffBeginnersDontHaveToUnderstand.Version;


/**
 * Alternative TestFrame for Resistance Net - see task
 * 
 * @author  Michael Schaefers  ([UTF-8]:"Michael Schäfers");
 *          Px@Hamburg-UAS.eu
 * @version {@value #encodedVersion}
 */
public class ProposalForAlternativeTestFrameAndStarter {
    //
    //--VERSION:-------------------------------#---vvvvvvvvv---vvvv-vv-vv--vv
    //  ========                               #___~version~___YYYY_MM_DD__dd_
    final static private long encodedVersion = 2___00002_001___2023_05_01__01L;
    //-----------------------------------------#---^^^^^-^^^---^^^^-^^-^^--^^
    final static private Version version = new Version( encodedVersion );
    /**
     * The method {@link #getDecodedVersion()} delivers the code version as reground/readable String.
     * @return version as decoded/readable String.
     */
    static public String getDecodedVersion(){ return version.getDecodedVersion(); }
    // Obiges (ab VERSION) dient nur der Versionierung.
    
    
    
    
    
    
    /**
     * Die Methode {@link #main() testet Ihre Lösung zur Aufgabe ResistanceNet.
     * Diese Methode darf bis zur "Markierung" NICHT geändert werden
     * außer, dass Sie "den Kommentar vor den letzten Statements" entfernen müssen.
     * Wohl aber dürfen Sie am Ende/nach der Markierung eigene Tests ergänzen.
     * 
     * @param unused  is required by Java and NOT intended to be used ;-)
     */
    /* <- Blockkommentar-Markierung muss entfernt werden
    public static void main( final String... unused ){
        int testCnt = 0;
        
        System.out.printf( "Test#%d:\n", ++testCnt );
        {
            final Resistor or1 = new OrdinaryResistor( "R1", 100 );
            final Resistor or2 = new OrdinaryResistor( "R2", 300 );
            
            System.out.printf( "R1: %s\n",  or1 );
            System.out.printf( "R2: %s\n",  or2 );
            System.out.printf( "\n\n" );
            
            
            final ResistanceNet rn1 = or1;
            final ResistanceNet rn2 = or2;
            
            System.out.printf( "RN1: %s\n",  rn1 );
            System.out.printf( "RN2: %s\n",  rn2 );
            System.out.printf( "\n\n" );
            
            
            final ResistanceNet rn11 = new SeriesResistor( or1, or2 );
            final ResistanceNet rn12 = new SeriesResistor( rn1, rn2 );
            final ResistanceNet rn21 = new ParallelResistor( or1, or2 );
            final ResistanceNet rn22 = new ParallelResistor( rn1, rn2 );
            
            System.out.printf( "RN11: #%d ;  %s\n",  rn11.getNumberOfResistors(), rn11 );
            System.out.printf( "RN12: #%d ;  %s\n",  rn12.getNumberOfResistors(), rn12 );
            System.out.printf( "RN21: #%d ;  %s\n",  rn21.getNumberOfResistors(), rn21 );
            System.out.printf( "RN22: #%d ;  %s\n",  rn22.getNumberOfResistors(), rn22 );
            System.out.printf( "\n" );
            System.out.printf( "RN11: %s ;  (%.2f+%.2f)=%6.2f\n",   rn11.getCircuit(),  or1.getResistance(), or2.getResistance(),  rn11.getResistance() );
            System.out.printf( "RN12: %s ;  (%.2f+%.2f)=%6.2f\n",   rn12.getCircuit(),  rn1.getResistance(), rn2.getResistance(),  rn12.getResistance() );
            System.out.printf( "RN21: %s ;  (%.2f|%.2f)=%6.2f\n",   rn21.getCircuit(),  or1.getResistance(), or2.getResistance(),  rn21.getResistance() );
            System.out.printf( "RN22: %s ;  (%.2f|%.2f)=%6.2f\n",   rn22.getCircuit(),  rn1.getResistance(), rn2.getResistance(),  rn22.getResistance() );
        }//scope
        System.out.printf( "\n\n\n\n" );
        
        
        System.out.printf( "Test#%d:\n", ++testCnt );
        {
            final Resistor or1 = new OrdinaryResistor( "R1", 100 );
            final Resistor or2 = new OrdinaryResistor( "R2", 200 );
            final Resistor or3 = new OrdinaryResistor( "R3", 300 );
            final Resistor or4 = new OrdinaryResistor( "R4", 400 );
            final Resistor or5 = new OrdinaryResistor( "R5", 500 );
            final Resistor or6 = new OrdinaryResistor( "R6", 600 );
            
            final ResistanceNet rn =
                new ParallelResistor(
                    new SeriesResistor(
                        new ParallelResistor( or1, or3 ),
                        or2
                    ),
                    new SeriesResistor( or4, or5 ),
                    or6
                );
            System.out.printf(
                "R1: %.2f Ohm,  R2: %.2f Ohm,  R3: %.2f Ohm,  R4: %.2f Ohm,  R5: %.2f Ohm,  R6: %.2f Ohm\n",
                or1.getResistance(),
                or2.getResistance(),
                or3.getResistance(),
                or4.getResistance(),
                or5.getResistance(),
                or6.getResistance()
            );
            System.out.printf( "RN: %s   ->   %.2f Ohm ,  #%d\n",  rn.getCircuit(), rn.getResistance(), rn.getNumberOfResistors() );
        }//scope
        System.out.printf( "\n\n\n\n" );
        
        
        System.out.printf( "Test#%d:\n", ++testCnt );
        {
            final Resistor   or1 = new OrdinaryResistor( "R1", 100 );
            final Resistor   or2 = new OrdinaryResistor( "R2", 200 );
            final Resistor   or3 = new OrdinaryResistor( "R3", 300 );
            final Potentiometer vr4 = new Potentiometer( "R4" );
            final Resistor   vr5 = new Potentiometer( "R5", 500 );
            final Resistor   vr6 = new Potentiometer( "R6", 600 );
            
            final ResistanceNet rn =
                new ParallelResistor(
                    new SeriesResistor(
                        new ParallelResistor( or1, or3 ),
                        or2
                    ),
                    new SeriesResistor( vr4, vr5 ),
                    vr6
                );

            System.out.printf( "RN: %s\n",  rn.getCircuit() );
            for ( int ohm=0; ohm<=4000; ohm+=400 ){
                vr4.setResistance( ohm );
                System.out.printf( "RN: %.2f Ohm bei R4=%7.2f\n",  rn.getResistance(), vr4.getResistance() );
            }//for
            System.out.printf( "\n" );
            
            System.out.printf( "0: %s\n",  rn.getCircuit() );
            printSubNets( (ComposedResistor)( rn ) );
        }//scope
        System.out.printf( "\n\n\n\n" );
        
        
        
        //----------------------------------------------------------------------// "MARKIERUNG" ;-)
        // HHH      HHH   III   EEEEEEEEEEEE   RRRRRRRRRRR          <<<                                  !!!
        // HHH      HHH   III   EEEEEEEEEEEE   RRRRRRRRRRRR        <<<                                   !!!
        // HHH      HHH   III   EEE            RRR      RRR       <<<                                    !!!
        // HHH      HHH   III   EEE            RRR      RRR      <<<                                     !!!
        // HHHHHHHHHHHH   III   EEEEEEEEEEEE   RRRRRRRRRRR      <<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<     !!!
        // HHHHHHHHHHHH   III   EEEEEEEEEEEE   RRRRRRRRRR       <<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<     !!!
        // HHH      HHH   III   EEE            RRR   RRR         <<<                                     !!!
        // HHH      HHH   III   EEE            RRR    RRR         <<<                                    !!!
        // HHH      HHH   III   EEEEEEEEEEEE   RRR     RRR         <<<                                   !!!
        // HHH      HHH   III   EEEEEEEEEEEE   RRR      RRR         <<<                                  !!!
        //
        // Ab hier können Sie eigene Tests ergänzen
        //
        System.out.printf( "Test#%d:\n", ++testCnt );
        {
        }//scope
        
    }//method()
    
    
    
    
    
    private static void printSubNets( final ComposedResistor cr ){
        printSubNets( cr, 1 );
    }//method()
    //
    private static void printSubNets( final ComposedResistor cr,  final int callDepth ){
        if ( null!=cr ){
            for ( ResistanceNet e : cr.getSubNets() ){
                System.out.printf( "%d: ",callDepth );
                for ( int i=callDepth; --i>=0; )  System.out.printf( ">>" );
                System.out.printf( "  %s\n",  e.getCircuit() );
                if ( e instanceof ComposedResistor ){
                    printSubNets( (ComposedResistor)( e ),  callDepth+1 );
                }//if
            }//for
        }//if
    }//method()
    
    Blockkommentar-Markierung muss entfernt werden -> */
 
}//class
