/*
	Author: Neil Manimtim
	Purpose: Convert dates.
*/

import java.util.Scanner;

public class MidtermP02 {
	public static void main(String[] args) {
		// Create scanner
		Scanner in =  new Scanner(System.in);
		
		// Prompt user to enter a date (Month/Day/Year)
		System.out.print("Enter a date (Month/Day/Year): ");
		String date = in.next();
		
		// Convert and Print Date
		System.out.print("\nConverted Date: " + convertDate(date));
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
