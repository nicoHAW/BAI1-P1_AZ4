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
            
            System.out.printf( "R.cv    -> %s\n",  R.cv );
            System.out.printf( "R.cm()  -> " );    R.cm();
            
            final R r = new R();
            System.out.printf( "r.ov    -> %s\n",  r.ov );
            System.out.printf( "r.om()  -> " );    r.om();
            System.out.printf( "r       -> %s\n",  r );
            System.out.printf( "\n" );
            
            System.out.printf( "r.getClass()                 -> %s\n",  r.getClass() );
            System.out.printf( "r.getClass().getSimpleName() -> %s\n",  r.getClass().getSimpleName() );
        }//scope
        System.out.printf( "\n\n\n" );
        
        
        
        
        
        /*scope*/{
            System.out.printf( "do test with B\n" );
            System.out.printf( "==============\n" );
            System.out.printf( "\n" );
            
            System.out.printf( "B.cv    -> %s\n",  B.cv );
            System.out.printf( "B.cm()  -> " );    B.cm();
            
            final B b = new B();
            System.out.printf( "b.ov    -> %s\n",  b.ov );
            System.out.printf( "b.om()  -> " );    b.om();
            System.out.printf( "b       -> %s\n",  b );
            System.out.printf( "\n" );
            
            System.out.printf( "b.getClass()                 -> %s\n",  b.getClass() );
            System.out.printf( "b.getClass().getSimpleName() -> %s\n",  b.getClass().getSimpleName() );
        }//scope
        System.out.printf( "\n\n\n" );
        
        
        
        
        
        /*scope*/{
            System.out.printf( "do test with C\n" );
            System.out.printf( "==============\n" );
            System.out.printf( "\n" );
            
            System.out.printf( "C.cv    -> %s\n",  C.cv );
            System.out.printf( "C.cm()  -> " );    C.cm();
            
            final C c = new C();
            System.out.printf( "c.ov    -> %s\n",  c.ov );
            System.out.printf( "c.om()  -> " );    c.om();
            System.out.printf( "c       -> %s\n",  c );
            System.out.printf( "\n" );
            
            System.out.printf( "c.getClass()                 -> %s\n",  c.getClass() );
            System.out.printf( "c.getClass().getSimpleName() -> %s\n",  c.getClass().getSimpleName() );
        }//scope
        System.out.printf( "\n\n\n" );
        
        
        
        
        
        /*scope*/{
            System.out.printf( "do test with D\n" );
            System.out.printf( "==============\n" );
            System.out.printf( "\n" );
            
            System.out.printf( "D.cv    -> %s\n",  D.cv );
            System.out.printf( "D.cm()  -> " );    D.cm();
            
            final D d = new D();
            System.out.printf( "d.ov    -> %s\n",  d.ov );
            System.out.printf( "d.om()  -> " );    d.om();
            System.out.printf( "d       -> %s\n",  d );
            System.out.printf( "\n" );
            
            System.out.printf( "d.getClass()                 -> %s\n",  d.getClass() );
            System.out.printf( "d.getClass().getSimpleName() -> %s\n",  d.getClass().getSimpleName() );
        }//scope
        System.out.printf( "\n\n\n" );
        
        
        
        
        
        /*scope*/{
            System.out.printf( "do test with E\n" );
            System.out.printf( "==============\n" );
            System.out.printf( "\n" );
            
            System.out.printf( "E.cv    -> %s\n",  E.cv );
            System.out.printf( "E.cm()  -> " );    E.cm();
            
            final E e = new E();
            System.out.printf( "e.ov    -> %s\n",  e.ov );
            System.out.printf( "e.om()  -> " );    e.om();
            System.out.printf( "e       -> %s\n",  e );
            System.out.printf( "\n" );
            
            System.out.printf( "e.getClass()                 -> %s\n",  e.getClass() );
            System.out.printf( "e.getClass().getSimpleName() -> %s\n",  e.getClass().getSimpleName() );
        }//scope
        System.out.printf( "\n\n\n" );
        
        
        
        
        
        /*scope*/{
            System.out.printf( "do test with F\n" );
            System.out.printf( "==============\n" );
            System.out.printf( "\n" );
            
            System.out.printf( "F.cv    -> %s\n",  F.cv );
            System.out.printf( "F.cm()  -> " );    F.cm();
            
            final F f = new F();
            System.out.printf( "f.ov    -> %s\n",  f.ov );
            System.out.printf( "f.om()  -> " );    f.om();
            System.out.printf( "f       -> %s\n",  f );
            System.out.printf( "\n" );
            
            System.out.printf( "f.getClass()                 -> %s\n",  f.getClass() );
            System.out.printf( "f.getClass().getSimpleName() -> %s\n",  f.getClass().getSimpleName() );
        }//scope
        System.out.printf( "\n\n\n" );
        
        
        
        
        
        /*scope*/{
            System.out.printf( "do test with X\n" );
            System.out.printf( "==============\n" );
            System.out.printf( "\n" );
            
            System.out.printf( "X.cv    -> %s\n",  X.cv );
            System.out.printf( "X.cm()  -> " );    X.cm();
            
            final X x = new X();
            System.out.printf( "x.ov    -> %s\n",  x.ov );
            System.out.printf( "x.om()  -> " );    x.om();
            System.out.printf( "x       -> %s\n",  x );
            System.out.printf( "\n" );
            
            System.out.printf( "x.getClass()                 -> %s\n",  x.getClass() );
            System.out.printf( "x.getClass().getSimpleName() -> %s\n",  x.getClass().getSimpleName() );
        }//scope
        System.out.printf( "\n\n\n" );
        
        
        
        
        
        /*scope*/{
            System.out.printf( "do test with Y\n" );
            System.out.printf( "==============\n" );
            System.out.printf( "\n" );
            
            System.out.printf( "Y.cv    -> %s\n",  Y.cv );
            System.out.printf( "Y.cm()  -> " );    Y.cm();
            
            final Y y = new Y();
            System.out.printf( "y.ov    -> %s\n",  y.ov );
            System.out.printf( "y.om()  -> " );    y.om();
            System.out.printf( "y       -> %s\n",  y );
            System.out.printf( "\n" );
            
            System.out.printf( "y.getClass()                 -> %s\n",  y.getClass() );
            System.out.printf( "y.getClass().getSimpleName() -> %s\n",  y.getClass().getSimpleName() );
        }//scope
        System.out.printf( "\n\n\n" );
        
        
        
        
        
        /*scope*/{
            System.out.printf( "do test with Z\n" );
            System.out.printf( "==============\n" );
            System.out.printf( "\n" );
            
            System.out.printf( "Z.cv    -> %s\n",  Z.cv );
            System.out.printf( "Z.cm()  -> " );    Z.cm();
            
            final Z z = new Z();
            System.out.printf( "z.ov    -> %s\n",  z.ov );
            System.out.printf( "z.om()  -> " );    z.om();
            System.out.printf( "z       -> %s\n",  z );
            System.out.printf( "\n" );
            
            System.out.printf( "z.getClass()                 -> %s\n",  z.getClass() );
            System.out.printf( "z.getClass().getSimpleName() -> %s\n",  z.getClass().getSimpleName() );
        }//scope
        System.out.printf( "\n\n\n\n\n" );
        
        
        
        
        
        /*scope*/{
            System.out.printf( "do test with I & A\n" );
            System.out.printf( "==================\n" );
            System.out.printf( "\n" );
            
            System.out.printf( "I.class                      -> %s\n",  I.class );
            System.out.printf( "A.class                      -> %s\n",  A.class );
            System.out.printf( "I.class.getSimpleName()      -> %s\n",  I.class.getSimpleName() );
            System.out.printf( "A.class.getSimpleName()      -> %s\n",  A.class.getSimpleName() );
            System.out.printf( "\n" );
            
            final A a = new Z();
            final I i = a;
            System.out.printf( "i.om()  -> " );    i.om();
            System.out.printf( "i       -> %s\n",  i );
            System.out.printf( "\n" );
            System.out.printf( "a.ov    -> %s\n",  a.ov );                      // yes, static fields shall not be accessed in a dynamic way(!), BUT it's a demo
            System.out.printf( "a.om()  -> " );    a.om();
            System.out.printf( "a       -> %s\n",  a );
            System.out.printf( "\n" );
            
            System.out.printf( "i.getClass()                 -> %s\n",  i.getClass() );
            System.out.printf( "i.getClass().getSimpleName() -> %s\n",  i.getClass().getSimpleName() );
            System.out.printf( "a.getClass()                 -> %s\n",  a.getClass() );
            System.out.printf( "a.getClass().getSimpleName() -> %s\n",  a.getClass().getSimpleName() );
        }//scope
        System.out.printf( "\n\n\n\n\n" );
        
        
        
        
        
        /*scope*/{
            System.out.printf( "do further test with I & A\n" );
            System.out.printf( "==========================\n" );
            System.out.printf( "\n" );
            
            final R r = new F();
            final A a = r;
            final I i = a;
            System.out.printf( "i.om()      -> " );    i.om();
            System.out.printf( "a.om()      -> " );    a.om();
            System.out.printf( "r.om()      -> " );    r.om();
            System.out.printf( "\n" );
            System.out.printf( "a.ov        -> %s\n",  a.ov );                  // yes, static fields shall not be accessed in a dynamic way(!), BUT it's a demo
            System.out.printf( "r.ov        -> %s\n",  r.ov );
            System.out.printf( "\n" );
            System.out.printf( "((A)i).ov   -> %s\n",  ((A)i).ov );             // yes, static fields shall not be accessed in a dynamic way(!), BUT it's a demo
            System.out.printf( "((R)i).ov   -> %s\n",  ((R)i).ov );
            System.out.printf( "((B)i).ov   -> %s\n",  ((B)i).ov );
            System.out.printf( "((C)i).ov   -> %s\n",  ((C)i).ov );
            System.out.printf( "((D)i).ov   -> %s\n",  ((D)i).ov );
            System.out.printf( "((E)i).ov   -> %s\n",  ((E)i).ov );
            System.out.printf( "((F)i).ov   -> %s\n",  ((F)i).ov );
            System.out.printf( "\n" );
            System.out.printf( "((I)i).om() -> " );    ((I)i).om();
            System.out.printf( "((A)i).om() -> " );    ((A)i).om();
            System.out.printf( "((R)i).om() -> " );    ((R)i).om();
            System.out.printf( "((B)i).om() -> " );    ((B)i).om();
            System.out.printf( "((C)i).om() -> " );    ((C)i).om();
            System.out.printf( "((D)i).om() -> " );    ((D)i).om();
            System.out.printf( "((E)i).om() -> " );    ((E)i).om();
            System.out.printf( "((F)i).om() -> " );    ((F)i).om();
        }//scope
    }//method()
    
}//class