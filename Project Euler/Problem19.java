/* Problem 19: Counting Sundays
You are given the following information, but you may prefer to do some research for yourself.

1 Jan 1900 was a Monday.
Thirty days has September,
April, June and November.
All the rest have thirty-one,
Saving February alone,
Which has twenty-eight, rain or shine.
And on leap years, twenty-nine.
A leap year occurs on any year evenly divisible by 4, but not on a century unless it is divisible by 400.

How many Sundays fell on the first of the month during the twentieth century (1 Jan 1901 to 31 Dec 2000)?
*/

import java.io.*;
import java.util.*;

public class Problem19 {
	public static void main(String[] args) {
		long startTime = System.currentTimeMillis();

		int year = 1901;
		int identifier = 1;
		int numDays = 0;
		int numSuns = 0;

		while (year < 2001) {
			for (int month = 1; month <= 12; month++) {
				switch (month) {
					case 1: case 3: case 5: case 7: case 8: case 10: case 12:
						numDays = 31;
						break;
					case 4: case 6: case 9: case 11:
						numDays = 30;
						break;
					case 2:
						if (((year % 4 == 0) && !(year % 100 == 0) || (year % 400 == 0)))
							numDays = 29;
						else
							numDays = 28;
						break;
					default:
						System.out.println("Invalid month.");
						break;
				}
				identifier += numDays;
				if ((identifier - 6) % 7 == 0)
					numSuns++;
			}
			year++;
		}
		System.out.println(numSuns);

		long endTime = System.currentTimeMillis();
		long totalTime = endTime - startTime;
		System.out.println("Total run time was " + totalTime + " milliseconds.");
	}
}