import java.util.Scanner;
public class ByteConversion{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter what you would consider is room temperature in ferhenheit");
		String tempFStr = scan.next();
		byte tempF = Byte.parseByte(tempFStr);
		System.out.println("You consider " + tempF + " in ferhenheit room temp");
}