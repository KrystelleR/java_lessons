public class Printer{
	//method to print out information back to users
	public static boolean print(String nameStr, String ageStr, String milesStr){
		System.out.println("Hello " + nameStr + "\n");

		System.out.println("You are " + ageStr + " years old.");
		double age = Double.parseDouble(ageStr);
		//calculating age in seconds
		double ageInSec = age * 3.154e+7;
		System.out.println("Your age in seconds is " + ageInSec);
		//calculating age in miliseconds
		double ageInMSec = ageInSec * 1000;
		System.out.println("Your age in milliseconds is " + ageInMSec + "\n");

		int ageInt = (int)age;
		//getting age in hex
		System.out.println("Your age in hex is " + Integer.toHexString(ageInt));
		//getting age in binary
		System.out.println("Your age in binary is " + Integer.toBinaryString(ageInt)+ "\n");

		System.out.println("The distance in miles is " + milesStr + " miles.");
		//calculating distance from miles to meters
		double meters = Double.parseDouble(milesStr) * 1609;
		System.out.println("The distance in meters " + meters + " m.");
		return true;
	}
}