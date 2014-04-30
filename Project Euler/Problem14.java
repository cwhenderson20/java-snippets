/* Problem 14: Longest Collatz Sequence
The following iterative sequence is defined for the set of positive integers:
n → n/2 (n is even)
n → 3n + 1 (n is odd)

Using the rule above and starting with 13, we generate the following sequence:
13 → 40 → 20 → 10 → 5 → 16 → 8 → 4 → 2 → 1

It can be seen that this sequence (starting at 13 and finishing at 1) contains 10 terms. Although it has not been proved yet (Collatz Problem), it is thought that all starting numbers finish at 1.
Which starting number, under one million, produces the longest chain?

NOTE: Once the chain starts the terms are allowed to go above one million.
*/

import java.io.*;
import java.util.*;

public class Problem14 {
	public static void main(String[] args) {
		long startTime = System.currentTimeMillis();
		
		int starting = 999999;
		int maxLength = 0;

		for (int i = starting; i > 0 ; i--) {
			int length = 0;
			double j = i;
			while (j > 1) {
				if (j % 2 == 0) {
					j = j/2;
					length++;
				}
				else {
					j = 3*j + 1;
					length++;
				}
			}
			if (length > maxLength) {
				maxLength = length;
				starting = i;
			}
		}
		System.out.printf("With starting number %d, the max length of the sequence is %d.", starting, maxLength);
		System.out.println();
		
		long endTime = System.currentTimeMillis();
		long totalTime = endTime - startTime;
		System.out.println("Total run time was " + totalTime + " milliseconds.");
	}
}