import java.util.Scanner;
public class BooleanConversion{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter true or false: 'I am a woman'");
		String genderStr = scan.next();
		boolean gender = Boolean.parseBoolean(genderStr);
		System.out.println("For the question 'I am a woman', you answered:" + gender);
	}
}