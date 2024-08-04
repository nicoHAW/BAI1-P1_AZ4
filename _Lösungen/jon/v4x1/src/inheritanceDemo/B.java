package inheritanceDemo;


/**
 * Sinnbefreite Test-Klasse um Vererbung zu ueben
 * 
 * @author   Michael Schaefers 
 * @version  2015/11/09
 */
public class B extends R {
    
    static public final String cv = "Klassen-(spezifische) Variable von B";     // cv ::= Class (specific) Variable
    
    
    
    @Override
    public String toString(){
        return( "Ich bin ein B" );
    }//method()
    
}//class