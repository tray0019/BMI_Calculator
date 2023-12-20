package assignment1;
import java.time.*;

/**
 * MyHealthDataBase is a base class to be extended for the 
 * Electronic Health Records (EHR) System,
 * also known as Assignment 1.  It contains a method to 
 * calculate BMI and will contain other methods.
 * 
 * @author Rustom Trayvilla
 * @version 1.1
 * @since	1 | Oct,08/2023
 * @see MyHealthDataTest, MyHealthData
 */

public class MyHealthDataBase 
{
	/**
	 * Initialized the an integer called results
	 * to be use to calculate age.
	 */
	int results;
	
	/**
	 * Initialize local date to use the current year.
	 */
	LocalDate date = LocalDate.now();
    
	/** 
    * This method returns the calculated Body Mass Index (BMI) from data provided.
    * @param weightParam Weight of the patient in pounds.
    * @param heightParam Height of the patient in inches.
    */
    public double calculateBMI(double weightParam, double heightParam)
    {
        return weightParam * 703 / (heightParam * heightParam);
    }
    
    
    /**
     * This method returns the age of patient.
     * @param iParam takes the getBirthYear from the MyHealthData class.
     * @return the value of patient age.
     */
    public int calAge(int i) {
		return results = date.getYear() - i; 
	}

	/**
	 * This method calculates the patient maximum heart rate.
	 * @return the value of patient Maximum Heart Rate.
	 */
	public int getMaximumHeartRate(){
		return 220 - results;
	}
	
	/**
	 * This method calculate both the minimum target heart rate
	 * and maximum target heart rate. 
	 * @return the output of both min and max target heart rate.
	 */
	public String getTargetHeartRate() {
		double MinimumTargetHeartRate = 0.5 * getMaximumHeartRate() ;
		double MaximumTargetHeartRate = 0.85 * getMaximumHeartRate();

	return String.format("%nMinimum Target Heart Rate: "+MinimumTargetHeartRate+ "%nMaximum Target Heart Rate: "+MaximumTargetHeartRate);
	}
	
	/**
	 * 
	 * This method is part of the assignment requirement.
	 * @param weightParam Weight of the patient in pounds.
     * @param heightParam Height of the patient in inches.
	 * 
	 */
	public double incorrectBMI(double weightParam, double heightParam)
    {
        return weightParam * 704/ (heightParam * heightParam);
    }
	
}