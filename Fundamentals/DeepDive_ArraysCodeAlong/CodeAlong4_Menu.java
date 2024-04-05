import java.util.Scanner;
class CodeAlong4_Menu{
	public static void main(String[] args) {
		//while loop to reprompt user until they exit
		while(true){
			//declarations
			int[][] myArray = new int[10][10];
			//populating array
			populateArray(myArray);

			//printMenu return svalid option chosen from user. Using switch to do correct task based on response
			switch(printMenu()){
			case 1:
				//case 1 is return row. getRow takes in the valid row from user and the array itself to print row
				getRow(promptRow(myArray), myArray);
				 break;
			case 2: 
				//case 2 is return column. getColumn takes in the valid column from user and the array itself to print column
				getColumn(promptColumn(myArray), myArray);
				break;
			case 3: 
				//case 3 is return row. getCell takes in the valid row AND col (saved as single array) from user and the array itself to print cell
				getCell(promptCell(myArray), myArray);
				break;
			}
		}
	}

	//method to populate array values from 0 to 99
	public static void populateArray(int[][] myArray){
		int value = 0;
		for(int i =0; i <myArray.length; i++){
			for(int j =0; j<myArray[i].length; j++){
				myArray[i][j] = value++;
			}
		}
	}

	//method to print out menu and get valid response
	public static int printMenu(){
		while(true){
			String option = prompter("Welcome to array finder. Please select an option (1-3):\n\n" + 
				"(1.) Find row\n"+ 
				"(2.) Find column\n"+ 
				"(3.) Find cell\n\n"+ 
				"Or enter 'x' to exit the application."
			);
			if(option.equalsIgnoreCase("x")){
				System.out.println("Goodbye!");
				System.exit(0);
			}

			if(validMenu(option)){
				return Integer.parseInt(option);
			}
		}
	}

	//method to see if number is valid
	public static boolean isValidNum(String value){
		try{
			int valueInteger = Integer.parseInt(value);
			return true;
		}
		catch(Exception e){
			System.out.println("Invalid. Enter a numerical value.");
			return false;
		}
	}

	//method to see if menu option was valid
	public static boolean validMenu(String option){
		boolean isValid =false;;
		if(isValidNum(option)){
			for(int i =1; i <=3; i++){
				int optionInt = Integer.parseInt(option);
				if(optionInt==i)
					isValid = true;
			}
		}
		return isValid;
	}

	//method to prompt user using string for prompt message
	public static String prompter(String message){
		Scanner scan = new Scanner(System.in);
		System.out.println(message);
		return scan.nextLine();
	}

	//prompter method for valid row value
	public static int promptRow(int[][] myArray){
		while(true){
			String rowStr = prompter("Enter the row you are looking for:");
			if(isValidNum((rowStr))){
				int row = Integer.parseInt(rowStr);
				if(row >=0 && row <= myArray.length){
					return row;
				}
				else{
					System.out.println("Invalid row.");
				}
			}
		}
	}

	//method returning row based on users response
	public static void getRow(int row, int[][] myArray){
		for(int i =0; i<myArray[row].length; i++){
			System.out.print(myArray[row][i] + " ");
		}
		System.out.println("\n");
	}

	//prompter method for valid column value
	public static int promptColumn(int[][] myArray){
		while(true){
			String colStr = prompter("Enter the column you are looking for:");
			if(isValidNum((colStr))){
				int col = Integer.parseInt(colStr);
				boolean validCol = true;
				for(int i = 0; i < myArray.length; i++){
					if((col >=0 && col <= myArray[i].length) == false){
						validCol = false;
					}
				}
				if(validCol){
					return col;
				}
				else{
				System.out.println("Invalid column.");
				}
			}
		}
	}

	//method returning column based on users response
	public static void getColumn(int col, int[][] myArray){
		for(int i =0; i<myArray[col].length; i++){
			System.out.print(myArray[i][col] + " ");
		}
		System.out.println("\n");
	}

	//prompter method for valid cell value. Returns an int array containing the row and column (valid)
	public static int[] promptCell(int[][] myArray){
		while(true){
			int[] cellArray = new int[2];
			String rowStr = prompter("Enter the cell row you are looking for:");
			if(isValidNum((rowStr))){
				int row = Integer.parseInt(rowStr);
				if(row >=0&& row <=myArray.length){
					while(true){
						String colStr = prompter("Enter the cell column you are looking for:");
						if(isValidNum((colStr))){
							int col = Integer.parseInt(colStr);
							boolean validCol = true;
							for(int i = 0; i < myArray.length; i++){
								if((col >=0 && col <= myArray[i].length) == false){
									validCol = false;
								}
							}

							if(validCol){
								cellArray[0] = row;
								cellArray[1] = col;
								return cellArray;
							}
							else{
								System.out.println("Invalid column.");
							}
						}
					}
				}
				else{
					System.out.println("Invalid row.");
				}
			}
		}
	}

	//method returning cell based on users response
	public static void getCell(int[] cellArray, int[][] myArray){
		int row = cellArray[0];
		int col = cellArray[1];
		System.out.println(myArray[row][col]);
	}
}