package ciaran.liedeman.random;


import com.google.common.base.Stopwatch;

/**
 * Get X random integers and time how long it takes
 */
public class Random {

    private static final int LIMIT = 1000;

    public static void main(String[] args) {
        java.util.Random random = new java.util.Random();

        Stopwatch stopwatch = Stopwatch.createStarted();

        for (int i = 0; i < LIMIT; i++) {
            random.nextInt();
        }

        stopwatch.stop();

        System.out.println(String.format("Total Time: %s", stopwatch));
    }
}
