import java.util.*;
class TestContainsKey{
	public static void main (String[] args){
		Map <Integer, String> employees = new HashMap<>();
		employees.put(1998, "Aaron Padiachy");
		employees.put(2000, "Ghislain-Claude Ilunga");
		employees.put(2002_5, "Tumi Maleka");
		employees.put(2002_11, "Samantha Figueiredo");
		employees.put(2002_10, "Krystelle Rupnarain");

		System.out.println(employees);
		System.out.println(employees.containsKey(1998));
	}
}