import java.util.*;
import java.io.*;

public class Problem4 {
	public static void main(String[] args) {
		int i = 999;
		int max = 0;
		for (int k = 0; k < 999; k++) {
			for (int l = 0; l <= k; l++) {
				if (isPalindrome(String.valueOf((i - l)*(i - k))) && ((i-l)*(i-k)) > max) {
					max = (i-l)*(i-k);
				}
			}
		}
		System.out.println(max);
	}

	public static boolean isPalindrome(String s) {
		return palindromeHelper(s,0,s.length()-1);
	}
	private static boolean palindromeHelper(String s, int lo, int hi) {
		if (s.length() == 0 || s.length() == 1) return true;
		if (s.charAt(lo) == s.charAt(hi)) {
			return isPalindrome(s.substring(1,s.length()-1));
		}
		return false;
	}
}