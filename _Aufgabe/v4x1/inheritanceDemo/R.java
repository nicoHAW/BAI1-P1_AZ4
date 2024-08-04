package inheritanceDemo;


/**
 * Sinnbefreite Test-Klasse um Vererbung zu ueben
 * 
 * @author   Michael Schaefers 
 * @version  2020/04/21
 */
public class R extends A {
    
    static public final String cv = "Klassen-(spezifische) Variable von R";     // cv ::= Class (specific) Variable
    
    public final String ov = "Objekt-(spezifische) Variable von R";             // ov ::= Object (specific) Variable
    
    
    
    static public void cm(){                                                    // cm ::= Class (specific) Method
        System.out.println( "Klassen-(spezifische) Methode von R" );
    }//method()
    
    
    @Override
    public void om(){                                                           // om ::= Object (specific) Method
        System.out.println( "Objekt-(spezifische) Methode von R" );
    }//method()
    
    @Override
    public String toString(){
        return( "Ich bin ein R" );
    }//method()
    
}//class
