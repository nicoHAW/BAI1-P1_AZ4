// This source code is UTF-8 coded - see https://stackoverflow.com/questions/9180981/how-to-support-utf-8-encoding-in-eclipse
package inheritanceDemo;


import stuffBeginnersDontHaveToUnderstand.Version;


/**
 * {@link TestFrameAndStarter1} for Demo 
 *
 * @author  Michael Schaefers  ([UTF-8]:"Michael Schäfers");
 *          P1@Hamburg-UAS.eu 
 * @version {@value #encodedVersion} 
 */
public class TestFrameAndStarter1 {
    //
    //--VERSION:-------------------------------#---vvvvvvvvv---vvvv-vv-vv--vv
    //  ========                               #___~version~___YYYY_MM_DD__dd_
    final static private long encodedVersion = 2___00001_003___2023_04_24__01L;
    //-----------------------------------------#---^^^^^-^^^---^^^^-^^-^^--^^
    final static private Version version = new Version( encodedVersion );
    static public String getDecodedVersion(){ return version.getDecodedVersion(); }
    // Obiges (ab VERSION) dient nur der Versionierung
    
    
    
    
    
    /**
     * Die Methode {@link #main()} startet die Demo.
     * 
     * @param unused wird nicht genutzt, aber "von Java eingefordert".
     */
    @SuppressWarnings("static-access")
    public static void main( final String... unused ){
        /*scope*/{
            System.out.printf( "do test with R\n" );
            System.out.printf( "==============\n" );
            System.out.printf( "\n" );
            
            System.out.printf( "R.cv    -> %s\n",  R.cv ); //r  //Klassen-(spezifische) Variable von R
            System.out.printf( "R.cm()  -> " );    R.cm(); //r  //Klassen-(spezifische) Methode von R
            
            final R r = new R();
            System.out.printf( "r.ov    -> %s\n",  r.ov ); //r  //Objekt-(spezifische) Variable von R
            System.out.printf( "r.om()  -> " );    r.om(); //r  //Objekt-(spezifische) Methode von R
            System.out.printf( "r       -> %s\n",  r ); //r  //Ich bin ein R
            System.out.printf( "\n" );
            
            System.out.printf( "r.getClass()                 -> %s\n",  r.getClass() ); //r  //class inheritanceDemo.R
            System.out.printf( "r.getClass().getSimpleName() -> %s\n",  r.getClass().getSimpleName() ); //r  //R
        }//scope
        System.out.printf( "\n\n\n" );
        
        
        
        
        
        /*scope*/{
            System.out.printf( "do test with B\n" );
            System.out.printf( "==============\n" );
            System.out.printf( "\n" );
            
            System.out.printf( "B.cv    -> %s\n",  B.cv ); //r  //Klassen-(spezifische) Variable von B
            System.out.printf( "B.cm()  -> " );    B.cm(); //r  //Klassen-(spezifische) Methode von R
            
            final B b = new B();
            System.out.printf( "b.ov    -> %s\n",  b.ov ); //r  //Objekt-(spezifische) Variable von R
            System.out.printf( "b.om()  -> " );    b.om(); //r  //Objekt-(spezifische) Methode von R
            System.out.printf( "b       -> %s\n",  b ); //r  //Ich bin ein B
            System.out.printf( "\n" );
            
            System.out.printf( "b.getClass()                 -> %s\n",  b.getClass() ); //r  //class inheritanceDemo.B
            System.out.printf( "b.getClass().getSimpleName() -> %s\n",  b.getClass().getSimpleName() ); //r  //B
        }//scope
        System.out.printf( "\n\n\n" );
        
        
        
        
        
        /*scope*/{
            System.out.printf( "do test with C\n" );
            System.out.printf( "==============\n" );
            System.out.printf( "\n" );
            
            System.out.printf( "C.cv    -> %s\n",  C.cv ); //r  //Klassen-(spezifische) Variable von B
            System.out.printf( "C.cm()  -> " );    C.cm(); //r  //Klassen-(spezifische) Methode von R
            
            final C c = new C();
            System.out.printf( "c.ov    -> %s\n",  c.ov ); //r  //Objekt-(spezifische) Variable von C
            System.out.printf( "c.om()  -> " );    c.om(); //r  //Objekt-(spezifische) Methode von R
            System.out.printf( "c       -> %s\n",  c ); //r  //Ich bin ein C
            System.out.printf( "\n" );
            
            System.out.printf( "c.getClass()                 -> %s\n",  c.getClass() ); //r  //class inheritanceDemo.C
            System.out.printf( "c.getClass().getSimpleName() -> %s\n",  c.getClass().getSimpleName() ); //r  //C
        }//scope
        System.out.printf( "\n\n\n" );
        
        
        
        
        
        /*scope*/{
            System.out.printf( "do test with D\n" );
            System.out.printf( "==============\n" );
            System.out.printf( "\n" );
            
            System.out.printf( "D.cv    -> %s\n",  D.cv ); //r  //Klassen-(spezifische) Variable von B
            System.out.printf( "D.cm()  -> " );    D.cm(); //r  //Klassen-(spezifische) Methode von D
            
            final D d = new D();
            System.out.printf( "d.ov    -> %s\n",  d.ov ); //r  //Objekt-(spezifische) Variable von C
            System.out.printf( "d.om()  -> " );    d.om(); //r  //Objekt-(spezifische) Methode von R
            System.out.printf( "d       -> %s\n",  d ); //r  //Ich bin ein D
            System.out.printf( "\n" );
            
            System.out.printf( "d.getClass()                 -> %s\n",  d.getClass() );
            System.out.printf( "d.getClass().getSimpleName() -> %s\n",  d.getClass().getSimpleName() );
        }//scope
        System.out.printf( "\n\n\n" );
        
        
        
        
        
        /*scope*/{
            System.out.printf( "do test with E\n" );
            System.out.printf( "==============\n" );
            System.out.printf( "\n" );
            
            System.out.printf( "E.cv    -> %s\n",  E.cv ); //r  //Klassen-(spezifische) Variable von B
            System.out.printf( "E.cm()  -> " );    E.cm(); //r  //Klassen-(spezifische) Methode von D
            
            final E e = new E();
            System.out.printf( "e.ov    -> %s\n",  e.ov ); //r  //Objekt-(spezifische) Variable von C
            System.out.printf( "e.om()  -> " );    e.om(); //r  //Objekt-(spezifische) Methode von E
            System.out.printf( "e       -> %s\n",  e ); //r  //Ich bin ein E
            System.out.printf( "\n" );
            
            System.out.printf( "e.getClass()                 -> %s\n",  e.getClass() );
            System.out.printf( "e.getClass().getSimpleName() -> %s\n",  e.getClass().getSimpleName() );
        }//scope
        System.out.printf( "\n\n\n" );
        
        
        
        
        
        /*scope*/{
            System.out.printf( "do test with F\n" );
            System.out.printf( "==============\n" );
            System.out.printf( "\n" );
            
            System.out.printf( "F.cv    -> %s\n",  F.cv ); //r  //Klassen-(spezifische) Variable von F
            System.out.printf( "F.cm()  -> " );    F.cm(); //r  //Klassen-(spezifische) Methode von D
            
            final F f = new F();
            System.out.printf( "f.ov    -> %s\n",  f.ov ); //r  //Objekt-(spezifische) Variable von C
            System.out.printf( "f.om()  -> " );    f.om(); //r  //Objekt-(spezifische) Methode von E
            System.out.printf( "f       -> %s\n",  f ); //r  //Ich bin ein F
            System.out.printf( "\n" );
            
            System.out.printf( "f.getClass()                 -> %s\n",  f.getClass() );
            System.out.printf( "f.getClass().getSimpleName() -> %s\n",  f.getClass().getSimpleName() );
        }//scope
        System.out.printf( "\n\n\n" );
        
        
        
        
        
        /*scope*/{
            System.out.printf( "do test with X\n" );
            System.out.printf( "==============\n" );
            System.out.printf( "\n" );
            
            System.out.printf( "X.cv    -> %s\n",  X.cv ); //r  //Klassen-(spezifische) Variable von X
            System.out.printf( "X.cm()  -> " );    X.cm(); //r  //Klassen-(spezifische) Methode von X
            
            final X x = new X();
            System.out.printf( "x.ov    -> %s\n",  x.ov ); //r  //Objekt-(spezifische) Variable von X
            System.out.printf( "x.om()  -> " );    x.om(); //r  //Objekt-(spezifische) Methode von X
            System.out.printf( "x       -> %s\n",  x ); //r  //Ich bin ein X
            System.out.printf( "\n" );
            
            System.out.printf( "x.getClass()                 -> %s\n",  x.getClass() );
            System.out.printf( "x.getClass().getSimpleName() -> %s\n",  x.getClass().getSimpleName() );
        }//scope
        System.out.printf( "\n\n\n" );
        
        
        
        
        
        /*scope*/{
            System.out.printf( "do test with Y\n" );
            System.out.printf( "==============\n" );
            System.out.printf( "\n" );
            
            System.out.printf( "Y.cv    -> %s\n",  Y.cv ); //r  //Klassen-(spezifische) Variable von Y
            System.out.printf( "Y.cm()  -> " );    Y.cm(); //r  //Klassen-(spezifische) Methode von Y
            
            final Y y = new Y();
            System.out.printf( "y.ov    -> %s\n",  y.ov ); //r  //Objekt-(spezifische) Variable von Y
            System.out.printf( "y.om()  -> " );    y.om(); //r  //Objekt-(spezifische) Methode von Y
            System.out.printf( "y       -> %s\n",  y ); //r  //Ich bin ein Y
            System.out.printf( "\n" );
            
            System.out.printf( "y.getClass()                 -> %s\n",  y.getClass() );
            System.out.printf( "y.getClass().getSimpleName() -> %s\n",  y.getClass().getSimpleName() );
        }//scope
        System.out.printf( "\n\n\n" );
        
        
        
        
        
        /*scope*/{
            System.out.printf( "do test with Z\n" );
            System.out.printf( "==============\n" );
            System.out.printf( "\n" );
            
            System.out.printf( "Z.cv    -> %s\n",  Z.cv ); //r  //Klassen-(spezifische) Variable von Z
            System.out.printf( "Z.cm()  -> " );    Z.cm(); //r  //Klassen-(spezifische) Methode von Z
            
            final Z z = new Z();
            System.out.printf( "z.ov    -> %s\n",  z.ov ); //r  //Objekt-(spezifische) Variable von Z
            System.out.printf( "z.om()  -> " );    z.om(); //r  //Objekt-(spezifische) Methode von Z
            System.out.printf( "z       -> %s\n",  z ); //r  //Ich bin ein Z
            System.out.printf( "\n" );
            
            System.out.printf( "z.getClass()                 -> %s\n",  z.getClass() );
            System.out.printf( "z.getClass().getSimpleName() -> %s\n",  z.getClass().getSimpleName() );
        }//scope
        System.out.printf( "\n\n\n\n\n" );
        
        
        
        
        
        /*scope*/{
            System.out.printf( "do test with I & A\n" );
            System.out.printf( "==================\n" );
            System.out.printf( "\n" );
            
            System.out.printf( "I.class                      -> %s\n",  I.class ); //r  //interface inheritanceDemo.I
            System.out.printf( "A.class                      -> %s\n",  A.class ); //r  //class inheritanceDemo.A
            System.out.printf( "I.class.getSimpleName()      -> %s\n",  I.class.getSimpleName() ); //r  //I
            System.out.printf( "A.class.getSimpleName()      -> %s\n",  A.class.getSimpleName() ); //r  //A
            System.out.printf( "\n" );
            
            final A a = new Z(); //weil Z A extended, können wir ein Z einem A zuweisen, die Funktionalität wäre dann auf die Eigenschaften des A's beschränkt
            final I i = a; //weil A unser Interface implementiert, können wir einem I ein A zuweisen
            System.out.printf( "i.om()  -> " );    i.om(); //r  //Objekt-(spezifische) Methode von Z
            System.out.printf( "i       -> %s\n",  i ); //r  //Ich bin ein Z
            System.out.printf( "\n" );
            System.out.printf( "a.ov    -> %s\n",  a.ov ); //r  //Objekt-(spezifische) Variable von A                      // yes, static fields shall not be accessed in a dynamic way(!), BUT it's a demo
            System.out.printf( "a.om()  -> " );    a.om(); //r  //Objekt-(spezifische) Methode von Z
            System.out.printf( "a       -> %s\n",  a ); //r  //Ich bin ein Z
            System.out.printf( "\n" );
            
            System.out.printf( "i.getClass()                 -> %s\n",  i.getClass() ); //r  //class inheritanceDemo.Z
            System.out.printf( "i.getClass().getSimpleName() -> %s\n",  i.getClass().getSimpleName() ); //r  //Z
            System.out.printf( "a.getClass()                 -> %s\n",  a.getClass() ); //r  //class inheritanceDemo.Z
            System.out.printf( "a.getClass().getSimpleName() -> %s\n",  a.getClass().getSimpleName() ); //r  //Z
        }//scope
        System.out.printf( "\n\n\n\n\n" );
        
        
        
        
        
        /*scope*/{
            System.out.printf( "do further test with I & A\n" );
            System.out.printf( "==========================\n" );
            System.out.printf( "\n" );
            
            final R r = new F();
            final A a = r;
            final I i = a;
            System.out.printf( "i.om()      -> " );    i.om(); //r  //Objekt-(spezifische) Methode von E
            System.out.printf( "a.om()      -> " );    a.om(); //r  //Objekt-(spezifische) Methode von E
            System.out.printf( "r.om()      -> " );    r.om(); //r  //Objekt-(spezifische) Methode von E
            System.out.printf( "\n" );
            System.out.printf( "a.ov        -> %s\n",  a.ov ); //r  //Objekt-(spezifische) Variable von A                 // yes, static fields shall not be accessed in a dynamic way(!), BUT it's a demo
            System.out.printf( "r.ov        -> %s\n",  r.ov ); //r  //Objekt-(spezifische) Variable von R
            System.out.printf( "\n" );
            System.out.printf( "((A)i).ov   -> %s\n",  ((A)i).ov ); //r  //Objekt-(spezifische) Variable von A            // yes, static fields shall not be accessed in a dynamic way(!), BUT it's a demo
            System.out.printf( "((R)i).ov   -> %s\n",  ((R)i).ov ); //r  //Objekt-(spezifische) Variable von R
            System.out.printf( "((B)i).ov   -> %s\n",  ((B)i).ov ); //r  //Objekt-(spezifische) Variable von R
            System.out.printf( "((C)i).ov   -> %s\n",  ((C)i).ov ); //r  //Objekt-(spezifische) Variable von C
            System.out.printf( "((D)i).ov   -> %s\n",  ((D)i).ov ); //r  //Objekt-(spezifische) Variable von C
            System.out.printf( "((E)i).ov   -> %s\n",  ((E)i).ov ); //r  //Objekt-(spezifische) Variable von C
            System.out.printf( "((F)i).ov   -> %s\n",  ((F)i).ov ); //r  //Objekt-(spezifische) Variable von C
            System.out.printf( "\n" );
            System.out.printf( "((I)i).om() -> " );    ((I)i).om(); //r  //Objekt-(spezifische) Methode von E
            System.out.printf( "((A)i).om() -> " );    ((A)i).om(); //r  //Objekt-(spezifische) Methode von E
            System.out.printf( "((R)i).om() -> " );    ((R)i).om(); //r  //Objekt-(spezifische) Methode von E
            System.out.printf( "((B)i).om() -> " );    ((B)i).om(); //r  //Objekt-(spezifische) Methode von E
            System.out.printf( "((C)i).om() -> " );    ((C)i).om(); //r  //Objekt-(spezifische) Methode von E
            System.out.printf( "((D)i).om() -> " );    ((D)i).om(); //r  //Objekt-(spezifische) Methode von E
            System.out.printf( "((E)i).om() -> " );    ((E)i).om(); //r  //Objekt-(spezifische) Methode von E
            System.out.printf( "((F)i).om() -> " );    ((F)i).om(); //r  //Objekt-(spezifische) Methode von E
        }//scope
    }//method()
    
}//class