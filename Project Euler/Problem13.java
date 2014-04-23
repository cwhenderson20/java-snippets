import java.io.*;
import java.util.*;

public class Problem13 {
	public static void main(String[] args) throws Exception {
		long startTime = System.currentTimeMillis();
		BufferedReader infile = new BufferedReader(new FileReader(args[0]));
		double sum = 0;
		while (infile.ready()) {
			sum += Double.parseDouble(infile.readLine().substring(0,12)); // Only digits 0-11 can affect digits up to 10 (for the first 100 numbers, and since this is only 50, it holds)
		}
		System.out.println(sum);		

		long endTime = System.currentTimeMillis();
		long totalTime = endTime - startTime;
		System.out.println("Total run time was " + totalTime + " milliseconds.");
	}
}