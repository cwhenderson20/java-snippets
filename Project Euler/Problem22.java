/* Problem 22: Names Scores
Using names.txt, a 46K text file containing over five-thousand first names, begin by sorting it into alphabetical order.
Then working out the alphabetical value for each name, multiply this value by its alphabetical position in the list to obtain a name score.

For example, when the list is sorted into alphabetical order, COLIN, which is worth 3 + 15 + 12 + 9 + 14 = 53, is the 938th name in the list. 
So, COLIN would obtain a score of 938 × 53 = 49714.

What is the total of all the name scores in the file?
*/

import java.io.*;
import java.util.*;
import java.util.regex.*;

public class Problem22 {
	public static void main(String[] args) throws Exception {
		long startTime = System.currentTimeMillis();
		
		BufferedReader namesFile = new BufferedReader(new FileReader(args[0]));
		//ArrayList<String> names = new ArrayList<String>(Arrays.asList(namesFile.readLine().replaceAll("\"", "").split(","))); // This method also works; do not use Pattern or Matcher if using this method, which is slightly slower.
		ArrayList<String> names = new ArrayList<String>();
		String text = namesFile.readLine();
		int totalScore = 0;
		Pattern quotesPattern = Pattern.compile("\"(([^\"\\,])*)\"");
		Matcher quotesMatcher = quotesPattern.matcher(text);
		
		while (quotesMatcher.find()) {
			names.add(quotesMatcher.group(1));
		}

		Collections.sort(names);
		
		int cnt = 1;
		for (String s : names) {
			int nameScore = 0;
			for (int i = 0; i < s.length(); i++) {
				char c = s.charAt(i);
				nameScore += (c - 64);
			}
			int compositeScore = nameScore * cnt;
			totalScore += compositeScore;
			cnt++;
		}
		
		System.out.println(totalScore);

		long endTime = System.currentTimeMillis();
		long totalTime = endTime - startTime;
		System.out.println("Total run time was " + totalTime + " milliseconds.");
	}
}