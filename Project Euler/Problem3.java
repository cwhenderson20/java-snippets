/* Problem 3: Largest Prime Factor
The prime factors of 13195 are 5, 7, 13 and 29.
What is the largest prime factor of the number 600851475143 ?
*/

import java.util.*;
import java.io.*;
import java.math.*;

public class Problem3 {
    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();

        double factorized = 0;
        double num = 600851475143d;
        
        for (double i = 3; i <= num / 2; i += 2) {
            while (num % i == 0) {
                factorized = i;
                num = num / i;
            }
        }

        System.out.println(((num == 1)? factorized : num));

        long endTime = System.currentTimeMillis();
        long totalTime = endTime - startTime;
        System.out.println("Total run time was " + totalTime + " milliseconds.");
    }
}

// Note: Method adapted from a StackOverflow anser