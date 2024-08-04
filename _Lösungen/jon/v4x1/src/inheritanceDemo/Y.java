package inheritanceDemo;


/**
 * Sinnbefreite Test-Klasse um Vererbung zu ueben
 * 
 * @author   Michael Schaefers 
 * @version  2020/04/21
 */
public class Y extends X {
    
    static public final String cv = "Klassen-(spezifische) Variable von Y";     // cv ::= Class (specific) Variable
    
    public final String ov = "Objekt-(spezifische) Variable von Y";             // ov ::= Object (specific) Variable
    
    
    
    public static void cm(){                                                    // cm ::= Class (specific) Method
        System.out.println( "Klassen-(spezifische) Methode von Y" );
    }//method()
    
    @Override
    public void om(){                                                           // om ::= Object (specific) Method
        System.out.println( "Objekt-(spezifische) Methode von Y" );
    }//method()
    
    @Override
    public String toString(){
        return( "Ich bin ein Y" );
    }//method()
    
}//class
