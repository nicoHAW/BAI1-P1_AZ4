package inheritanceDemo;


/**
 * Sinnbefreite Test-Klasse um Vererbung zu ueben
 * 
 * @author   Michael Schaefers 
 * @version  2015/11/09
 */
public class L extends K {
    
    /**
     * ...
     */
    public L( int i, String s ){
        super( i, s );
    }//constructor()
    
    /**
     * ...
     */
    public L( int i ){
        this( i, "l-" );
    }//constructor()
    
    /**
     * ...
     */
    public L(){
        this( 0 );
    }//constructor()
    
    
    
    
    @Override
    public String toString(){
        return(
            String.format(
                "[<%s>: %s]",
                L.class.getSimpleName(),
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
        final L other = (L)( otherObject );
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
