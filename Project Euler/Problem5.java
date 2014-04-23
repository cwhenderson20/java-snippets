import java.io.*;
import java.util.*;

public class Problem5 {
	public static void main(String[] args) {
		int number = 2520;
		for (int i = 2; i <= 20; i++) {
			if (number % i != 0) {
				number++;
				i = 2;
			}
		}
		System.out.println(number);
	}
}