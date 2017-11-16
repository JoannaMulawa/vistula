package org.vistula.Fibonacci;

public class FibonacciSequence {

    public void print(int n) {
        System.out.println("Fibonacci: " + n);

        int prev = 0;
        int prevPrev = 0;
        for(int i = 1; i <= n; i++ ) {
            int value;
            if (i==1) {
                prevPrev = 1;
            }

            value = prev + prevPrev;
            System.out.println(value);

            prevPrev = prev;
            prev = value;
        }

    }
}
