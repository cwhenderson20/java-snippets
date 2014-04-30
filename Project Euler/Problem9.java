/* Problem 9: Special Pythagorean Triplet
A Pythagorean triplet is a set of three natural numbers, a < b < c, for which:
a2 + b2 = c2
For example, 32 + 42 = 9 + 16 = 25 = 52.

There exists exactly one Pythagorean triplet for which a + b + c = 1000.
Find the product abc.
*/

import java.io.*;
import java.util.*;
import java.lang.Math.*;

public class Problem9 {
	public static void main(String[] args) {
		long startTime = System.currentTimeMillis();

		double c = 0;
		boolean found = false;

		for (int b = 499; b > 0; b--) { // if a < b < c, and a + b + c == 1000, then the greatest value b can hold is 499.
			for (int a = b - 1; a > 0; a--) {
				c = Math.sqrt(a*a + b*b);
				if (a + b + c == 1000) {
					System.out.println(a*b*c);
					long endTime = System.currentTimeMillis();
					long totalTime = endTime - startTime;
					System.out.println("Total run time was " + totalTime + " milliseconds.");
					System.exit(0);
				}
			}
		}
	}
}