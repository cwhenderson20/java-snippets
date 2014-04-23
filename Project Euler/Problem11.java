import java.io.*;
import java.util.*;

public class Problem11 {
	public static void main(String[] args) throws Exception {
		long startTime = System.currentTimeMillis();
		BufferedReader infile = new BufferedReader(new FileReader(args[0]));
		Scanner scan = new Scanner(infile);
		int [][] numbers = new int[20][20];
		int product;
		int max = 0;

		while (scan.hasNextInt()) {
			for (int j = 0; j < 20; j++) {
				for (int i = 0; i < 20; i++) {
					numbers[i][j] = scan.nextInt();
				}
			}
		}

		// Horizontal products
		for (int j = 0; j < 20; j++) {
			for (int i = 0; i < 17; i++) {
				product = numbers[j][i]*numbers[j][i+1]*numbers[j][i+2]*numbers[j][i+3];
				if (product > max) max = product;
			}
		}
		
		// Vertical products
		for (int i = 0; i < 20; i++) {
			for (int j = 0; j < 17; j++) {
				product = numbers[j][i]*numbers[j+1][i]*numbers[j+2][i]*numbers[j+3][i];
				if (product > max) max = product;
			}
		}

		// Diagonally right
		for (int i = 0; i < 17; i++) {
			for (int j = 0; j < 17; j++) {
				product = numbers[i][j] * numbers[i+1][j+1] * numbers[i+2][j+2] * numbers[i+3][j+3];
				if (product > max) max = product;
			}
		}

		// Diagonally left
		for (int i = 0; i < 17; i++) {
			for (int j = 3; j < 20; j++) {
				product = numbers[i][j] * numbers[i+1][j-1] * numbers[i+2][j-2] * numbers[i+3][j-3];
				if (product > max) max = product;
			}
		}

		System.out.println(max);

		long endTime = System.currentTimeMillis();
		long totalTime = endTime - startTime;
		System.out.println("Total run time was " + totalTime + " milliseconds.");
	}
}