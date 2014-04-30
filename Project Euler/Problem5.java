/* Problem 5: Smallest Multiple
2520 is the smallest number that can be divided by each of the numbers from 1 to 10 without any remainder.
What is the smallest positive number that is evenly divisible by all of the numbers from 1 to 20?
*/

import java.io.*;
import java.util.*;

public class Problem5 {
	public static void main(String[] args) {
		long startTime = System.currentTimeMillis();

		int number = 2520;
		
		for (int i = 2; i <= 20; i++) {
			if (number % i != 0) {
				number++;
				i = 2;
			}
		}
		System.out.println(number);

		long endTime = System.currentTimeMillis();
		long totalTime = endTime - startTime;
		System.out.println("Total run time was " + totalTime + " milliseconds.");
	}
}