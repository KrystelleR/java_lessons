public class Main{
	public static void main (String [] args){
		/*
			Validating that name is not empty. If name is invalid, re-prompt until name is valid.
		*/
		String name;
		while(true){
		 	name = Prompter.prompt("What is your name? ");
		 	if(NameValidator.isValid(name)){
		 		break;
		 	}
		}

		/*
			Validating that surname is not empty. If surname is invalid, re-prompt until surname is valid.
		*/
		String surname;
		while(true){
			surname = Prompter.prompt("What is your surname? ");
			if(NameValidator.isValid(surname)){
		 		break;
		 	}

		}
		
		/*
			Validating that grade is valid. Grade needs to be an int and inbetween 1 and 12. If invalid, user is re-prompted.
		*/
		int grade;
		while(true){
		 	String gradeStr = Prompter.prompt("What is your grade? ");
			if(GradeValidator.isValid(gradeStr)){
				grade = Integer.parseInt(gradeStr); 
				break;
			}
		}

		//getting users block
		String block = getBlock.returnBlock(grade);
		//getting users class teacher
		String classTeacher = RandomName.classTeacherName(grade);
		//getting users pe teacher
		String peTeacher = RandomName.peTeacherName(grade);

		/*
			Printing out users information
		*/
		Printer.print(name, surname, grade, block, classTeacher, peTeacher);
	}
}