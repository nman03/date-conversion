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
		
		String month = "";
		String day = "";
		String year = "";
		
		if (date.charAt(1) == '/') {
			// Input validation
			if (date.charAt(0) != '1' && date.charAt(0) != '2' && date.charAt(0) != '3' && date.charAt(0) != '4' && date.charAt(0) != '5' && date.charAt(0) != '6' && date.charAt(0) != '7' && date.charAt(0) != '8' && date.charAt(0) != '9') {
				System.out.println("Invalid input. Exiting now!");
				System.exit(1);
			}
			if (date.charAt(0) == '1'){
				month = "January";
			}
			if (date.charAt(0) == '2'){
				month = "February";
			}
			if (date.charAt(0) == '3'){
				month = "March";
			}
			if (date.charAt(0) == '4'){
				month = "April";
			}
			if (date.charAt(0) == '5'){
				month = "May";
			}
			if (date.charAt(0) == '6'){
				month = "June";
			}
			if (date.charAt(0) == '7'){
				month = "July";
			}
			if (date.charAt(0) == '8'){
				month = "August";
			}
			if (date.charAt(0) == '9'){
				month = "September";
			}
			if (date.charAt(4) == '/') {
				// Input validation
				if (date.charAt(2) != '1' && date.charAt(2) != '2' && date.charAt(2) != '3') {
					System.out.println("Invalid input. Exiting now!");
					System.exit(1);
				}
				day = date.substring(2, 4);
				year = date.substring(5);
			}
			if (date.charAt(3) == '/') {
				// Input validation
				if (date.charAt(2) != '1' && date.charAt(2) != '2' && date.charAt(2) != '3' && date.charAt(2) != '4' && date.charAt(2) != '5' && date.charAt(2) != '6' && date.charAt(2) != '7' && date.charAt(2) != '8' && date.charAt(2) != '9') {
					System.out.println("Invalid input. Exiting now!");
					System.exit(1);
				}
				day = date.substring(2, 3);
				year = date.substring(4);
			}
		}
		
		if (date.charAt(2) == '/') {
			if (date.charAt(0) == '1') {
				// Input Validation
				if (date.charAt(1) != '1' && date.charAt(1) != '2' && date.charAt(1) != '3') {
					System.out.println("Invalid input. Exiting now!");
					System.exit(1);
				}
				if (date.charAt(1) == '0') {
					month = "October";
				}
				if (date.charAt(1) == '1') {
					month = "November";
				}
				if (date.charAt(1) == '2') {
					month = "December";
				}
			}
			if (date.charAt(0) == '0') {
				if (date.charAt(1) == '1'){
				month = "January";
				}
				if (date.charAt(1) == '2'){
					month = "February";
				}
				if (date.charAt(1) == '3'){
					month = "March";
				}
				if (date.charAt(1) == '4'){
					month = "April";
				}
				if (date.charAt(1) == '5'){
					month = "May";
				}
				if (date.charAt(1) == '6'){
					month = "June";
				}
				if (date.charAt(1) == '7'){
					month = "July";
				}
				if (date.charAt(1) == '8'){
					month = "August";
				}
				if (date.charAt(1) == '9'){
					month = "September";
				}
			}	
			if (date.charAt(5) == '/') {
			// Input validation
				if (date.charAt(3) != '1' && date.charAt(3) != '2' && date.charAt(3) != '3') {
					System.out.println("Invalid input. Exiting now!");
					System.exit(1);
				}
				day = date.substring(3, 5);
				year = date.substring(6);
			}
			if (date.charAt(4) == '/') {
				// Input validation
				if (date.charAt(3) != '1' && date.charAt(3) != '2' && date.charAt(3) != '3' && date.charAt(3) != '4' && date.charAt(3) != '5' && date.charAt(3) != '6' && date.charAt(3) != '7' && date.charAt(3) != '8' && date.charAt(3) != '9') {
					System.out.println("Invalid input. Exiting now!");
					System.exit(1);
				}
				day = date.substring(3, 4);
				year = date.substring(5);
			}
		}

		// Result
		System.out.printf("\nFormatted Date: %s %s, %s", month, day, year);
	}
}