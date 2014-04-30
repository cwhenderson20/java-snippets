/* Problem 4: Largest Palindrome Product
A palindromic number reads the same both ways. The largest palindrome made from the product of two 2-digit numbers is 9009 = 91 × 99.
Find the largest palindrome made from the product of two 3-digit numbers.
*/

import java.util.*;
import java.io.*;

public class Problem4 {
	public static void main(String[] args) {
		long startTime = System.currentTimeMillis();

		int i = 999;
		int max = 0;
		for (int k = 0; k < 999; k++) {
			for (int l = 0; l <= k; l++) {
				if (isPalindrome(String.valueOf((i - l) * (i - k))) && ((i - l) * (i - k)) > max)
					max = (i - l) * (i - k);
			}
		}

		System.out.println(max);

		long endTime = System.currentTimeMillis();
		long totalTime = endTime - startTime;
		System.out.println("Total run time was " + totalTime + " milliseconds.");
	}

	public static boolean isPalindrome(String s) {
		return palindromeHelper(s,0,s.length() - 1);
	}
	private static boolean palindromeHelper(String s, int lo, int hi) {
		if (s.length() == 0 || s.length() == 1) return true;
		if (s.charAt(lo) == s.charAt(hi)) {
			return isPalindrome(s.substring(1,s.length() - 1));
		}
		return false;
	}
}