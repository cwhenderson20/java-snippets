import java.io.*;
import java.util.*;

public class Problem18 {
	public static void main(String[] args) throws Exception {
		long startTime = System.currentTimeMillis();
		
		BufferedReader infile = new BufferedReader(new FileReader(args[0]));
		Scanner scan = new Scanner(infile);
		int[][] array = new int[15][15];

		for (int i = 0; i < 15; i++) { // Fill array with 0's
			for (int j = 0; j < 15; j++)
				array[i][j] = 0;
		}
		while (scan.hasNextInt()) { // Fill array with numbers
			int rowMax = 0;
			while (rowMax < 15) {
				for (int i = 0; i < 15; i++) {
					for (int j = 0; j <= rowMax; j++)
						array[i][j] = scan.nextInt();
					rowMax++;
				}
			} 
		}

		int rowMax = 14;
		for (int i = 13; i >= 0; i--) {
			for (int j = 0; j < rowMax; j++) {
				int leftSum = array[i][j] + array[i+1][j];
				int rightSum = array[i][j] + array[i+1][j+1];
				if (rightSum > leftSum) array[i][j] = rightSum;
				else array[i][j] = leftSum;			
			}
			rowMax--;	
		}
		
		System.out.println(array[0][0]);

		long endTime = System.currentTimeMillis();
		long totalTime = endTime - startTime;
		System.out.println("Total run time was " + totalTime + " milliseconds.");
	}
}