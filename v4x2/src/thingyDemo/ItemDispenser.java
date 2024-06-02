package thingyDemo;


import stuffBeginnersDontHaveToUnderstand.Version;
import thingy.Item;
import thingy.internalThingySupport.RandomBasedThingyGenerator;


/**
 * Die Klasse {@link ItemDispenser} soll beispielhaft den Umgang mit den
 * "Dingen" aus dem thingy-Package demonstrieren.
 *<br />
 * 
 * @author  Michael Schaefers  ([UTF-8]:"Michael Schäfers");
 *          P1@Hamburg-UAS.eu 
 * @version {@value #encodedVersion} 
 */
public class ItemDispenser {
    //
    //--VERSION:-------------------------------#---vvvvvvvvv---vvvv-vv-vv--vv
    //  ========                               #___~version~___YYYY_MM_DD__dd_
    final static private long encodedVersion = 2___00001_002___2024_05_24__01L;
    //-----------------------------------------#---^^^^^-^^^---^^^^-^^-^^--^^
    final static private Version version = new Version( encodedVersion );
    static public String getDecodedVersion(){ return version.getDecodedVersion(); }
    // Obiges (ab VERSION) dient nur der Versionierung
    
    
    
    
    
    private RandomBasedThingyGenerator itemGenerator;
    
    
    
    
    
    /**
     * ...
     */
    public ItemDispenser(){
        itemGenerator = new RandomBasedThingyGenerator();
    }//constructor()
    
    
    
    
    
    /**
     * ...
     * 
     * @return ...
     */
    public Item getSomeItem(){
        return itemGenerator.create();
    }//method()
    
}//class
