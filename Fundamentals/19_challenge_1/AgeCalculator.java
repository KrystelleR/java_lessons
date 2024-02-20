public class AgeCalculator{
	public static double calculate(String dobStr){
		String year = dobStr.split("/")[2];
		double age = 2024 - Double.parseDouble(year);
		return age;
	}
}