package inheritanceDemo;


/**
 * Sinnbefreite Test-Klasse um Vererbung zu ueben
 * 
 * @author   Michael Schaefers 
 * @version  2015/11/09
 */
public class F extends E {
    
    static public final String cv = "Klassen-(spezifische) Variable von F";     // cv ::= Class (specific) Variable
    
    
    
    @Override
    public String toString(){
        return( "Ich bin ein F" );
    }//method()
    
}//class