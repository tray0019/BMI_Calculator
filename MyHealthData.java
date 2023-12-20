package assignment1;


/**
 * The MyHealthData is extend to MyHealthDataBase.
 * This class is use to display all the health
 * information about a patient.
 * 
 * @author Rustom Trayvilla
 * @version 1.1
 * @since	1 | Oct,08/2023
 * @see MyHealthData
 */

public class MyHealthData extends MyHealthDataBase
{
	
	/**
	 * I've instantiated  the MyHealthData base to pass birthYear to 
	 * it's calAge method. 
	 */
	MyHealthDataBase mh = new MyHealthDataBase();
	
	
	private String firstName;
	private String lastName;
	private String gender;
	private int birthYear;
	private int currentYear;
	private double height;
	private double weight;
    


	/*
	 * Initialize MyHealthData patient health informations.
	 */

    


    /**
     * Set all getters and setters but as the 
     * UML assignment has provided no setters 
     * for currentYears.
     */
	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public int getBirthYear() {
		return birthYear;
	}

	public void setBirthYear(int birthYear) {
		this.birthYear = birthYear;
	}

	public int getCurrentYear() {
		return currentYear;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	} 
	
	 /**
	  * getAge takes the patient ages.
	  * This function getAge pass the getBirthYear to 
	  * MyHealthDataBase(mh) in which the calAge()
	  * calculate to get the patients age.
	  */
	 public int getAge() {
			return mh.calAge(getBirthYear());
		}

	/**
	 * This method outputs all information of 
	 * patient health data.
	 */
    public void displayMyHealthData() 
    { 
    	System.out.println("First Name: "+getFirstName());
		System.out.println("Last Name: "+getLastName());
		System.out.println("Gender: "+getGender());
		System.out.printf("Year of Birth: %d",getBirthYear());
		System.out.println("\nHeight (in inches): "+getHeight());
		System.out.println("Weight (in pounds): "+getWeight());
		System.out.println();
		

    	System.out.printf("Age: "+getAge());
    	System.out.printf("\nBMI: %.2f",calculateBMI(weight, height));
    	System.out.printf("%nMaximum Heart Rate: "+mh.getMaximumHeartRate());
    	System.out.printf(mh.getTargetHeartRate());
    	System.out.println();

       System.out.println();
       System.out.println("BMI VALUES");
       System.out.println("Underweight: less than 18.5");
       System.out.println("Normal:      between 18.5 and 24.9");
       System.out.println("Overweight:  between 25 and 29.9");
       System.out.println("Obese:       30 or greater");   
    }

} 