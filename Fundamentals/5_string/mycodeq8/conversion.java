import java.util.Scanner;
public class conversion{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);

		System.out.println("Please enter your age");
		String ageStr = scan.next();
		int age = Integer.parseInt(ageStr);
		System.out.println("You are " + age+ " years old.");

		System.out.println("Please enter your ID if you are born before 2000");
		String idStr = scan.next();
		long id = Long.parseLong(idStr);
		System.out.println("Your id is: " + id);

		System.out.println("Please enter your current income (to the 2nd decimal place)");
		String incomeStr = scan.next();
		double income = Double.parseDouble(incomeStr);
		System.out.println("Your current income is: " + income);

		System.out.println("Please enter the price of the cheapest item in your shop (to the 2nd decimal place)");
		String itemStr = scan.next();
		float item = Float.parseFloat(itemStr);
		System.out.println("The cheapest item i priced at: " + item);

		System.out.println("Enter true or false: 'I am a woman'");
		String genderStr = scan.next();
		boolean gender = Boolean.parseBoolean(genderStr);
		System.out.println("For the question 'I am a woman', you answered:" + gender);

		System.out.println("Please enter what you would consider is room temperature in celcius");
		String tempCStr = scan.next();
		short tempC = Short.parseShort(tempCStr);
		System.out.println("You consider " + tempC + " in celcius room temp");

		System.out.println("Please enter what you would consider is room temperature in ferhenheit");
		String tempFStr = scan.next();
		byte tempF = Byte.parseByte(tempFStr);
		System.out.println("You consider " + tempF + " in ferhenheit room temp");

		System.out.println("Please enter the first letter of your surname");
		String surnameStr = scan.next();
		char surname = surnameStr.charAt(0);
		System.out.println("Your surname starts with a " + surname);
	}
}