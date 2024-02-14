import java.util.StringTokenizer;
import java.util.Scanner;

public class TokeniserTest{

public static String csv = "name,surname,age\nJames,Jones,12\nPhil,Thomas,18\nAaron,Padiachy,25\nGhislain-Claude,Ilunga,23\nSamantha,Figueiredo,21\nTumi,Maleka,21\nKrystelle,Rupnarain,21\nPhil,Davids,27";

	public static void main(String [] args){
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a search name:");
		String search = scan.next();
		searchName(search);

	}

	public static void searchName(String search){
		StringTokenizer st = new StringTokenizer(csv);
		st.nextToken(); //skipping the first token by calling it here

		while(st.hasMoreTokens()){
			String current = st.nextToken();
			if(current.contains(search)){
				System.out.println(current);
			}
		}
	}
}