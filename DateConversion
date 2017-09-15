import java.util.Scanner;
import java.util.stream.IntStream;

public class DateConversion {
	private static int month, day, year;

	public static void main(String[] args) {
		// Create scanner
		Scanner in =  new Scanner(System.in);

		do {
			// Prompt user to enter a date (Month/Day/Year)
			System.out.println("Enter a date (Month/Day/Year): ");
			String date = in.next();
			
			// Split date into parts
			month = Integer.parseInt(date.substring(0, date.indexOf('/')));
			day = Integer.parseInt(date.substring(date.indexOf('/') + 1, date.lastIndexOf('/')));
			year = Integer.parseInt(date.substring(date.lastIndexOf('/') + 1));

		} while (!isValid());

		// Convert and Print Date
		System.out.print("Converted Date: " + convertDate());
	}

	public static boolean isValid() {
		int[] thirthyDayMonths = {4, 6, 9, 11};
		
		// Check if Month is in range [1, 12] and Year greater than 0
		if (month <= 12 && month >= 1 && year > 0){
			
			// Check for number of days in February, including Leap Years
			if (month == 2) {
				if (day == 29) {
					if (year % 4 == 0) {
						return true;
					}
				} else if (day <= 28 && day >= 1) {
					return true;
				}
				
			} 
			
			// Check if days are in range [1, 30] or [1, 31] for the corresponding months
			else if (IntStream.of(thirthyDayMonths).anyMatch(x -> x == month)) {
				if (day <= 30 && day >= 1) {
					return true;	
				}
			} else {
				if (day <= 31 && day >= 1) {
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

	public static String convertDate() {
		// Create Month array
		String[] array = createMonthArray();
		
		// Convert date
		String convertedDate = array[month - 1] + " " + day + ", " + year;
		
		return convertedDate;
	}
}
