import java.util.Scanner;
public class LongConversion{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter your ID if you are born before 2000");
		String idStr = scan.next();
		long id = Long.parseLong(idStr);
		System.out.println("Your id is: " + id);
	}
}