package inheritanceDemo;


/**
 * Sinnbefreite Test-Klasse um Vererbung zu ueben
 * 
 * @author   Michael Schaefers 
 * @version  2015/11/09
 */
public class D extends C {
    
    public static void cm(){                                                    // cm ::= Class (specific) Method
        System.out.println( "Klassen-(spezifische) Methode von D" );
    }//method()
    
    @Override
    public String toString(){
        return( "Ich bin ein D" );
    }//method()
    
}//class