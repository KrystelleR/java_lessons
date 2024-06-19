import java.util.Date;
import java.util.List;
import java.util.Collections;
import java.util.ArrayList;

public class LambdaMain2 {
    public static void main(String[] args) {
        List<Person> persons = new ArrayList<>();
        persons.add(new Person(new Date(80, 0, 1), "John", "Doe"));
        persons.add(new Person(new Date(90, 0, 1), "Alice", "Smith"));
        persons.add(new Person(new Date(70, 0, 1), "Bob", "Johnson"));

        // Sort the list by name ascending using a lambda comparator
        Collections.sort(persons, (p1, p2) -> p1.getName().compareTo(p2.getName()));

        // Print the sorted list
        for (Person person : persons) {
            System.out.println("Name: " + person.getName() + ", Age: " + person.getAge());
        }
    }
}
