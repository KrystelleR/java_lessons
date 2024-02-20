public class NumberValidator{
	public static boolean isValid(String distanceStr){
		try{
			int distance = Integer.parseInt(distanceStr);
			return true;
		}
		catch(Exception e){
			System.out.println("Invalid. Try again.");
			return false;
		}
	}
}