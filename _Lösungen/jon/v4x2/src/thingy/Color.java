// This source code is UTF-8 coded - see https://stackoverflow.com/questions/9180981/how-to-support-utf-8-encoding-in-eclipse
// "HOME-VCS": git@git.HAW-Hamburg.de:SHF/Px/LabExercise/CXZ_Thingy[.git]
package thingy;


import stuffBeginnersDontHaveToUnderstand.Version;


/**
 * Der enum Color beschreibt die Farbe eines Items.
 *<br />
 * 
 * @author  Michael Schaefers  ([UTF-8]:"Michael Schäfers");
 *          P1@Hamburg-UAS.eu 
 * @version {@value #encodedVersion} 
 */
public enum Color {
    
    AERO, ALABASTER, AMBER, APRICOT, AQUA, AVOCADO, AZURE,
    BEIGE, BISQUE, BLACK, BLUE, BRONZE, BROWN, BURGUNDY,
    CAMEL, CANARY, CORAL, CYAN,
    DRAB,
    EBB, EBONY, ECRU, EMERALD, EUCALYPTUS, EUNRY, EUXANTH,
    FLAX, FUCHSIA,
    GOLD, GRAY, GREEN,
    HAMI, HONEYDEW,
    ICTERINE, INFEZ, IVORY,
    JADE, JALAPENO, JANNA, JASMINE, JONQUIL,
    KOBE, KOBI,
    LEMON, LINEN,
    MAGENTA, MANDARIN, MANGO, MELON, MINT,
    NANDOR, NAPA, NICKEL, NEMO, NEON, NISEMURASAKI, NYANZA,
    OLIVE, ONYX, ORANGE,
    PINK, PURPLE,
    QUARTILE, QUASAR, QUILTED, QUINCE, QUINCY, QUONDONG,
    RED, ROSE, RUST,
    SAND, SILVER,
    TAN, TEAL, TOMATO, TURQUOISE, TUSCAN,
    UBE, UMBER,
    VANILLA, VIOLET,
    WHEAT, WHITE,
    XANTHIC, XANTHOUS, XIKETIC, XOTIC,
    YAM, YAMABUKICHA, YANAGICHA, YANAGINEZUMI, YANAGISUSUTAKE, YANAGIZOME, YASNA, YELLOW, YEN, YUCCA, YUMA,
    ZAFFRE, ZOMP;
    /* see: www.color-meanings.com
     * Sollten Sie meinen, das eine unverzichtbare Farbe fehlt,
     * geben Sie bitte Rückmeldung.
     * Ich nehme dann die jeweilige Farbe auf.
     * :-)
     */
    
    
    
    
    
    // Das Folgende dient nur der Versionierung:
    //--VERSION:-------------------------------#---vvvvvvvvv---vvvv-vv-vv--vv
    //  ========                               #___~version~___YYYY_MM_DD__dd_
    final static private long encodedVersion = 2___00001_004___2023_04_24__01L;
    //-----------------------------------------#---^^^^^-^^^---^^^^-^^-^^--^^
    final static private Version version = new Version( encodedVersion );
    static public String getDecodedVersion(){ return version.getDecodedVersion(); }
    //
    //Note: Enums are automatically serializable and shall NOT contain serialVersionUID
}//enum
