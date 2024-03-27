class CodeAlong3_1{
	//declaraing array in scope
	public static int[][] myArray = new int[10][10];

	public static void main(String[] args) {
		//populating array
		populateArray();
		//seeing if row is valid and printing row if so
		int[] rowArray = getRow(3);
		if(isEmptyArray(rowArray)){
			printArray(rowArray);
		}
		else{
			System.out.println("Invalid value. Array out of bounds.");
		}
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

	//method to print out single array
	public static void printArray(int[] rowArray){
		for(int element: rowArray){
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