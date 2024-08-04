//"HOME-VCS": git@git.HAW-Hamburg.de:SHF/Px/LabExercise/CXZ_Thingy[.git]
package thingy.internalThingySupport;


import java.io.Serializable;
import stuffBeginnersDontHaveToUnderstand.random.RandomBasedOnPRBS64;
import stuffBeginnersDontHaveToUnderstand.random.RandomBasedOnUtilRandom;
import stuffBeginnersDontHaveToUnderstand.random.RandomGenerator;
import stuffBeginnersDontHaveToUnderstand.Version;
import thingy.Color;
import thingy.Item;
import thingy.Size;
import thingy.Weight;


/**
 * Die Klasse RandomBasedThingyGenerator erlaubt es mittels der Methode create()
 * zufällige Items zu generieren.
 *<br />
 * 
 * @author  Michael Schaefers  ([UTF-8]:"Michael Schäfers");
 *          P1@Hamburg-UAS.eu 
 * @version {@value #encodedVersion} 
 */
public class RandomBasedThingyGenerator implements Serializable {
    //
    //--VERSION:-------------------------------#---vvvvvvvvv---vvvv-vv-vv--vv
    //  ========                               #___~version~___YYYY_MM_DD__dd_
    final static private long encodedVersion = 2___00001_004___2023_04_24__01L;
    //-----------------------------------------#---^^^^^-^^^---^^^^-^^-^^--^^
    final static private Version version = new Version( encodedVersion );
    static public String getDecodedVersion(){ return version.getDecodedVersion(); }
    // Obiges (ab VERSION) dient nur der Versionierung
    //
    private static final long serialVersionUID = version.getEncodedVersion();
    
    
    
    
    
    static final private int numberOfColors = Color.values().length;
    static final private int numberOfSizes = Size.values().length;
    static final private int numberOfWeights = Weight.values().length;
    
    
    
    
    
    private final boolean useFullRangeLongRandom;
    private final RandomBasedOnPRBS64 fullRangeLongRandom;
    private final RandomGenerator randomGenerator;
    private final int maxValue;
    
    
    
    
    
    /**
     * ...
     * 
     * @param maxValue ...
     */
    public RandomBasedThingyGenerator( final int maxValue ){
        if( 0>maxValue ) {
            if( Integer.MIN_VALUE != maxValue ){
                throw new IllegalArgumentException( "maxValue has to be actually positiv" );
            }else{
                // "secret easter egg", configure to use full range of long ( without 0 )
                useFullRangeLongRandom = true;
                fullRangeLongRandom = new RandomBasedOnPRBS64( 0xAA55_EE33__5AA5_77CCL );
            }//if
        }else{
            useFullRangeLongRandom = false;
            fullRangeLongRandom = null;
        }//if
        randomGenerator = new RandomBasedOnUtilRandom();
        this.maxValue = maxValue;
    }//constructor()
    //
    /**
     * ...
     */
    public RandomBasedThingyGenerator(){
        this( 1_000_000_000 );
    }//constructor()
    
    
    
    
    
    /**
     * Die Methode create() generiert ein zufälliges Item.
     * Der Wert (value) des erzeugten Items liegt im zuvor im Konstruktor definierten Bereich.
     * 
     * @return zufällig generiertes Item
     */
    public Item create(){
        final Color randomGeneratedColor = Color.values()[ randomGenerator.nextInt( numberOfColors ) ];     // any color
        final Size randomGeneratedSize = Size.values()[ randomGenerator.nextInt( numberOfSizes ) ];         // any size
        final Weight randomGeneratedWeight = Weight.values()[ randomGenerator.nextInt( numberOfWeights ) ]; // any weight
        final Long ramdonGeneratedValue =
           useFullRangeLongRandom
           ? fullRangeLongRandom.nextLong()                                     // long in full range
           : (long)( randomGenerator.nextInt( maxValue ));                      // long in limited range
        final Item randomGeneratedItem = new Item( randomGeneratedColor, randomGeneratedSize, randomGeneratedWeight, ramdonGeneratedValue );
        return randomGeneratedItem;
    }//method()
    //
    /**
     * Eine create()-Methoden-Variante.
     * Die Methode create() generiert ein zufälliges Item.
     * Der Wert (value) des erzeugten Items liegt im als Parameter übergebenen Wertebereich.
     * 
     * @param predefinedRandomValues  array of predefined values - one representative will be chosen at random
     * @return zufällig generiertes Item
     */
    public Item create( final Long[] predefinedRandomValues ){
        assert null != predefinedRandomValues : "Illegal Argument : null NOT supported";
        assert 1 <= predefinedRandomValues.length : "Illegal Argument : at least one value is necessary";
        
        final Color randomGeneratedColor = Color.values()[ randomGenerator.nextInt( numberOfColors ) ];     // any color
        final Size randomGeneratedSize = Size.values()[ randomGenerator.nextInt( numberOfSizes ) ];         // any size
        final Weight randomGeneratedWeight = Weight.values()[ randomGenerator.nextInt( numberOfWeights ) ]; // any weight
        final Long ramdonGeneratedValue = predefinedRandomValues[ randomGenerator.nextInt( predefinedRandomValues.length ) ];           // long in given codomain
        final Item randomGeneratedItem = new Item( randomGeneratedColor, randomGeneratedSize, randomGeneratedWeight, ramdonGeneratedValue );
        return randomGeneratedItem;
    }//method()
    
}//class
