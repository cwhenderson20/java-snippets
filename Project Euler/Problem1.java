/* Problem 1: Multiples of 3 and 5
If we list all the natural numbers below 10 that are multiples of 3 or 5, we get 3, 5, 6 and 9. The sum of these multiples is 23.
Find the sum of all the multiples of 3 or 5 below 1000.
*/

import java.io.*;
import java.util.*;

public class Problem1 {
	public static void main(String args[]) {
		int xmult = 1;
		int ymult = 1;
		int xsum = 0;
		int ysum = 0;

		while (3 * xmult < 1000) {
			xsum += (3 * xmult);
			xmult++;
		}

		while (5 * ymult < 1000) {
			if ((5 * ymult) % 3 != 0) {
				ysum += (5 * ymult);
			}
			ymult++;
		}

		System.out.println(xsum + ysum);
	} 
}