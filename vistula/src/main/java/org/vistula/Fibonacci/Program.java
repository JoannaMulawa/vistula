package org.vistula.Fibonacci;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) throws Exception {
        int count;
        Scanner input = new Scanner(System.in);
        count = input.nextInt();
        input.close();

        if (count < 0) {
            throw new Exception("Enter number above zero");
        }
        else {
            FibonacciSequence sequence = new FibonacciSequence();
            sequence.print(count);
        }

    }
}
