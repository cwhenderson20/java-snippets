import java.io.*;
import java.util.*;
import java.lang.Math.*;

public class Problem12 {
	public static void main(String[] args) {
		long startTime = System.currentTimeMillis();
		
		int triangle = 0;
		int i = 1;

		while (numberOfDivisors(triangle) < 500) {
			System.out.printf("%s\t%d\t%s\t%d","Triangle:",triangle,"Num Divisors:",numberOfDivisors(triangle));
			System.out.println();
			triangle += i;
			i++;
		}

		System.out.println(triangle);

		long endTime = System.currentTimeMillis();
		long totalTime = endTime - startTime;
		System.out.println("Total run time was " + totalTime + " milliseconds.");
	}

	private static int numberOfDivisors(int number) {
		int divisors = 0;
		int sqrt = (int)Math.sqrt(number);

		for (int i = 1; i <= sqrt; i++) {
			if (number % i == 0) divisors += 2;
		}
		if (sqrt*sqrt == number) divisors--;
		return divisors;
	}
}