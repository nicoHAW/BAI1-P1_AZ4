// This source code is UTF-8 coded - see https://stackoverflow.com/questions/9180981/how-to-support-utf-8-encoding-in-eclipse
package testsForShape;


import static org.junit.jupiter.api.Assertions.*;
import static shape.Shape.epsilon;
//
import java.util.*;
import org.junit.jupiter.api.*;
import org.junit.jupiter.api.MethodOrderer.OrderAnnotation;
import org.junit.jupiter.api.TestMethodOrder;
import shape.*;
import stuffBeginnersDontHaveToUnderstand.*;


/**
 * (J)UnitTestFrame for ... - see task
 * 
 * @author  Michael Schaefers  ([UTF-8]:"Michael Schäfers");
 *          Px@Hamburg-UAS.eu
 * @version {@value #encodedVersion}
 */
@TestMethodOrder(OrderAnnotation.class)
public class UnitTestFrameAndStarter {
    //
    //--VERSION:-------------------------------#---vvvvvvvvv---vvvv-vv-vv--vv
    //  ========                               #___~version~___YYYY_MM_DD__dd_
    final static private long encodedVersion = 2___00001_003___2024_05_26__01L;
    //-----------------------------------------#---^^^^^-^^^---^^^^-^^-^^--^^
    final static private Version version = new Version( encodedVersion );
    /**
     * Get decoded version of code {@link TestFrameAutomated}
     * 
     * @return decoded version
     */
    static public String getDecodedVersion(){ return version.getDecodedVersion(); }
    // Obiges (ab VERSION) dient nur der Versionierung.
    
    
    
    
    
