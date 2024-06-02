package inheritanceDemo;


import java.util.Objects;


/**
 * Sinnbefreite Test-Klasse um Vererbung zu ueben
 * 
 * @author   Michael Schaefers 
 * @version  2015/11/09
 */
public class K {
    
    private int i;
    private String s;
    
    
    
    /**
     * ...
     */
    public K( int i, String s ){
        this.i = i;
        this.s = s;
    }//constructor()
    
    /**
     * ...
     */
    public K( int i ){
        this( i, "k-" );
    }//constructor()
    
    /**
     * ...
     */
    public K(){
        this( 0 );
    }//constructor()
    
    
    
    @Override
    public String toString(){
        return(
            String.format(
                "[<%s>: i=%d, s=%s]",
                K.class.getSimpleName(),
                i,
                s
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
        final K other = (K)( otherObject );
        // Vergleich der Attribute
        if( i!=other.i )  return false;
        if( ! Objects.equals( s, other.s ))  return false;
      //if(( s!=other.s )  &&  (( null==s ) || ( ! s.equals( other.s ))))  return false;        // Alternative fuer "if( ! Objects.equals..."
        return true;                                            // fertig/equal, da KEINE "Erbmasse"
    }//method()
    
    @Override
    public int hashCode(){
        // Koennen wir (noch) nicht
        return 0;                                               // die SCHLECHTESTE(!) "korrekte" Loesung als Workaround fuer Unkenntnis
    }//method()
    
}//class
