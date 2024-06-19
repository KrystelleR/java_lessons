public class Person{
	private String name;
	private String surname;
	private int age;
	private Gender gender;
	private City city;

	public Person(String name, String surname, int age, Gender gender, City city){
		setName(name);
		setSurname(surname);
		setAge(age);
		setGender(gender);
		setCity(city); 
	}

	public String getName(){
		return this.name;
	}

	public void setName(String name){
		this.name = name;
	}

	public String getSurname(){
		return this.surname;
	}

	public void setSurname(String surname){
		this.surname = surname;
	}

	public int getAge(){
		return this.age;
	}

	public void setAge(int age){
		this.age = age;
	}

	public Gender getGender(){
		return this.gender;
	}

	public void setGender(Gender gender){
		this.gender = gender;
	}

	public City getCity(){
		return this.city;
	}

	public void setCity(City city){
		this.city = city;
	}
}