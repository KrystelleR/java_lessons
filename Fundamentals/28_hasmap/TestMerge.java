import java.util.HashMap;
import java.util.Map;
import java.util.function.BiFunction;

class TestMerge {
    public static void main(String[] args) {
        // Create a HashMap
        Map<String, Integer> employees = new HashMap<>();
        employees.put("apple", 10);
        employees.put("banana", 20);

        employees.merge("cherry", 30, (oldValue, newValue) -> oldValue + newValue);
        System.out.println("Value for 'cherry': " + employees.get("cherry")); 

        employees.merge("banana", 15, (oldValue, newValue) -> oldValue + newValue);
        System.out.println("Value for 'banana' after merging: " + employees.get("banana"));
    }
}
