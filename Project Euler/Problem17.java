import java.io.*;
import java.util.*;

public class Problem17 {
	public static void main(String[] args) {
		long startTime = System.currentTimeMillis();
		
		int[] s = {0,3,3,5,4,4,3,5,5,4,3,6,6,8,8,7,7,9,8,8};
		int[] d = {0,3,6,6,5,5,5,7,6,6};
		int h = 7;
		int t = 8;
		int total = 0;

		for (int i = 1; i < 1000; i++) {
			int c = i % 10; // singles digit
			int b = ((i % 100) - c) / 10; // tens digit
			int a = ((i % 1000) - 10 * b - c) / 100; // hundreds digit

			if (a != 0) {
				total += s[a] + h; // eg. [six] hundred
				if (b != 0 || c != 0)
					total += 3; // dealing with the word "and"
			}
			if (b == 0 || b == 1) // ie. if the tens digit is either 0 or 1
				total += s[10 * b + c]; // add the corresponding number's length to total (if b == 0, 10*b == 0 also, thus will simply increment "c" up the array; if b == 1, then 10*b skips past the ones digits and increments "c" up the tens digits)
			else
				total += (d[b] + s[c]); // if tens digit == anything but 0 or 1, add separately the value of the tens digit and ones digit of the number
		}
		total += s[1] + t; // account for "one thousand" at end
		System.out.println(total);

		long endTime = System.currentTimeMillis();
		long totalTime = endTime - startTime;
		System.out.println("Total run time was " + totalTime + " milliseconds.");
	}
}