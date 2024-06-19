public class AgeGetter3{
	public int getAge(){
		while(true){
			String ageStr =  Prompter3.prompt("Enter your age:");
			if(InputValidator3.isValid(ageStr)){
				if(NumberValidator3.isValid(ageStr)){
					return Integer.parseInt(ageStr);
				}
			}
		}
	}
}