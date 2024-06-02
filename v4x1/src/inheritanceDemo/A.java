package inheritanceDemo;


/**
 * Sinnbefreite Test-Klasse um Vererbung zu ueben
 * 
 * @author   Michael Schaefers 
 * @version  2015/11/09
 */
public abstract class A implements I {
    
    static public final String ov = "Objekt-(spezifische) Variable von A";      // ov ::= Object (specific) Variable
    
    
    
    @Override
    public String toString(){                                                   // Frage: Macht diese Methode Sinn?
        return( "Ich bin ein A" );
    }//method()
    
}//class