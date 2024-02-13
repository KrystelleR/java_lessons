import java.util.Scanner;
public class ShortConversion{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter what you would consider is room temperature in celcius");
		String tempCStr = scan.next();
		short tempC = Short.parseShort(tempCStr);
		System.out.println("You consider " + tempC + " in celcius room temp");
	}
}