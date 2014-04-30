/* Problem 25: 1000-digit Fibonacci Number
The Fibonacci sequence is defined by the recurrence relation:
Fn = Fn−1 + Fn−2, where F1 = 1 and F2 = 1.

Hence the first 12 terms will be:
F1 = 1
F2 = 1
F3 = 2
F4 = 3
F5 = 5
F6 = 8
F7 = 13
F8 = 21
F9 = 34
F10 = 55
F11 = 89
F12 = 144

The 12th term, F12, is the first term to contain three digits.
What is the first term in the Fibonacci sequence to contain 1000 digits?
*/

import java.io.*;
import java.util.*;
import java.math.*;

public class Problem25 {
	public static void main(String[] args) {
		long startTime = System.currentTimeMillis();
		
		BigInteger last = new BigInteger("1");
		BigInteger fib = new BigInteger("2");
		int cnt = 3;

		while (fib.toString().length() != 1000) {
			BigInteger temp = fib;
			fib = fib.add(last);
			last = temp;
			cnt++;
		}
		System.out.println(cnt);
		
		long endTime = System.currentTimeMillis();
		long totalTime = endTime - startTime;
		System.out.println("Total run time was " + totalTime + " milliseconds.");
	}
}