    /*
    @BeforeAll
    public static void runSetupBeforeAnyUnitTestStarts(){
        
        // print some information at start
        System.out.printf( "TestFrame information\n" );
        System.out.printf( "=====================\n" );
        System.out.printf( "\n\n" );
        //
        System.out.printf( "Release:\n" );
        System.out.printf( "    GivenCode version:      %s\n",  GivenCodeVersion.getDecodedVersion() );
        System.out.printf( "    TestFrame version:      %s\n",  version.getDecodedVersion() );
        System.out.printf( "\n\n" );
        //
        System.out.printf( "Environment:\n" );
        System.out.printf( "    #Cores:                 %d\n",  EnvironmentAnalyzer.getAvailableCores() );
        System.out.printf( "    Java:                   %s\n",  EnvironmentAnalyzer.getJavaVersion() );
        System.out.printf( "    JUnit5/Jupiter:         %s\n",  EnvironmentAnalyzer.getJUnitJupiterVersion() );
        System.out.printf( "    JUnit5/Platform:        %s\n",  EnvironmentAnalyzer.getJUnitPlatformVersion() );
        System.out.printf( "    assert enabled?:        %s\n",  EnvironmentAnalyzer.isAssertEnabled() );
        System.out.printf( "    UTF-8 configured?:      %s      <- check output\n",  "[ÄËÏÖÜẞäëïöüß␣🙂😉🙁😟😓😎☠]" );
        System.out.printf( "\n\n\n\n" );
        //
        System.out.printf( "################################################################################" );
        System.out.printf( "\n" );
        System.out.printf( "Start of actual tests\n" );
        System.out.printf( "=====================\n" );
        System.out.printf( "Remember: The main point is the \"green bar\" (in the JUnit-window).\n" );
        System.out.printf( "This test will take some time.\n" );
        System.out.printf( "\n" );
        //
        System.out.flush();
    }//method()    
    
    
    
    
    
    @Test
    @Order(100_0101)
    public void testWithCubePoints01(){
        final String testName = new Object(){}.getClass().getEnclosingMethod().getName();
        final Point[] shapePoints = {
            new Point(  +0.0,   +0.0,   +0.0 ),
            new Point(  +0.0,   +0.0,   +1.0 ),
            new Point(  +0.0,   +1.0,   +0.0 ),
            new Point(  +0.0,   +1.0,   +1.0 ),
            new Point(  +1.0,   +0.0,   +0.0 ),
            new Point(  +1.0,   +0.0,   +1.0 ),
            new Point(  +1.0,   +1.0,   +0.0 ),
            new Point(  +1.0,   +1.0,   +1.0 )
        };
        final double expectedSurface = 6.0;
        final double expectedVolume = 1.0;
        final Point expectedCenter = new Point( 0.5, 0.5, 0.5 );
        iTestWithCubePoints( testName, expectedSurface, expectedVolume, expectedCenter, shapePoints );
        //  ( +0.5, +0.5, +0.5 )    "+"    (+1.0, +0.0, +0.0),  (+0.0, +1.0, +0.0),  (+0.0, +0.0, +1.0)
    }//method()
    
    
    @Test
    @Order(100_0102)
    public void testWithCubePoints02(){
        final String testName = new Object(){}.getClass().getEnclosingMethod().getName();
        final Point[] shapePoints = {
            new Point(  +0.0,   +0.0,   +0.0 ),
            new Point(  +0.0,   +0.0,   +5.0 ),
            new Point(  +0.0,   +5.0,   +0.0 ),
            new Point(  +0.0,   +5.0,   +5.0 ),
            new Point(  +5.0,   +0.0,   +0.0 ),
            new Point(  +5.0,   +0.0,   +5.0 ),
            new Point(  +5.0,   +5.0,   +0.0 ),
            new Point(  +5.0,   +5.0,   +5.0 )
        };
        final double expectedSurface = 150.0;
        final double expectedVolume = 125.0;
        final Point expectedCenter = new Point( 2.5, 2.5, 2.5 );
        iTestWithCubePoints( testName, expectedSurface, expectedVolume, expectedCenter, shapePoints );
        //  ( +2.5, +2.5, +2.5 )    "+"    5*( (+1.0, +0.0, +0.0),  (+0.0, +1.0, +0.0),  (+0.0, +0.0, +1.0) )
    }//method()
    
    
    @Test
    @Order(100_0103)
    public void testWithCubePoints03(){
        final String testName = new Object(){}.getClass().getEnclosingMethod().getName();
        final Point[] shapePoints = {
            new Point(  -4.2,   -4.2,   -4.2 ),
            new Point(  -4.2,   -4.2,   +4.2 ),
            new Point(  -4.2,   +4.2,   -4.2 ),
            new Point(  -4.2,   +4.2,   +4.2 ),
            new Point(  +4.2,   -4.2,   -4.2 ),
            new Point(  +4.2,   -4.2,   +4.2 ),
            new Point(  +4.2,   +4.2,   -4.2 ),
            new Point(  +4.2,   +4.2,   +4.2 )
        };
        final double expectedSurface = 423.36;
        final double expectedVolume = 592.704;
        final Point expectedCenter = new Point( 0.0, 0.0, 0.0 );
        iTestWithCubePoints( testName, expectedSurface, expectedVolume, expectedCenter, shapePoints );
        //  ...
    }//method()
    
    
    @Test
    @Order(100_0104)
    public void testWithCubePoints04(){
        final String testName = new Object(){}.getClass().getEnclosingMethod().getName();
        final Point[] shapePoints = {
            new Point(  -8.3,   +4.9,   +5.3 ),
            new Point(  -6.3,   -1.1,  +14.3 ),
            new Point(  -2.3,   -2.1,   -0.7 ),
            new Point(  -0.3,   -8.1,   +8.3 ),
            new Point(  +0.7,  +10.9,   +7.3 ),
            new Point(  +2.7,   +4.9,  +16.3 ),
            new Point(  +6.7,   +3.9,   +1.3 ),
            new Point(  +8.7,   -2.1,  +10.3 )
        };
        final double expectedSurface = 726.0;
        final double expectedVolume = 1331.0;
        final Point expectedCenter = new Point( 0.2, 1.4, 7.8 );
        iTestWithCubePoints( testName, expectedSurface, expectedVolume, expectedCenter, shapePoints );
        //  ( -2.3, -2.1, -0.7 )    "+"    (+9.0, +6.0, +2.0),  (+2.0, -6.0, +9.0),  (-6.0, +7.0, +6.0)
    }//method()
    
    
    @Test
    @Order(100_0105)
    public void testWithCubePoints05(){
        final String testName = new Object(){}.getClass().getEnclosingMethod().getName();
        final Point[] shapePoints = {
            new Point( -10.66,   +6.24,   +6.89 ),
            new Point(  -8.06,   -1.56,  +18.59 ),
            new Point(  -2.86,   -2.86,   -0.91 ),
            new Point(  -0.26,  -10.66,  +10.79 ),
            new Point(  +1.04,  +14.04,   +9.49 ),
            new Point(  +3.64,   +6.24,  +21.19 ),
            new Point(  +8.84,   +4.94,   +1.69 ),
            new Point( +11.44,   -2.86,  +13.39 )
        };
        final double expectedSurface = 1226.94;
        final double expectedVolume = 2924.207;
        final Point expectedCenter = new Point( 0.39, 1.69, 10.14 );
        iTestWithCubePoints( testName, expectedSurface, expectedVolume, expectedCenter, shapePoints );
        //  f(  ( -2.3, -2.1, -0.7 )    "+"    (+9.0, +6.0, +2.0),  (+2.0, -6.0, +9.0),  (-6.0, +7.0, +6.0)  )
    }//method()
    
    
    @Test
    @Order(100_0106)
    public void testWithCubePoints06(){
        final String testName = new Object(){}.getClass().getEnclosingMethod().getName();
        final Point[] shapePoints = {
            new Point(  -9.3,   -1.3,   -0.7 ),
            new Point(  -8.3,   -9.3,   +3.3 ),
            new Point(  -5.3,   +2.7,   +6.3 ),
            new Point(  -4.3,   -5.3,  +10.3 ),
            new Point(  -1.3,   -2.3,   -4.7 ),
            new Point(  -0.3,  -10.3,   -0.7 ),
            new Point(  +2.7,   +1.7,   +2.3 ),
            new Point(  +3.7,   -6.3,   +6.3 )
        };
        final double expectedSurface = 486.0;
        final double expectedVolume = 729.0;
        final Point expectedCenter = new Point( -2.8, -3.8, 2.8 );
        iTestWithCubePoints( testName, expectedSurface, expectedVolume, expectedCenter, shapePoints );
        //  ( -1.3, -2.3, -4.7 )    "+"    (+4.0, +4.0, +7.0),  (+1.0, -8.0, +4.0),  (-8.0, +1.0, +4.0)
    }//method()

    
    
    
    @Test
    @Order(100_1101)
    public void testWithCuboidPoints01(){
        final String testName = new Object(){}.getClass().getEnclosingMethod().getName();
        final Point[] shapePoints = {
            new Point(  -2.0,   -3.0,   -5.0),
            new Point(  -2.0,   -3.0,   +5.0),
            new Point(  -2.0,   +3.0,   -5.0),
            new Point(  -2.0,   +3.0,   +5.0),
            new Point(  +2.0,   -3.0,   -5.0),
            new Point(  +2.0,   -3.0,   +5.0),
            new Point(  +2.0,   +3.0,   -5.0),
            new Point(  +2.0,   +3.0,   +5.0)
        };
        final double expectedSurface = 248.0;
        final double expectedVolume = 240.0;
        final Point expectedCenter = new Point( 0.0, 0.0, 0.0 );
        iTestWithCuboidPoints( testName, expectedSurface, expectedVolume, expectedCenter, shapePoints );
        //  ...
    }//method()
    
    
    @Test
    @Order(100_1102)
    public void testWithCuboidPoints02(){
        final String testName = new Object(){}.getClass().getEnclosingMethod().getName();
        final Point[] shapePoints = {
            new Point( -19.7,   +0.3,   +3.7 ),
            new Point( -16.7,  -23.7,  +15.7 ),
            new Point(  -3.7,   -1.7,   -4.3 ),
            new Point(  -0.7,  -25.7,   +7.7 ),
            new Point(  +0.3,  +20.3,  +38.7 ),
            new Point(   3.3,   -3.7,  +50.7 ),
            new Point( +16.3,  +18.3,  +30.7 ),
            new Point( +19.3,   -5.7,  +42.7 )
        };
        final double expectedSurface = 5022.0;
        final double expectedVolume = 21870.0;
        final Point expectedCenter = new Point( -0.2, -2.7, 23.2 );
        iTestWithCuboidPoints( testName, expectedSurface, expectedVolume, expectedCenter, shapePoints );
        //  ( -3.7, -1.7, -4.3 )    "+"  5*(+4.0, +4.0, +7.0),  3*(+1.0, -8.0, +4.0),  2*(-8.0, +1.0, +4.0)
    }//method()
    
    
    @Test
    @Order(100_1103)
    public void testWithCuboidPoints03(){
        final String testName = new Object(){}.getClass().getEnclosingMethod().getName();
        final Point[] shapePoints = {
            new Point(  -4.9,   +0.8,   -0.1 ),
            new Point(  -1.9,   -0.7,   -3.1 ),
            new Point(  -3.9,   -1.2,   +1.9 ),
            new Point(  -0.9,   -2.7,   -1.1 ),
            new Point(  +0.1,   +5.8,   +2.4 ),
            new Point(  +1.1,   +3.8,   +4.4 ),
            new Point(  +3.1,   +4.3,   -0.6 ),
            new Point(  +4.1,   +2.3,   +1.4 )
        };
        final double expectedSurface = 139.5;
        final double expectedVolume = 101.25;
        final Point expectedCenter = new Point( -0.4, 1.55, 0.65 );
        iTestWithCuboidPoints( testName, expectedSurface, expectedVolume, expectedCenter, shapePoints );
        //  ( -1.9, -0.7, -3.1 )    "+"  2.5*(+2.0, +2.0, +1.0),  (+1.0, -2.0, +2.0),  1.5*(-4.0, +2.0, +4.0)
    }//method()
    
    
    
    @Test
    @Order(100_1201)
    public void testWithShapePoints01(){
        final String testName = new Object(){}.getClass().getEnclosingMethod().getName();
        final Point[] shapePoints = {
            new Point(  +0.0,   +0.0,   +0.0 ),
            new Point(  +0.0,   +3.0,   +4.0 ),
            new Point(  +0.0,   +5.0,   +0.0 ),
            new Point(  +0.0,   +8.0,   +4.0 ),
            new Point(  +5.0,   +0.0,   +0.0 ),
            new Point(  +5.0,   +3.0,   +4.0 ),
            new Point(  +5.0,   +5.0,   +0.0 ),
            new Point(  +5.0,   +8.0,   +4.0 )
        };
        iTestWithShapePoints( testName, shapePoints );
        //  ...
    }//method()
    
    
    @Test
    @Order(100_1202)
    public void testWithShapePoints02(){
        final String testName = new Object(){}.getClass().getEnclosingMethod().getName();
        final Point[] shapePoints = {
            new Point(  -4.2,   -4.2,   -4.2 ),
            new Point(  -4.2,   -4.2,   +4.2 ),
            new Point(  -4.2,   +4.2,   -4.2 ),
            new Point(  -4.2,   +4.2,   +4.2 ),
            new Point(  +4.2,   -4.2,   -4.2 ),
            new Point(  +4.2,   -4.2,   +4.2 ),
            new Point(  +4.2,   +4.2,   -4.2 ),
            new Point(  +4.2,   +4.2,   +4.3 )
        };
        iTestWithShapePoints( testName, shapePoints );
        //  ...
    }//method()
    
    
    @Test
    @Order(100_1203)
    public void testWithShapePoints03(){
        final String testName = new Object(){}.getClass().getEnclosingMethod().getName();
        final Point[] shapePoints = {
            new Point(  -3.0,   +4.0,   +0.0 ),
            new Point(  -3.0,   +4.0,   +5.0 ),
            new Point(  +0.0,   +0.0,   +0.0 ),
            new Point(  +0.0,   +0.0,   +5.0 ),
            new Point(  +2.0,   +4.0,   +0.0 ),
            new Point(  +2.0,   +4.0,   +5.0 ),
            new Point(  +5.0,   +0.0,   +0.0 ),
            new Point(  +5.0,   +0.0,   +5.0 )
        };
        iTestWithShapePoints( testName, shapePoints );
        // KEIN Wuerfel und KEIN Quader, aber Kantenlaenge immer 5
    }//method()
    
    
    @Test
    @Order(100_1204)
    public void testWithShapePoints04(){
        final String testName = new Object(){}.getClass().getEnclosingMethod().getName();
        final Point[] shapePoints = {
            new Point(  -6.0,   +1.5,   +2.5 ),
            new Point(  -1.0,   +1.5,   +2.5 ),
            new Point(  +1.0,   +0.0,   +0.0 ),
            new Point(  +1.0,   +0.0,   +5.0 ),
            new Point(  +1.0,   +3.0,   +0.0 ),
            new Point(  +1.0,   +3.0,   +5.0 ),
            new Point(  +3.0,   +1.5,   +2.5 ),
            new Point(  +8.0,   +1.5,   +2.5 )
        };
        iTestWithShapePoints( testName, shapePoints );
        //  ...
    }//method()
    
    
    @Test
    @Order(100_1205)
    public void testWithShapePoints05(){
        final String testName = new Object(){}.getClass().getEnclosingMethod().getName();
        final Point[] shapePoints = {
            new Point( -Math.sqrt(2),          +0.0,   +2.0 ),
            new Point(          -1.0,          -1.0,   +1.0 ),
            new Point(          -1.0,          +1.0,   +0.0 ),
            new Point(          +0.0, -Math.sqrt(2),   +2.0 ),
            new Point(          +0.0,  Math.sqrt(2),   +2.0 ),
            new Point(          +1.0,          +1.0,   +0.0 ),
            new Point(          +1.0,          +1.0,   +1.0 ),
            new Point(  Math.sqrt(2),          +0.0,   +2.0 )
        };
        iTestWithShapePoints( testName, shapePoints );
        //  ...
    }//method()
    
    
    
    @Test
    @Order(100_1301)
    public void testSphere01(){
        final String testName = new Object(){}.getClass().getEnclosingMethod().getName();
        final Point center = new Point(0.0, 0.0, 0.0 );
        final double radius = 1.0;
        final double expectedSurface = 12.566370614359172;
        final double expectedVolume = 4.1887902047863905;
        iTestSphere( testName, expectedSurface, expectedVolume, center, radius );
    }//method()
    
    
    @Test
    @Order(100_1302)
    public void testSphere02(){
        final String testName = new Object(){}.getClass().getEnclosingMethod().getName();
        final Point center = new Point(-1.0,-1.0,-1.0);
        final double radius = 0.75;
        final double expectedSurface = 7.0685834705770345;
        final double expectedVolume = 1.7671458676442586;
        iTestSphere( testName, expectedSurface, expectedVolume, center, radius );
    }//method()
    
    
    @Test
    @Order(100_1303)
    public void testSphere03(){
        final String testName = new Object(){}.getClass().getEnclosingMethod().getName();
        final Point center = new Point( -Math.sqrt(2.0), -Math.sqrt(2.0), -Math.sqrt(2.0) );
        final double radius = -1.0;
        iTestAbsurdity( testName, center, radius );
    }//method()
    
    
    
    @Test
    @Order(100_9901)
    public void testPolymorphy(){
        final String testName = new Object(){}.getClass().getEnclosingMethod().getName();
        final Point[] shapePoints = {
            new Point(  -4.2,   -4.2,   -4.2 ),
            new Point(  -4.2,   -4.2,   +4.2 ),
            new Point(  -4.2,   +4.2,   -4.2 ),
            new Point(  -4.2,   +4.2,   +4.2 ),
            new Point(  +4.2,   -4.2,   -4.2 ),
            new Point(  +4.2,   -4.2,   +4.2 ),
            new Point(  +4.2,   +4.2,   -4.2 ),
            new Point(  +4.2,   +4.2,   +4.2 )
        };
        final Point center = new Point( -1.0, -1.0,-1.0);
        final double radius = 1.0;
        //
        String exceptionMessage = "";
        boolean exceptionDetected = false;
        try{
            Cube cube = new Cube( shapePoints );
            Cuboid cuboid = cube;
            Shape shape = cuboid;
            double surface = shape.getSurface();
            double volume = shape.getVolume();
            Point point = shape.getCenter();
            //
            cuboid = new Cuboid( shapePoints );
            shape = cuboid;
            surface = shape.getSurface();
            volume = shape.getVolume();
            point = shape.getCenter();
            //
            Sphere sphere = new Sphere( center, radius ); 
            shape = sphere;
            surface = shape.getSurface();
            volume = shape.getVolume();
            point = shape.getCenter();
        }catch( final Exception | AssertionError ex ){
            exceptionDetected = true;
            exceptionMessage = ex.getMessage();
        }finally{
            if( exceptionDetected ){
                StringBuilder sb = new StringBuilder( testName );
                sb.append( ":\n" );
                sb.append( "ERROR: Polymorphie NOT given :\n" );
                sb.append( exceptionMessage );
                System.out.printf( "%s\n", sb.toString() );
                System.out.printf( "\n\n" );
                fail( "ERROR: Polymorphie NOT given" );
            }//if
        }//try

    }//method()
    
    
    
    
    
    @AfterAll
    public static void tearDownAfterAllUnitTestsHaveFinished(){
        System.out.printf( "\n" );
        System.out.printf( "################################################################################\n" );
        System.out.printf( "THE END" );
        System.out.flush();
    }//method()
    
    
    
    
    
    //##########################################################################
    //###
    //###   "Helpers" / auxiliary methods
    //###
    
    private void iTestWithCubePoints(
        final String testName,
        final double expectedSurface,
        final double expectedVolume,
        final Point expectedCenter,
        final Point[] shapePoints
    ){
        assert shapePoints.length==8 : String.format( "internal setup error - 8 points were expected and %d found", shapePoints.length );
        final Permutationer<Point> permu = new SimplePermutationer<Point>( shapePoints );
        while(permu.hasNext() ){
            
            // local declarations
            //
            double computedSurface;
            double computedVolume;
            Point computedCenter;
            //
            boolean exceptionDetected;
            String exceptionMessage = "";
            //
            final Point[] currentPoints = permu.next();
            
            
            // test cuboid
            //
            exceptionDetected = false;
            Cuboid cuboid = null;
            try{
                cuboid = new Cuboid( currentPoints );
            }catch( final Exception | AssertionError ex ){
                exceptionDetected = true;
                exceptionMessage = ex.getMessage();
            }finally{
                if( exceptionDetected ){
                    StringBuilder sb = new StringBuilder( testName );
                    sb.append( ":\n" );
                    sb.append( "ERROR: Cuboid was NOT detected  based on :\n" );
                    sb.append( Arrays.toString( currentPoints ));
                    sb.append( "\n" );
                    sb.append( exceptionMessage );
                    System.out.printf( "%s\n", sb.toString() );
                    System.out.printf( "\n\n" );
                    fail( "ERROR: Cuboid was NOT detected" );
                }//if
            }//try
            //
            computedSurface = cuboid.getSurface();
            assertTrue( 
                areAcceptedAsEqualFloatingPointValues( expectedSurface, computedSurface, epsilon ),
                String.format(
                    "expected surface: <%f> but was: <%f>\nPoints: %s\n",
                    expectedSurface,
                    computedSurface,
                    Arrays.toString( currentPoints )
                )
            );
            //
            computedVolume = cuboid.getVolume();
            assertTrue(
                areAcceptedAsEqualFloatingPointValues( expectedVolume, computedVolume, epsilon ),
                String.format(
                    "expected volume: <%f> but was: <%f>\nPoints: %s\n",
                    expectedVolume,
                    computedVolume,
                    Arrays.toString( currentPoints )
                )
            );
            //
            computedCenter = cuboid.getCenter();
            assertTrue(
                expectedCenter.isAcceptedAsEqual( computedCenter, epsilon ),
                String.format(
                    "expected center: <%s> but was: <%s>\nPoints: %s\n",
                    expectedCenter,
                    computedCenter,
                    Arrays.toString( currentPoints )
                )
             );
            
            
            //test cube
            //
            exceptionDetected = false;
            Cube cube = null;
            try{
                cube = new Cube( currentPoints );
            }catch( final Exception | AssertionError ex ){
                exceptionDetected = true;
                exceptionMessage = ex.getMessage();
            }finally{
                if( exceptionDetected ){
                    StringBuilder sb = new StringBuilder( testName );
                    sb.append( ":\n" );
                    sb.append( "ERROR: Cube was NOT detected  based on :\n" );
                    sb.append( Arrays.toString( currentPoints ));
                    sb.append( "\n" );
                    sb.append( exceptionMessage );
                    System.out.printf( "%s\n", sb.toString() );
                    System.out.printf( "\n\n" );
                    fail( "ERROR: Cube was NOT detected" );
                }//if
            }//try
            //
            computedSurface = cube.getSurface();
            assertTrue( 
                areAcceptedAsEqualFloatingPointValues( expectedSurface, computedSurface, epsilon ),
                String.format(
                    "expected surface: <%f> but was: <%f>\nPoints: %s\n",
                    expectedSurface,
                    computedSurface,
                    Arrays.toString( currentPoints )
                )
            );
            //
            computedVolume = cube.getVolume();
            assertTrue(
                areAcceptedAsEqualFloatingPointValues( expectedVolume, computedVolume, epsilon ),
                String.format(
                    "expected volume: <%f> but was: <%f>\nPoints: %s\n",
                    expectedVolume,
                    computedVolume,
                    Arrays.toString( currentPoints )
                )
            );
            //
            computedCenter = cube.getCenter();
            assertTrue(
                expectedCenter.isAcceptedAsEqual( computedCenter, epsilon ),
                String.format(
                    "expected center: <%s> but was: <%s>\nPoints: %s\n",
                    expectedCenter,
                    computedCenter,
                    Arrays.toString( currentPoints )
                )
            );
            
        }//while
        
    }//method()
    
    
    
    private void iTestWithCuboidPoints(
        final String testName,
        final double expectedSurface,
        final double expectedVolume,
        final Point expectedCenter,
        final Point... shapePoints
    ){
        assert shapePoints.length==8 : String.format( "internal setup error - 8 points were expected and %d found", shapePoints.length );
        final Permutationer<Point> permu = new SimplePermutationer<Point>( shapePoints );
        while(permu.hasNext() ){
            
            // local declarations
            //
            double computedSurface;
            double computedVolume;
            Point computedCenter;
            //
            boolean exceptionDetected;
            String exceptionMessage = "";
            //
            final Point[] currentPoints = permu.next();
            
            
            // test cuboid
            //
            exceptionDetected = false;
            Cuboid cuboid = null;
            try{
                cuboid = new Cuboid( currentPoints );
            }catch( final Exception | AssertionError ex ){
                exceptionDetected = true;
                exceptionMessage = ex.getMessage();
            }finally{
                if( exceptionDetected ){
                    StringBuilder sb = new StringBuilder( testName );
                    sb.append( ":\n" );
                    sb.append( "ERROR: Cuboid was NOT detected  based on :\n" );
                    sb.append( Arrays.toString( currentPoints ));
                    sb.append( "\n" );
                    sb.append( exceptionMessage );
                    System.out.printf( "%s\n", sb.toString() );
                    System.out.printf( "\n\n" );
                    fail( "ERROR: Cuboid was NOT detected" );
                }//if
            }//try
            //
            computedSurface = cuboid.getSurface();
            assertTrue( 
                areAcceptedAsEqualFloatingPointValues( expectedSurface, computedSurface, epsilon ),
                String.format(
                    "expected surface: <%f> but was: <%f>\nPoints: %s\n",
                    expectedSurface,
                    computedSurface,
                    Arrays.toString( currentPoints )
                )
            );
            //
            computedVolume = cuboid.getVolume();
            assertTrue(
                areAcceptedAsEqualFloatingPointValues( expectedVolume, computedVolume, epsilon ),
                String.format(
                    "expected volume: <%f> but was: <%f>\nPoints: %s\n",
                    expectedVolume,
                    computedVolume,
                    Arrays.toString( currentPoints )
                )
            );
            //
            computedCenter = cuboid.getCenter();
            assertTrue(
                expectedCenter.isAcceptedAsEqual( computedCenter, epsilon ),
                String.format(
                    "expected center: <%s> but was: <%s>\nPoints: %s\n",
                    expectedCenter,
                    computedCenter,
                    Arrays.toString( currentPoints )
                )
            );
            
            
            //test cube
            //
            exceptionDetected = false;
            Cube cube = null;
            try{
                cube = new Cube( currentPoints );
            }catch( final Exception | AssertionError ex ){
                exceptionDetected = true;
                exceptionMessage = ex.getMessage();
            }finally{
                if( ! exceptionDetected ){
                    StringBuilder sb = new StringBuilder( testName );
                    sb.append( ":\n" );
                    sb.append( "ERROR: Cube was detected  based on :\n" );
                    sb.append( Arrays.toString( currentPoints ));
                    sb.append( "\n" );
                    sb.append( exceptionMessage );
                    System.out.printf( "%s\n", sb.toString() );
                    System.out.printf( "\n\n" );
                    fail( "ERROR: Faulty cube was accepted" );
                }//if
            }//try
        }//while
        
    }//method()
    
    
    
    private void iTestWithShapePoints(
        final String testName,
        final Point... shapePoints
    ){
        assert shapePoints.length==8 : String.format( "internal setup error - 8 points were expected and %d found", shapePoints.length );
        final Permutationer<Point> permu = new SimplePermutationer<Point>( shapePoints );
        while(permu.hasNext() ){
            
            // local declarations
            //
            boolean exceptionDetected;
            String exceptionMessage = "";
            //
            final Point[] currentPoints = permu.next();
            
            
            // test cuboid
            //
            exceptionDetected = false;
            Cuboid cuboid = null;
            try{
                cuboid = new Cuboid( currentPoints );
            }catch( final Exception | AssertionError ex ){
                exceptionDetected = true;
                exceptionMessage = ex.getMessage();
            }finally{
                if( ! exceptionDetected ){
                    StringBuilder sb = new StringBuilder( testName );
                    sb.append( ":\n" );
                    sb.append( "ERROR: Cuboid was detected  based on :\n" );
                    sb.append( Arrays.toString( currentPoints ));
                    sb.append( "\n" );
                    sb.append( exceptionMessage );
                    System.out.printf( "%s\n", sb.toString() );
                    System.out.printf( "\n\n" );
                    fail( "ERROR: Faulty cuboid was accepted" );
                }//if
            }//try
            
            
            //test cube
            //
            exceptionDetected = false;
            Cube cube = null;
            try{
                cube = new Cube( currentPoints );
            }catch( final Exception | AssertionError ex ){
                exceptionDetected = true;
                exceptionMessage = ex.getMessage();
            }finally{
                if( ! exceptionDetected ){
                    StringBuilder sb = new StringBuilder( testName );
                    sb.append( ":\n" );
                    sb.append( "ERROR: Cube was detected  based on :\n" );
                    sb.append( Arrays.toString( currentPoints ));
                    sb.append( "\n" );
                    sb.append( exceptionMessage );
                    System.out.printf( "%s\n", sb.toString() );
                    System.out.printf( "\n\n" );
                    fail( "ERROR: Faulty cube was accepted" );
                }//if
            }//try
        }//while
        
    }//method()
    
    
    
    private void iTestSphere(
        final String testName,
        final double expectedSurface,
        final double expectedVolume,
        final Point center,
        final double radius
    ){
        final Point expectedCenter = center;
        
        String exceptionMessage = "";
        boolean exceptionDetected = false;
        Sphere sphere = null;
        try{
            sphere = new Sphere( center,radius );
        }catch( final Exception | AssertionError ex ){
            exceptionDetected = true;
            exceptionMessage = ex.getMessage();
        }finally{
            if( exceptionDetected ){
                StringBuilder sb = new StringBuilder( testName );
                sb.append( ":\n" );
                sb.append( "ERROR: Sphere was NOT detected  based on :\n" );
                sb.append( center );
                sb.append( ", " );
                sb.append( radius );
                sb.append( "\n" );
                sb.append( exceptionMessage );
                System.out.printf( "%s\n", sb.toString() );
                System.out.printf( "\n\n" );
                fail( "ERROR: Sphere was NOT detected" );
            }//if
        }//try
        //
        final double computedSurface = sphere.getSurface();
        assertTrue( 
            areAcceptedAsEqualFloatingPointValues( expectedSurface, computedSurface, epsilon ),
            String.format(
                "expected surface: <%f> but was: <%f>\n",
                expectedSurface,
                computedSurface
            )
        );
        //
        final double computedVolume = sphere.getVolume();
        assertTrue(
            areAcceptedAsEqualFloatingPointValues( expectedVolume, computedVolume, epsilon ),
            String.format(
                "expected volume: <%f> but was: <%f>\n",
                expectedVolume,
                computedVolume
            )
        );
        //
        final Point computedCenter = sphere.getCenter();
        assertTrue(
            expectedCenter.isAcceptedAsEqual( computedCenter, epsilon ),
            String.format(
                "expected center: <%s> but was: <%s>\n",
                expectedCenter,
                computedCenter
            )
        );
    }//method()
    
    
    
    private void iTestAbsurdity(
        final String testName,
        final Point center,
        final double radius
    ){
        String exceptionMessage = "";
        boolean exceptionDetected = false;
        Sphere sphere = null;
        try{
            sphere = new Sphere( center,radius );
        }catch( final Exception | AssertionError ex ){
            exceptionDetected = true;
            exceptionMessage = ex.getMessage();
        }finally{
            if( ! exceptionDetected ){
                StringBuilder sb = new StringBuilder( testName );
                sb.append( ":\n" );
                sb.append( "ERROR: Sphere was detected  based on :\n" );
                sb.append( center );
                sb.append( ", " );
                sb.append( radius );
                sb.append( "\n" );
                sb.append( exceptionMessage );
                System.out.printf( "%s\n", sb.toString() );
                System.out.printf( "\n\n" );
                fail( "ERROR: Faulty Sphere was accepted" );
            }//if
        }//try
    }//method()
    
    
    
    private static boolean areAcceptedAsEqualFloatingPointValues( final double d1,  final double d2,  final double tolerance ){
        assert 0<=tolerance : "Illegal Argument : Negative tolerance is NOT supported";
        
        return Math.abs( d1 - d2 ) <= tolerance;
    }//method()
    */
    
}//class
