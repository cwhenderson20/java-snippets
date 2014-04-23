import java.util.*;
import java.io.*;
import java.math.*;

public class Problem3 {
    public static void main(String[] args) {
        double out = 0;
        double m = 600851475143d;
        for (double n = 3; n < m; n += 2) {
            while (m % n == 0) {
                out = n;
                m = m / n;
            }
        }
        System.out.println("" + ((m == 1)?out:m));
    }
}

// Note: I did not write this code. Wish I did...this is the method I was trying to make work, but it wouldn't.