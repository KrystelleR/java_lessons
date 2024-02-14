import java.util.Scanner;
public class csv{

	public static String csv = "";

	public static void main(String[] args){
		menu();
	}

	public static void menu(){
		while(true){
		System.out.println("\nPick an option. \n1) to capture a new user \n2) to view print the full CSV\n\n Enter any other value to exit.");
		Scanner scan = new Scanner(System.in);
		String option = scan.nextLine();

		if(option.equals("1")){
			addUser();

		}else if(option.equals("2")){
			print();
		}
		else{
			break;
		}
	}
	}

	public static void addUser(){
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter name:");
		String name = scan.nextLine();

		System.out.println("Enter surname:");
		String surname = scan.nextLine();

		System.out.println("Enter age:");
		int age = scan.nextInt();

		csv += "{'name': '" + name+"', 'surname':'" + surname +"', 'age':'" + age + "'},\n";

	}

	public static void print(){
		System.out.println(csv);
	}
}