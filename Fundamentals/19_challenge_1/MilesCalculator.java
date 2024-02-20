public class MilesCalculator{
	public static double calculate(String distanceStr){
		int distanceKM = Integer.parseInt(distanceStr);
		return (distanceKM / 1.609);
	}
}