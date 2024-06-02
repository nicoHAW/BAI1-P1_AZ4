package bankAccount;


import static org.junit.jupiter.api.Assertions.assertEquals;
//
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import stuffBeginnersDontHaveToUnderstand.EnvironmentAnalyzer;
import stuffBeginnersDontHaveToUnderstand.GivenCodeVersion;
import stuffBeginnersDontHaveToUnderstand.Version;


/* Status: Schmuddel/Quick&Durty
 * Zurzeit (240530) testen UnitTestFrameAndStarter und TestFrameAndStarter dasselbe.
 * Der UnitTestFrameAndStarter kontrolliert quasi nur die Ausgaben vom TestFrameAndStarter;-)
 */
/**
 * (Unit-)TestFrame for Array Processor
 * 
 * @author  Michael Schaefers  ([UTF-8]:"Michael Schäfers");
 *          Px@Hamburg-UAS.eu
 * @version {@value #encodedVersion}
 */
public class UnitTestFrameAndStarter {
    //
    //--VERSION:-------------------------------#---vvvvvvvvv---vvvv-vv-vv--vv
    //  ========                               #___~version~___YYYY_MM_DD__dd_
    final static private long encodedVersion = 2___00000_001___2024_05_30__01L;
    //-----------------------------------------#---^^^^^-^^^---^^^^-^^-^^--^^
    final static private Version version = new Version( encodedVersion );
    /**
     * The method {@link #getDecodedVersion()} delivers the code version as reground/readable String.
     * @return version as decoded/readable String.
     */
    static public String getDecodedVersion(){ return version.getDecodedVersion(); }
    // Obiges (ab VERSION) dient nur der Versionierung.
    
    
    
    
    
    
    /*
    @BeforeAll
    public static void init(){
        System.out.printf( "TestFrame information\n" );
        System.out.printf( "=====================\n" );
        System.out.printf( "\n" );
        //
        System.out.printf( "Release:\n" );
        System.out.printf( "    GivenCode version:      %s\n",  GivenCodeVersion.getDecodedVersion() );
        System.out.printf( "    Test version:           %s\n",  version.getDecodedVersion() );
        System.out.printf( "\n" );
        //
        System.out.printf( "Environment:\n" );
        System.out.printf( "    #Cores:                 %d\n",  EnvironmentAnalyzer.getAvailableCores() );
        System.out.printf( "    Java:                   %s\n",  EnvironmentAnalyzer.getJavaVersion() );
        System.out.printf( "    assert enabled?:        %s\n",  EnvironmentAnalyzer.isAssertEnabled() );
        System.out.printf( "    UTF-8 configured?:      %s      <- check output\n",  "[ÄËÏÖÜẞäëïöüß🙂😉🙁😟😓😎]" );
        System.out.printf( "\n\n\n\n" );
        //
        System.out.printf( "Start of actual test\n" );
        System.out.printf( "vvvvvvvvvvvvvvvvvvvv\n" );
        System.out.printf( "\n\n" );
        //
        System.out.printf( "ATTENTION\n" );
        System.out.printf( "This TestFrame is still in an early development phase\n" );
        System.out.printf( "\n\n" );
        //
        System.out.flush();
    }//method()
    
    
    
    
    
    @Test
    public void test01(){
        BankAccount[] bankAccount = new BankAccount[15];
        CurrentAccount[] currentAccount = new CurrentAccount[10];
        SavingsAccount[] savingsAccount = new SavingsAccount[5];
        
        for( int i=0; i<10; i++ ){
            currentAccount[i] = new CurrentAccount( Long.toString( 10_000_000 + i ),  1_000_00,  1_00 );
            bankAccount[i] = currentAccount[i];
        }//for
        for( int i=0; i<5; i++ ){
            savingsAccount[i] = new SavingsAccount( Long.toString( 99_000_000 + i ),  i*1_000_00,  50 );
            bankAccount[10+i] = savingsAccount[i];
        }//for
        
        for( int i=0; i<10; i++ ){
            assertEquals( Long.toString( 10_000_000 + i ), bankAccount[i].getAccountId() );
            assertEquals( 1_000_00, bankAccount[i].getAccountBalance() );
            assertEquals( 100, ((CurrentAccount)bankAccount[i]).getFee() );
        }//for
        for( int i=0; i<5; i++ ){
            assertEquals( Long.toString( 99_000_000 + i ), bankAccount[10+i].getAccountId() );
            assertEquals( i*1_000_00, bankAccount[10+i].getAccountBalance() );
            assertEquals( 50, ((SavingsAccount)bankAccount[10+i]).getInterestRate() );
        }//for
    }//method()
    
    
    
    @Test
    public void test02(){
        BankAccount[] bankAccount = new BankAccount[10];
        CurrentAccount[] currentAccount = new CurrentAccount[10];
        //
        for( int i=0; i<10; i++ ){
            currentAccount[i] = new CurrentAccount( Long.toString( 10_000_000 + i ),  1_000_00,  1_00 );
            bankAccount[i] = currentAccount[i];
        }//for
        
        TransferManager transferManager = new TransferManager();
        for( int i=0; i<5; i++ ){
            transferManager.transfer( currentAccount[i+5],  currentAccount[i],  currentAccount[i+5].getAccountBalance() -1_00 );
        }//for
        for( int i=0; i<2; i++ ){
            transferManager.transfer( currentAccount[i+3],  currentAccount[i],  currentAccount[i+3].getAccountBalance() -1_00 );
        }//for
        transferManager.transfer( currentAccount[1],  currentAccount[0],  currentAccount[1].getAccountBalance() -1_00 );
        
        assertEquals( 7_993_00, bankAccount[0].getAccountBalance() );
        assertEquals(     0_00, bankAccount[1].getAccountBalance() );
        assertEquals( 1_999_00, bankAccount[2].getAccountBalance() );
        for( int i=3; i<10; i++ ){
            assertEquals( 0_00, bankAccount[i].getAccountBalance() );
        }//for
    }//method()
    
    
    
    @Test
    public void test03(){
        BankAccount[] bankAccount = new BankAccount[5];
        SavingsAccount[] savingsAccount = new SavingsAccount[5];
        
        for( int i=0; i<5; i++ ){
            savingsAccount[i] = new SavingsAccount( Long.toString( 99_000_000 + i ),  i*1_000_00,  50 );
            bankAccount[i] = savingsAccount[i];
        }//for
        
        for( int i=0; i<5; i++ ){
            savingsAccount[i].giveInterest();
        }//for
        
        for( int i=0; i<5; i++ ){
            assertEquals( i*1_050_00, bankAccount[i].getAccountBalance() );
        }//for
    }//method()
    
    
    
    
    
    @AfterAll
    public static void tearDown(){
        System.out.printf( "\n\n\n" );
        System.out.printf( "THE END" );
        System.out.flush();
    }//method()
    */
    
}//class
