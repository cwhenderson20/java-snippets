/* Problem 21: Amicable Numbers
Let d(n) be defined as the sum of proper divisors of n (numbers less than n which divide evenly into n).
If d(a) = b and d(b) = a, where a ≠ b, then a and b are an amicable pair and each of a and b are called amicable numbers.

For example, the proper divisors of 220 are 1, 2, 4, 5, 10, 11, 20, 22, 44, 55 and 110; therefore d(220) = 284. The proper divisors of 284 are 1, 2, 4, 71 and 142; so d(284) = 220.

Evaluate the sum of all the amicable numbers under 10000.
*/

import java.io.*;
import java.util.*;

public class Problem21 {
	public static void main(String[] args) {
		long startTime = System.currentTimeMillis();
		
		int sumAmic = 504;
		
		for (int i = 221; i < 10000; i++) {
			int sumFactors1 = 1;
			int sumFactors2 = 1;

			for (int j = 2; j <= (i / 2); j++) {
				if (i % j == 0) {
					sumFactors1 += j;
				}
			}

			if (sumFactors1 < 10000 && i != sumFactors1) {
				for (int j = 2; j <= (sumFactors1 / 2); j++) {
					if (sumFactors1 % j == 0)
						sumFactors2 += j;
				}
			}

			if (i == sumFactors2) {
				sumAmic += (i + sumFactors1);
			}
		}

		System.out.println(sumAmic/2);

		long endTime = System.currentTimeMillis();
		long totalTime = endTime - startTime;
		System.out.println("Total run time was " + totalTime + " milliseconds.");
	}
}