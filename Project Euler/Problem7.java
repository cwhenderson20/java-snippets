import java.io.*;
import java.util.*;

public class Problem7 {
	public static void main(String[] args) {
		long numberOfPrimes = 0;
		int number = 1;
		int limit = 10474300;
		boolean[] sieve = new boolean[limit];

		for (int i = 2; i < limit; i++) {
			if (sieve[i] == true) continue;
			numberOfPrimes++;
			
			if (numberOfPrimes == 10001) {
				number = i;
				break;
			}
			for (int j = i+i; j < limit; j += i) {
				sieve[j] = true;
			}
		}
		System.out.println(number);
	}
}