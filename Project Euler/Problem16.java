import java.io.*;
import java.util.*;
import java.math.*;

public class Problem16 {
	public static void main(String[] args) {
		BigInteger number = new BigInteger("2");
		number = number.pow(1000);
		int sum1 = 0;
		int sum2 = 0;
		String s = number.toString();
		
		// Method 1
		long startTime1 = System.currentTimeMillis();		
		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			sum1 += (c - '0');
		}
		long endTime1 = System.currentTimeMillis();

		// Method 2
		long startTime2 = System.currentTimeMillis();
		ArrayList<String> digits = new ArrayList<String>();
		for (int i = 0; i < s.length(); i++) {
			digits.add(String.valueOf(s.charAt(i)));
		}
		for (String d : digits) {
			sum2 += Integer.valueOf(d);
		}
		long endTime2 = System.currentTimeMillis();

		System.out.println(sum1);

		long totalTime1 = endTime1 - startTime1;
		long totalTime2 = endTime2 - startTime2;
		System.out.println("Total run time for Method 1 was " + totalTime1 + " milliseconds.");
		System.out.println("Total run time for Method 2 was " + totalTime2 + " milliseconds.");
	}
}