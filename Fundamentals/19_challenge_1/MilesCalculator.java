public class MilesCalculator{
	public static double calculate(String distanceStr){
		//parsing distance as an integer
		double distanceKM = Double.parseDouble(distanceStr);
		//returning the distance in miles
		return (distanceKM / 1.609);
	}
}