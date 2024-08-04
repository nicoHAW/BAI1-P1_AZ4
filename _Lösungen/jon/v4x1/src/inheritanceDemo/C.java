package inheritanceDemo;


/**
 * Sinnbefreite Test-Klasse um Vererbung zu ueben
 * 
 * @author   Michael Schaefers 
 * @version  2015/11/09
 */
public class C extends B {
    
    public final String ov = "Objekt-(spezifische) Variable von C";             // ov ::= Object (specific) Variable
    
    
    
    @Override
    public String toString(){
        return( "Ich bin ein C" );
    }//method()
    
}//class
