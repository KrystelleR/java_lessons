class Challenge2Main{
	public static void main (String[] args){
		String contQuestion = "";
		String result = "";

		System.out.println(MenuPrinter.printWelcome());
		menuLoop:
		while(true){

			String sign = Prompter.prompt(MenuPrinter.printMenu());

			if(!sign.equalsIgnoreCase("6")){
				while(true){
				//Checking whether the user wants to exit or not
				if(sign.equalsIgnoreCase("x")){
					System.out.println("Goodbye!");
					break menuLoop;
				}

				//Checking whether the entered value is a valid numerical digit
				else{
						if(operatorValidator.isValid(sign)) break; 
						else sign = Prompter.prompt("Enter a valid option or operater sign or 'X' to exit:");
					}
				}

				String value1;
				if(contQuestion.equalsIgnoreCase("Y")){
					value1 = result;
				}
				else{
					//Checking whether the entered value is a valid operator sign
					value1 = Prompter.prompt("Enter value 1:");
					while(true){
							if(NumberValidator.isValid(value1)) break;
							else value1 = Prompter.prompt("Enter a valid numerical value:");
					}
				}

				String operator = Prompter.prompt("Enter the operator for "+ operatorValidator.operationFinder(sign) + ":");
				while(true){
					if(operator.equals(((operatorValidator.operationFinder(sign)).split("\\(")[1]).replace(")", ""))) break;
						else operator = Prompter.prompt("Enter a valid operator for "+operatorValidator.operationFinder(sign));
				}


				//Checking whether the entered value is a valid numerical digit
				String value2 = Prompter.prompt("Enter value 2:");
				while(true){
					if(NumberValidator.isValid(value2)) 
						if(NumberValidator.isValidDivide(value2, operator)) break;
						else value2 = Prompter.prompt("Enter a valid, non-zero, numerical value:");
					else value2 = Prompter.prompt("Enter a valid numerical value:");
				}

			 	result = String.valueOf(Printer.printResult(sign, Double.parseDouble(value1), Double.parseDouble(value2)));
			 	contQuestion = Prompter.prompt(MenuPrinter.printRepeat(result));
			}
			else{
					historyViewer.display();
				}
	}
	}
}