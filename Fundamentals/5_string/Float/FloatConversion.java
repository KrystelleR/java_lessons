import java.util.Scanner;
public class FloatConversion{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter the price of the cheapest item in your shop (to the 2nd decimal place)");
		String itemStr = scan.next();
		float item = Float.parseFloat(itemStr);
		System.out.println("The cheapest item i priced at: " + item);
	}
}