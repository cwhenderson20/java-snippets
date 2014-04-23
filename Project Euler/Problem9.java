import java.io.*;
import java.util.*;
import java.lang.Math.*;

public class Problem9 {
	public static void main(String[] args) {
		double c = 0;
		boolean found = false;

		for (int b = 997; b > 0; b--) {
			for (int a = b - 1; a > 0; a--) {
				c = Math.sqrt(a*a + b*b);
				if (a+b+c == 1000) {
					System.out.println(a*b*c);
					System.exit(0);
				}
			}
		}
	}
}