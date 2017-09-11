/*
	Author: Neil Manimtim
	Purpose: Convert dates.
 */

import java.util.Scanner;
import java.util.stream.IntStream;

public class MidtermP02 {
	private static String date;

	public static void main(String[] args) {
		// Create scanner
		Scanner in =  new Scanner(System.in);

		do {

			// Prompt user to enter a date (Month/Day/Year)
			System.out.println("Enter a date (Month/Day/Year): ");
			date = in.next();

		} while (!isValid(date));

		// Convert and Print Date
		System.out.print("Converted Date: " + convertDate(date));
	}

	public static boolean isValid(String date) {
		int[] thirthyDayMonths = {4, 6, 9, 11};
		
		// Check if Month is in range [1, 12] and Year greater than 0
		if ((Integer.parseInt(date.substring(0, date.indexOf('/'))) <= 12 &&	
				Integer.parseInt(date.substring(0, date.indexOf('/'))) >= 1) && 
				(Integer.parseInt(date.substring(date.lastIndexOf('/') + 1)) > 0)){
			
			// Check for number of days in February, including Leap Years
			if (Integer.parseInt(date.substring(0, date.indexOf('/'))) == 2) {
				if (Integer.parseInt(date.substring(date.indexOf('/') + 1, date.lastIndexOf('/'))) == 29) {
					if (Integer.parseInt(date.substring(date.lastIndexOf('/') + 1)) % 4 == 0) {
						return true;
					}
				} else if (Integer.parseInt(date.substring(date.indexOf('/') + 1, date.lastIndexOf('/'))) <= 28 &&
						Integer.parseInt(date.substring(date.indexOf('/') + 1, date.lastIndexOf('/'))) >= 1) {
					return true;
				}
				
			} 
			
			// Check if days are in range [1, 30] or [1, 31] for the corresponding months
			else if (IntStream.of(thirthyDayMonths).anyMatch(x -> x == Integer.parseInt(date.substring(0, date.indexOf('/'))))) {
				if (Integer.parseInt(date.substring(date.indexOf('/') + 1, date.lastIndexOf('/'))) <= 30 &&
						Integer.parseInt(date.substring(date.indexOf('/') + 1, date.lastIndexOf('/'))) >= 1) {
					return true;	
				}
			} else {
				if (Integer.parseInt(date.substring(date.indexOf('/') + 1, date.lastIndexOf('/'))) <= 31 &&
						   Integer.parseInt(date.substring(date.indexOf('/') + 1, date.lastIndexOf('/'))) >= 1) {
					return true;
				}	
			}
		}	
		
		System.out.println("Invalid Date, Try Again!");
		return false;
	}

	public static String[] createMonthArray() {
		String[] monthArray = { "January", "February", "March", "April", "May", "June",
				"July", "August", "September", "October", "November", "December"};

		return monthArray;
	}

	public static String convertDate(String date) {
		// Create Month array
		String[] array = createMonthArray();

		String convertedDate = array[Integer.parseInt(date.substring(0, date.indexOf('/'))) - 1] + 
				" " + date.substring(date.indexOf('/') + 1, date.lastIndexOf('/')) +
				", " + date.substring(date.lastIndexOf('/') + 1);

		return convertedDate;
	}
}
