import java.io.*;
import java.util.*;

public class Problem6 {
	public static void main(String[] args) {
		int sum = 0;
		final int SQUARE_SUM = 25502500;
		for (int i = 1; i <= 100; i++) {
			sum += (i*i);
		}

		System.out.println(SQUARE_SUM - sum);
	}
}