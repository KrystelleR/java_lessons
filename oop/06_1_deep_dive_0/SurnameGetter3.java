public class SurnameGetter3{
	public String getSurname(){
		while(true){
			String surnameStr = Prompter3.prompt("Enter your surname:");
			if(InputValidator3.isValid(surnameStr)){
				return surnameStr;
			}		
		}
	}
}