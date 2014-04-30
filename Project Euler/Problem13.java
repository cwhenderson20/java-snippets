/* Problem 13: Large Sum
Work out the first ten digits of the sum of the following one-hundred 50-digit numbers.

37107287533902102798797998220837590246510135740250
46376937677490009712648124896970078050417018260538
74324986199524741059474233309513058123726617309629
91942213363574161572522430563301811072406154908250
23067588207539346171171980310421047513778063246676
89261670696623633820136378418383684178734361726757
28112879812849979408065481931592621691275889832738
44274228917432520321923589422876796487670272189318
47451445736001306439091167216856844588711603153276
70386486105843025439939619828917593665686757934951
...
*/

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