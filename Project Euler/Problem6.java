/* Problem 6: Sum Square Difference
The sum of the squares of the first ten natural numbers is:
1^2 + 2^2 + ... + 10^2 = 385
The square of the sum of the first ten natural numbers is:
(1 + 2 + ... + 10)^2 = 55^2 = 3025
Hence the difference between the sum of the squares of the first ten natural numbers and the square of the sum is 3025 − 385 = 2640.
Find the difference between the sum of the squares of the first one hundred natural numbers and the square of the sum.
*/

import java.io.*;
import java.util.*;

public class Problem6 {
	public static void main(String[] args) {
		long startTime = System.currentTimeMillis();

		int sum = 0;
		final int SQUARE_SUM = 25502500; // Square of sum of 1 to 100, precalculated
		for (int i = 1; i <= 100; i++) {
			sum += (i*i);
		}

		System.out.println(SQUARE_SUM - sum);

		long endTime = System.currentTimeMillis();
		long totalTime = endTime - startTime;
		System.out.println("Total run time was " + totalTime + " milliseconds.");
	}
}