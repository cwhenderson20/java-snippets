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