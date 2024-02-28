class RandomName{
	/*
			Method to return random class teacher to user
	*/
	public static String classTeacherName(int grade){
		String classTeacher = "";
		switch (grade){
		case 1: 
			classTeacher = "Ms. Rosemary";
			break;
		case 2: 
			classTeacher = "Mr. Thyme";
			break;
		case 3: 
			classTeacher = "Ms. Sage";
			break;
		case 4: 
			classTeacher = "Mr. Paprika";
			break;
		case 5: 
			classTeacher = "Ms. Garlic";
			break;
		case 6: 
			classTeacher = "Mr. Onion";
			break;
		case 7: 
			classTeacher = "Ms. Chilli";
			break;
		case 8: 
			classTeacher = "Mr. Pepper";
			break;
		case 9: 
			classTeacher = "Ms. Salt";
			break;
		case 10: 
			classTeacher = "Mr. Cajun";
			break;
		case 11: 
			classTeacher = "Ms. Masala";
			break;
		case 12: 
			classTeacher = "Mr. Tumeric";
			break;

		default:
			classTeacher =  "Invalid grade";
			break;
		}

		return classTeacher;
	}

	/*
			Method to return random pe teacher to user
	*/
	public static String peTeacherName(int grade){
		String peTeacher = "";
		switch(grade){
		case 1: case 2: case 3: case 4: 
			peTeacher = "Ms. Maleka";
			break;
		case 5: case 6: case 7: 
			peTeacher = "Mr. Ilunga";
			break;
		case 8: case 9: 
			peTeacher = "Ms. Figueiredo";
			break;
		case 10: case 11: case 12:
			peTeacher = "Mr. Padiachy";
			break;
		default:
			peTeacher =  "Invalid grade";
			break;
		}

		return peTeacher;
	}
}