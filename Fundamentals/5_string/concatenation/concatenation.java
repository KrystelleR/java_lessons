import java.util.Scanner;
public class concatenation{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		String masterline= "";

		for(int i = 0; i <5; i++){
			System.out.println("Enter your sentence " + i + ":");
			masterline += scan.next().trim() + "\n";
		}	
		System.out.println(masterline);
	}
}