import java.util.*;

class TestPutAll{
	public static void main(String[] args){
		Map <Integer, String> employees = new HashMap<>();
		employees.put(1998, "Aaron Padiachy");
		employees.put(2000, "Ghislain-Claude Ilunga");
		employees.put(2002_5, "Tumi Maleka");
		employees.put(2002_11, "Samantha Figueiredo");
		employees.put(2002_10, "Krystelle Rupnarain");

		Map <Integer, String> employeesNew = new HashMap<>();
		employeesNew.putAll(employees);
		Set<Integer> keys = employeesNew.keySet();

        for (int key : keys) {
        	String value = employeesNew.get(key);
            System.out.println("Key: " + key + ", Value: " + value);
        }

        System.out.println(employeesNew.entrySet());
        System.out.println(employeesNew.values());
        System.out.println(employeesNew);

	}
}