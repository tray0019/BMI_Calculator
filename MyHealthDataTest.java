package assignment1;
import java.util.Scanner;

/**
 * This main class takes user input for
 * all health data requirements and display,
 * calculate patient health information.
 * 
 * @author Rustom Trayvilla
 * @version 1.1
 * @since	1 | Oct,08/2023
 * @see MyhealthDataTest
 */

public class MyHealthDataTest {
	
	/**
	 * Instantiated MyHealthData and use scanner for
	 * user input.
	 * @param args
	 */
	public static void main(String[] args) {
		MyHealthData MHD = new MyHealthData();
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter your first name");
		String firstName = sc.nextLine();
		MHD.setFirstName(firstName);
		
		System.out.println("Enter your last name");
		String lastName = sc.nextLine();
		MHD.setLastName(lastName);
		
		System.out.println("Enter your gender");
		String gender = sc.nextLine();
		MHD.setGender(gender);
		
		System.out.println("Enter your year of birth");
		int birthYear = sc.nextInt();
		MHD.setBirthYear(birthYear);
		
		System.out.println("Enter your height(in inches)");
		double height = sc.nextDouble();
		MHD.setHeight(height);
		
		System.out.println("Enter your weight(in pounds)");
		double weight = sc.nextDouble();
		MHD.setWeight(weight);
		

		MHD.displayMyHealthData();
		System.out.println("Program By Rustom Trayvilla");

	}
	
	
	

}
