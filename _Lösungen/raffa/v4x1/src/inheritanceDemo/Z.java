package inheritanceDemo;


/**
 * Sinnbefreite Test-Klasse um Vererbung zu ueben
 * 
 * @author   Michael Schaefers 
 * @version  2020/04/21
 */
public class Z extends Y {
    
    static public final String cv = "Klassen-(spezifische) Variable von Z";     // cv ::= Class (specific) Variable
    
    public final String ov = "Objekt-(spezifische) Variable von Z";             // ov ::= Object (specific) Variable
    
    
    
    public static void cm(){                                                    // cm ::= Class (specific) Method
        System.out.println( "Klassen-(spezifische) Methode von Z" );
    }//method()
    
    @Override
    public void om(){                                                           // om ::= Object (specific) Method
        System.out.println( "Objekt-(spezifische) Methode von Z" );
    }//method()
    
    @Override
    public String toString(){
        return( "Ich bin ein Z" );
    }//method()
    
}//class