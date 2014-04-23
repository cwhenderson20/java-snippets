import java.io.*;
import java.util.*;

public class Problem1 {
	public static void main(String args[]) {
		int x = 3;
		int y = 5;
		int xmult = 1;
		int ymult = 1;
		int xsum = 0;
		int ysum = 0;

		while (x*xmult < 1000) {
			xsum += (x * xmult);
			xmult++;
		}

		while (y*ymult < 1000) {
			if ((y*ymult) %3 != 0) {
				ysum += (y * ymult);
			}
			ymult++;
		}

		System.out.println(xsum + ysum);
	} 
}