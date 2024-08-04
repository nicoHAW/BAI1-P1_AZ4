package stuffBeginnersDontHaveToUnderstand.random;

import stuffBeginnersDontHaveToUnderstand.Beautician;

public class SchmuddelTestFrameForRandomBasedOnPRBS64 {
    
    public static void main( final String... unused ){
        final long seed = -1;
        final RandomBasedOnPRBS64 randomGenerator = new RandomBasedOnPRBS64( seed );
        long count = 0;
        //
        System.out.printf(                                                      // print computation start time
            "Computation starts at :      %s\n",
            Beautician.getPimpedTime()
        );
        System.out.printf( "\n" );
        final long startTime = System.nanoTime();                               // start time of actual computation
        //
        final long value = randomGenerator.nextLong();
        /*
        while( value != randomGenerator.nextLong() ){
            count++;
        }//while
        //
        //
        //
        while( value != randomGenerator.nextLong() ){
            count++;
            if( 1_000_000_000L == count )  System.out.printf( "." );
            if( 10_000_000_000L == count )  System.out.printf( "." );
            if( 100_000_000_000L == count )  System.out.printf( "." );
            if( 1_000_000_000_000L == count )  System.out.printf( "." );
            if( 10_000_000_000_000L == count )  System.out.printf( "." );
            if( 100_000_000_000_000L == count )  System.out.printf( "." );
            if( 1_000_000_000_000_000L == count )  System.out.printf( "." );
            if( 10_000_000_000_000_000L == count )  System.out.printf( "." );
            if( 100_000_000_000_000_000L == count )  System.out.printf( "." );
            if( 1_000_000_000_000_000_000L == count )  System.out.printf( "." );
            if( 0L == count )  System.out.printf( "X" );
        }//while
        */
        while( -10 != count ){
            randomGenerator.nextLong();
            count++;
        }//while
        for( int i=0; i<20; i++ ){
            System.out.printf( "%4d-> %x",  i, randomGenerator.nextLong() );
            count++;
        }//for
        //
        final long stopTime = System.nanoTime();                                // computation stopped
        final long elapsedTime = stopTime-startTime;                            // computation time
        System.out.printf( "\n\n" );                                            // you never know ;-)
        System.out.printf(                                                      // print computation time
            "Consumed computation time :  %s\n",
            Beautician.nanoSecondBasedTimeToString( elapsedTime )
        );
        System.out.printf( "\n" );
        System.out.printf( "%d",  count );
    }//method()
    
}//class
