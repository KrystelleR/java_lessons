import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class PackTest1 {
	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("What is your name:");
		String input = reader.readLine();
		System.out.println("Hello and welcome:"+input);
		
	}
}
