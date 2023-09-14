package utilities;

import java.time.Duration;

public class ReusableMethods {

    public static void waitFor(int sec){


        try {
            Thread.sleep(1000*sec);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

}
