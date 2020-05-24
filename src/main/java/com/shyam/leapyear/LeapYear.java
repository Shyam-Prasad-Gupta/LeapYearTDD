package com.shyam.leapyear;

import java.util.Scanner;

public class LeapYear {

	private static Scanner scn = null;

	/**
	 * Driver program.
	 * 
	 * @param args
	 */
	public static void main(String... args) {
		// initialize the scanner with system keyboard as input source.
		scn = new Scanner(System.in);
		int testCases = scn.nextInt();
		while (testCases-- > 0) {
			int year = scn.nextInt();
			System.out.println(year + " is " + (checkForLeapYear(year) ? "a" : "not a") + " leap year.");
		}
	}

	/**
	 * This method checks if the input parameter is a leap year or not.
	 * 
	 * @param year year to be check for leap year.
	 * @return returns {@code true} if the year is a leap year else false.
	 */
	public static boolean checkForLeapYear(int year) {
		if (year % 4 == 0) {
			if (year % 100 == 0) {
				if (year % 400 == 0)
					return Boolean.TRUE;// A Leap Year;
				else
					return Boolean.FALSE;// Not a Leap Year;
			} else
				return Boolean.TRUE;// A Leap Year;
		} else
			return Boolean.FALSE;// Not a Leap Year;
	}
}
