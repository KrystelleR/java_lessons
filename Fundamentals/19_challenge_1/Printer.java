public class Printer{
	public static boolean print(String nameStr, String ageStr, String milesStr){
		System.out.println("Hello " + nameStr + "\n");

		System.out.println("You are " + ageStr + " years old.");
		double age = Double.parseDouble(ageStr);
		double ageInSec = age * 3.154e+7;
		System.out.println("Your age in seconds is " + ageInSec);
		double ageInMSec = ageInSec * 1000;
		System.out.println("Your age in milliseconds is " + ageInMSec + "\n");

		System.out.println("The distance in miles is " + milesStr + " miles.");
		double meters = Double.parseDouble(milesStr) * 1609;
		System.out.println("The distance in meters " + meters + " miles.");
		return true;
	}
}