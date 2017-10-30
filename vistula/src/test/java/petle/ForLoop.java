package petle;

import org.junit.Test;

public class ForLoop {

    @Test
    public void basicForLoop() {
        // for (warunek poczatkowy; warunek kontynuum)
        for (int i = 0; i <= 10; i++) {

            System.out.println(i);
        }
    }


    @Test
    public void basicForLoop1() {
        // for (warunek poczatkowy; warunek kontynuum)
        for (int i = 10; i >= 0; i--) {

            System.out.println(i);
        }
    }

}



