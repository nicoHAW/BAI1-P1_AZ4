// This source code is UTF-8 coded - see https://stackoverflow.com/questions/9180981/how-to-support-utf-8-encoding-in-eclipse
// "HOME-VCS": git@git.HAW-Hamburg.de:SHF/Px/LabExercise/CXZ_Thingy[.git]                                 __???__<220609>
package thingyDemo;


import static thingy.Color.*;
import static thingy.Size.*;
import static thingy.Weight.*;
//
import stuffBeginnersDontHaveToUnderstand.Version;
import thingy.*;


/**
 * Die Klasse {@link StarterForThingyDemo2} soll beispielhaft den Umgang mit den
 * "Dingen" aus dem thingy-Package demonstrieren.
 * 
 * @author  Michael Schaefers  ([UTF-8]:"Michael Schäfers");
 *          P1@Hamburg-UAS.eu 
 * @version {@value #encodedVersion} 
 */
public class StarterForThingyDemo2 {
    //
    //--VERSION:-------------------------------#---vvvvvvvvv---vvvv-vv-vv--vv
    //  ========                               #___~version~___YYYY_MM_DD__dd_
    final static private long encodedVersion = 2___00001_005___2024_05_24__01L;
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
        
        System.out.printf( "Gegenwärtig gibt es:\n" );
        System.out.printf( "  %20d Farben (color)\n",  Color.values().length );
        System.out.printf( "  %20d unterschiedliche Größen (size)\n",  Size.values().length );
        System.out.printf( "  18446744073709551616 unterschiedliche \"Item-Werte\" (value)\n" );
        System.out.printf( "  %20d unterschiedliche \"Gewichtsklassen\" (weight)\n",  Weight.values().length );
        System.out.printf( "\n\n\n" );
        
        /*scope*/{
            // 4 Items geben lassen
            System.out.printf( "4 Items geben lassen\n" );
            final ItemDispenser itemSource = new ItemDispenser();
            for( int i=0; i<4; i++ ) {
                final Item item = itemSource.getSomeItem();
                System.out.printf( "%s\n",  item );
            }
            //
            System.out.printf( "\n\n\n" );
        }//scope
        
        /*scope*/{
            // Solange Items geben lassen bis 2 "GIANT" Items vorliegen
            System.out.printf( "Solange Items geben lassen bis 2 \"GIANT\" Items vorliegen\n" );
            int count = 0;
            final ItemDispenser itemSource = new ItemDispenser();
            do {
                final Item item = itemSource.getSomeItem();
                System.out.printf( "%s\n",  item );
                if( GIANT == item.getSize() )  count++;
            }while( 2 > count );
            //
            System.out.printf( "\n\n\n" );
        }//scope
        
        /*scope*/{
            // Solange Items geben lassen bis 3 "LIGHT" Items vorliegen
            System.out.printf( "Solange Items geben lassen bis 3 \"LIGHT\" Items vorliegen\n" );
            int count = 0;
            final ItemDispenser itemSource = new ItemDispenser();
            do {
                final Item item = itemSource.getSomeItem();
                System.out.printf( "%s\n",  item );
                if( LIGHT == item.getWeight() )  count++;
            }while( 3 > count );
            //
            System.out.printf( "\n\n\n" );
        }//scope
        
        /*scope*/{
            // Solange Items geben lassen bis eines eine der Farben Blau, Gelb, Grün, oder Rot aufweist
            System.out.printf( "Solange Items geben lassen bis eines eine der Farben Blau, Gelb, Grün, oder Rot aufweist\n" );
            final ItemDispenser itemSource = new ItemDispenser();
            Item item;
            do {
                item = itemSource.getSomeItem();
                System.out.printf( "%s\n",  item );
            }while( item.getColor() != BLUE
                &&  item.getColor() != GREEN
                &&  item.getColor() != RED
                &&  item.getColor() != YELLOW
            );
            //
            System.out.printf( "\n\n\n" );
        }//scope
        
        /*scope*/{
            // Solange Items geben lassen bis eines mehr als 10 wert ist
            System.out.printf( "Solange Items geben lassen bis eines mehr als 10 wert ist\n" );
            final ItemDispenser itemSource = new ItemDispenser();
            Item item;
            do {
                item = itemSource.getSomeItem();
                System.out.printf( "%s\n",  item );
            }while( 10 >= item.getValue() );
            //
            System.out.printf( "\n\n\n" );
        }//scope
        
    }//method()
    
}//class
