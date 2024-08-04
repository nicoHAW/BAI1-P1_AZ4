package inheritanceDemo;


/**
 * Sinnbefreite Test-Klasse um Vererbung zu ueben
 * 
 * @author   Michael Schaefers 
 * @version  2015/11/10
 */
public class M extends L {
    
    /**
     * ...
     */
    public M( int i, String s ){
        super( i, s );
    }//constructor()
    
    /**
     * ...
     */
    public M( int i ){
        this( i, "m-" );
    }//constructor()
    
    /**
     * ...
     */
    public M(){
        this( 0 );
    }//constructor()
    
    
    
    @Override
    public String toString(){
        return(
            String.format(
                "[<%s>: %s]",
                M.class.getSimpleName(),
                super.toString()
            )
        );
    }//method()
    
    
    
    
    
    // Das Folgende koennen wir noch nicht
    @Override
    public boolean equals( final Object otherObject ){
        if( this==otherObject )  return true;                   // beide Objekte identisch?
        if( null==otherObject )  return false;                  // existiert other?
        if( getClass()!=otherObject.getClass() )  return false; // Class-Objekte identisch?
        //
        final M other = (M)( otherObject );
        // Vergleich der Attribute
        // ... <- Es gibt keine ;-)
        return super.equals( other );                           // jetzt noch "Erbmasse" pruefen
    }//method()
    
    @Override
    public int hashCode(){
        // Koennen wir (noch) nicht
        return 0;                                               // die SCHLECHTESTE(!) "korrekte" Loesung als Workaround fuer Unkenntnis
    }//method()
    
}//class
