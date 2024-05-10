public class DateValidator{
	public static boolean isValid(String datestr){
		//boolean to keep track of if the date is invalid
		boolean isDate = true;

		//check if has 3 /'s
		int count =0;
		for(int i =0; i <datestr.length(); i++){
			if(datestr.charAt(i)=='/')
			{
				count++;
			}
		}

		if(count==2){
			//Checking if string is 8 characters long and is numeric, if not return false
			//returing false/ breaking the method here in case the value is not numeric (this would lead to parseing errors in further code)
			String date = datestr.replace("/", "");
			if(date.length() == 8){
				for(int i = 0; i <date.length(); i++){
					if(Character.isDigit(date.charAt(i)) == false){
						return false;
					}
				}
			}
			else{
				return false;
			}

			//Checking if date is valid
			//split up string into days, months and years
			String dayStr = datestr.split("/")[0];
			String monthStr = datestr.split("/")[1];	
			String yearStr = datestr.split("/")[2];
			//parsing days, months and years into integer values
			int month = Integer.parseInt(monthStr);
			int day = Integer.parseInt(dayStr);
			int year = Integer.parseInt(yearStr);

			//verifying that year is 4 digits long
			if(yearStr.length() != 4){
				isDate = false;
			}

			//if statement to validate that the month is no more than 12
			if (month <= 12) {
				//switch case to validate that the days are accurate for that specific month
			    switch (month) {
			        case 1: case 3: case 5: case 7: case 8: case 10: case 12:
			            if (day > 31) {
			                isDate = false;
			            }
			            break;
			        case 4: case 6: case 9: case 11:
			            if (day > 30) {
			                isDate = false;
			            }
			            break;
			            //in the case of February, if the year is evenly divisable by 4, than it is a leap year therefore 29 days
			        case 2:
			            if (year % 4 != 0) {
			                if (day > 28) {
			                    isDate = false;
			                }
			            } else {
			                if (day > 29) {
			                    isDate = false;
			                }
			            }
			            break;
			    }
			}
			else{
				isDate = false;
			}

			//if the date was found to be invalid during the condtional statements, re-prompt user else it is a valid date
			if (isDate == true){
				return true;
			}
			else{
				return false;
			}
		}
		else{
			return false;
		}
	}
}