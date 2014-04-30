/* Problem 7: 10001st Prime
By listing the first six prime numbers: 2, 3, 5, 7, 11, and 13, we can see that the 6th prime is 13.
What is the 10 001st prime number?
*/

import java.io.*;
import java.util.*;

public class Problem7 {
	public static void main(String[] args) {
		long startTime = System.currentTimeMillis();

		long numberOfPrimes = 0;
		int number = 1;
		int limit = 10474300;
		boolean[] sieve = new boolean[limit];

		for (int i = 2; i < limit; i++) {
			if (sieve[i] == true) continue;
			numberOfPrimes++;
			
			if (numberOfPrimes == 10001) {
				number = i;
				break;
			}
			for (int j = i+i; j < limit; j += i) {
				sieve[j] = true;
			}
		}
		System.out.println(number);

		long endTime = System.currentTimeMillis();
		long totalTime = endTime - startTime;
		System.out.println("Total run time was " + totalTime + " milliseconds.");
	}
}

// Implements the Sieve of Eratosthenes in solving the problem 