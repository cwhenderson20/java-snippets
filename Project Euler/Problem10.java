import java.io.*;
import java.util.*;

public class Problem10 {
	public static void main(String[] args) {
		long startTime = System.currentTimeMillis();
		int number = 1;
		int limit = 2000000;
		double sum = 0;
		boolean[] sieve = new boolean[limit];
		ArrayList<Integer> primes = new ArrayList<Integer>();

		for (int i = 2; i < limit; i++) {
			if (sieve[i] != true) {
				number = i;
				primes.add(number);
			}	
			for (int j = i+i; j < limit; j += i) {
				sieve[j] = true;
			}
		}
		
		for (Integer entry : primes) {
			sum += entry;
		}
		System.out.println(sum);
		long endTime = System.currentTimeMillis();
		long totalTime = (endTime - startTime);
		System.out.println(totalTime + " milliseconds of runtime.");
	}
}