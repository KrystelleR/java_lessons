 import java.util.Date;
 import java.util.Calendar;

 public class Person{
	private Date dateOfBirth;
	private int age;
	private String name;
	private String surname;
	private int daysToNextBirthday;

	public Person(Date dateOfBirth, String name, String surname){
		this.dateOfBirth = dateOfBirth;
        this.name = name;
        this.surname = surname;
        // Calculate age from date of birth
        this.age = calculateAge(dateOfBirth, new Date());
        this.daysToNextBirthday = daysUntilNextBirthday(dateOfBirth);
	}

	public void setDateOfBirth(Date dateOfBirth){
		this.dateOfBirth = dateOfBirth;
	}
	public void setAge(int age){
		this.age = age;
	}
	public void setDaysToNextBirthday(int daysToNextBirthday){
		this.daysToNextBirthday = daysToNextBirthday;
	}
	public void setName(String name){
		this.name = name;
	}
	public void setSurname(String surname){
		this.surname = surname;
	}
	public Date getDateOfBirth(){
		return this.dateOfBirth;
	}
	public int getAge(){
		return this.age;
	}
	public int getDaysToNextBirthday(){
		return this.daysToNextBirthday;
	}
	public String getName(){
		return this.name;
	}
	public String getSurname(){
		return this.surname;
	}

    public static int calculateAge(Date dob, Date currentDate) {
        // Get the year, month, and day from the dates
        int yearOfBirth = dob.getYear() + 1900; // Year is 1900-based in java.util.Date
        int monthOfBirth = dob.getMonth();
        int dayOfBirth = dob.getDate();

        int currentYear = currentDate.getYear() + 1900;
        int currentMonth = currentDate.getMonth();
        int currentDay = currentDate.getDate();

        // Calculate the age
        int age = currentYear - yearOfBirth;

        // Adjust age based on month and day of birth
        if (currentMonth < monthOfBirth || (currentMonth == monthOfBirth && currentDay < dayOfBirth)) {
            age--;
        }

        return age;
    }

    public static int daysUntilNextBirthday(Date birthDate) {
        // Get the current date
        Calendar today = Calendar.getInstance();
        
        // Extract month and day from the birth date
        Calendar birthDay = Calendar.getInstance();
        birthDay.setTime(birthDate);
        int birthMonth = birthDay.get(Calendar.MONTH);
        int birthDayOfMonth = birthDay.get(Calendar.DAY_OF_MONTH);
        
        // Set the next birthday to this year's birth date
        Calendar nextBirthday = Calendar.getInstance();
        nextBirthday.set(Calendar.MONTH, birthMonth);
        nextBirthday.set(Calendar.DAY_OF_MONTH, birthDayOfMonth);
        
        // If this year's birthday has already passed, set the next birthday to next year
        if (today.after(nextBirthday)) {
            nextBirthday.add(Calendar.YEAR, 1);
        }
        
        // Calculate the difference in milliseconds
        long differenceInMillis = nextBirthday.getTimeInMillis() - today.getTimeInMillis();
        
        // Convert milliseconds to days
        int daysUntilNextBirthday = (int) (differenceInMillis / (1000 * 60 * 60 * 24));
        
        return daysUntilNextBirthday;
    }


    // Override hashCode to hash on age
    @Override
    public int hashCode() {
        return age;
    }
}