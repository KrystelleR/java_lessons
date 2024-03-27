import java.util.HashMap;
import java.util.Map;

class TestReplace{
	public static void main (String[] args){
		Map <Integer, String> employees = new HashMap<>();
		employees.put(1998, "Aaron Padiachy");
		employees.put(2000, "Ghislain-Claude Ilunga");
		employees.put(2002_5, "Tumi Maleka");
		employees.put(2002_11, "Samantha Figueiredo");
		employees.put(2002_10, "Krystelle Rupnarain");

		System.out.println(employees.entrySet());

		employees.replace(2002_10, "Xavier Naidoo");

		System.out.println("updated: " + employees.getOrDefault(2002_10, ""));

		employees.putIfAbsent(2002_7, "Nikiesha Naicker");

		System.out.println(employees.values());
	}
}