public class NameGetter3{
	public String getName(){
		while(true){
			String nameStr = Prompter3.prompt("Enter your name:");
			if(InputValidator3.isValid(nameStr)){
				return nameStr;
			}		
		}
	}
}