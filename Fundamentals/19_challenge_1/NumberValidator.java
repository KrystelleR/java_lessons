public class NumberValidator{
	public static boolean isValid(String distanceStr){
		//try and catch- if the parsing of the string as a double fails, then it is an invalid number
		try{
			double distance = Double.parseDouble(distanceStr);
			return true;
		}
		//if the try fails, then this will run
		catch(Exception e){
			//re-prompting user to enter a new date
			System.out.println("Invalid. Try again.");
			return false;
		}
	}
}