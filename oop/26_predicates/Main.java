import java.util.Collections;
import java.util.List;
import java.util.ArrayList;
import java.util.function.Predicate;

public class Main{
	public static void main(String[] args) {
		
		List<Person> personList = add();

		//question 1
        personList.removeIf((Predicate<Person>)(person -> person.getAge() < 50));
        for (Person person: personList)
        	System.out.println(person.getName() + " is " + person.getAge() + " years old.");
        
        //question 2
        System.out.println("\n\n");
        personList = add();
        personList.removeIf((Predicate<Person>)(person -> person.getGender().equals(Gender.MALE)));
        for (Person person: personList)
        	System.out.println(person.getName() + " is " + person.getGender());

        //question 3
        personList = add();
        System.out.println("\n\n");
        Predicate<Person> predicateAge = person -> person.getAge() <50;
        Predicate<Person> predicateGender = person -> person.getGender().equals(Gender.MALE);
        personList.removeIf((Predicate<Person>)predicateAge.and(predicateGender));
        for (Person person: personList)
        	System.out.println(person.getName() + " is " + person.getGender() + " and is " + person.getAge() + " years old");

        //question 4
        personList = add();
        System.out.println("\n\n");
        personList.removeIf((Predicate<Person>)predicateAge.or(predicateGender));
        for (Person person: personList)
        	System.out.println(person.getName() + " is " + person.getGender() + " and is " + person.getAge() + " years old");


        //question 5
        System.out.println("\n\n");
        personList = add();
        personList.removeIf(((Predicate<Person>)(person->person.getCity().equals(City.LISBON))).negate());
        for (Person person: personList)
        	System.out.println(person.getName() + " is from " + person.getCity());
        

	}

	public static List<Person> add(){
		Person person1 = new Person("Krystelle", "Rupnarain", 21, Gender.FEMALE, City.JOHANNESBURG);
		Person person2 = new Person("Samantha", "Figueiredo", 60, Gender.FEMALE, City.LISBON);
		Person person3 = new Person("Tumi", "Maleka", 45, Gender.FEMALE, City.POLOKWANE);
		Person person4 = new Person("Xavier", "Naidoo", 30, Gender.MALE, City.NEW_DEHLI);
		Person person5 = new Person("Ghislain-Claude", "Ilunga", 51, Gender.MALE, City.KISHARA);
		Person person6 = new Person("Aaron", "Padiachy", 55, Gender.MALE, City.SRI_JAYAWARDENEPURA_KOTTE);

		List<Person> personList = new ArrayList<>();

		// Add Person objects to the list
        personList.add(person1);
        personList.add(person2);
        personList.add(person3);
        personList.add(person4);
        personList.add(person5);
        personList.add(person6);

        return personList;
	}
}