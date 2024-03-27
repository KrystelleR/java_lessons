class CodeAlong3_3{
	//declaraing array in scope
	public static int[][] myArray = new int[10][10];

	public static void main(String[] args) {
		//populating array
		populateArray();
		//seeing if row is valid and printing row if so
		System.out.println("Row:");
		validArray(getRow(3));

		//seeing if col is valid and printing col if so
		System.out.println("\nColumn:");
		validArray(getCol(3));

		getCell(5,5);
	}

	//method to see if row is valid
	public static int[] getRow(int row){
		int [] rowArray = new int[10];
		if(row>=0 && row<= myArray.length){
			for(int i = 0; i<myArray.length; i++){
				rowArray[i] = myArray[row][i];
			}
		}
		return rowArray; 
	}

	//method to see if col is valid
	public static int[] getCol(int col){
		int [] colArray = new int[10];
		//loop through all rows incase of jaggered array (where 1 row does not have that certain column)
		for(int i =0; i<myArray.length; i++){
			if(col>=0 && col<=myArray[i].length){
				colArray[i]= myArray[i][col];
			}
		}
		return colArray; 
	}

	//method to see if cell is valid
	public static void getCell(int row, int col){
		if(row>=0 && row<=myArray.length){
			for(int i =0; i<myArray.length; i++){
				if(col>=0 && col<=myArray[i].length){
					System.out.println(myArray[row][col]);
				}
			}
		}
	}
	
	//method to return if out of bounds
	public static void validArray(int[] array){
		//seeing if array is valid and printing array if so
		if(isEmptyArray(array)){
			printArray(array);
		}
		else{
			System.out.println("Invalid value. Array out of bounds.");
		}
	}

	//method to print out single array
	public static void printArray(int[] colArray){
		for(int element: colArray){
			System.out.print(element + " ");
		}
	}

	//method to check if array is empty
	 public static boolean isEmptyArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] != 0) {
                return true; // Found a non-default value
            }
        }
        return false; // All elements are default values
    }

	//method to populate array
	public static void populateArray(){
		int value = 0;
		for(int i = 0; i < myArray.length; i++){
			for(int j =0; j <myArray[i].length; j++){
				myArray[i][j] = value++;
			}
		}
	}
}