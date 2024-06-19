import java.util.Date;
import java.util.List;
import java.util.Collections;
import java.util.ArrayList;
import java.util.Calendar;

public class LambdaMain6 {
    public static void main(String[] args) {

        Calendar birthDate1 = Calendar.getInstance();
        birthDate1.set(2002, Calendar.NOVEMBER, 11);
        Date dateOfBirth1 = birthDate1.getTime();

        Calendar birthDate2 = Calendar.getInstance();
        birthDate2.set(2000, Calendar.APRIL, 1);
        Date dateOfBirth2 = birthDate2.getTime();

        Calendar birthDate3 = Calendar.getInstance();
        birthDate3.set(1998, Calendar.DECEMBER, 22);
        Date dateOfBirth3 = birthDate3.getTime();


        List<Person> persons = new ArrayList<>();
        persons.add(new Person(dateOfBirth1, "John", "Doe"));
        persons.add(new Person(dateOfBirth2, "Alice", "Smith"));
        persons.add(new Person(dateOfBirth3, "Bob", "Johnson"));

        // Sort the list by surname descendign using a lambda comparator
        Collections.sort(persons, (p1, p2) -> p2.getSurname().compareTo(p1.getSurname()));

        // Print the sorted list
        for (Person person : persons) {
            System.out.println("Name: " + person.getName() + ", Age: " + person.getAge() + ", days till next birthday: " + person.getDaysToNextBirthday());
        }
    }
}
