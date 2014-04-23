import java.io.*;
import java.util.*;

public class Problem2 {
	public static void main(String args[]) {
		double minus1 = 2;
		double current = 3;
		double sum = 2;
		double temp;

		while (current <= 4000000) {
			temp = current;
			current += minus1;
			System.out.println("temp = " + temp + ", " + "current = " + current + ", " + "minus1 = " + minus1 + ", sum = " + sum);
			if (current%2 == 0) sum += current;
			System.out.println("current= " + current);
			minus1 = temp;
		}
		System.out.println(sum);
	}
}