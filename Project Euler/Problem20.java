/* Problem 20: Factorial Digit Sum
n! means n × (n − 1) × ... × 3 × 2 × 1
For example, 10! = 10 × 9 × ... × 3 × 2 × 1 = 3628800, and the sum of the digits in the number 10! is 3 + 6 + 2 + 8 + 8 + 0 + 0 = 27.

Find the sum of the digits in the number 100!
*/

import java.io.*;
import java.util.*;
import java.math.*;

public class Problem20 {
	public static void main(String[] args) {
		long startTime = System.currentTimeMillis();
		
		BigInteger factorial = new BigInteger("1");
		int limit = 100;

		for (int i = 1; i <= limit; i++)
			factorial = factorial.multiply(BigInteger.valueOf(i));
		System.out.println(factorial);

		String s = factorial.toString();
		int sum = 0;

		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			sum += (c - '0');
		}
		System.out.println("Sum of digits = " + sum);

		long endTime = System.currentTimeMillis();
		long totalTime = endTime - startTime;
		System.out.println("Total run time was " + totalTime + " milliseconds.");
	}
}