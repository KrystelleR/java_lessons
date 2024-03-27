class MultidimensionalArray8{
	public static void main(String[] args) {
		//declaration
		int[][] myArray = {
			{54, 56, 5, 58, 89, 18, 36, 57, 91, 52},
			{69, 73, 98, 36, 93, 56, 28, 55, 15, 71},
			{18, 39, 70, 43, 3, 7, 79, 26, 7, 96},
			{31, 55, 66, 78, 71, 18, 91, 52, 32, 76},
			{9, 38, 22, 98, 10, 49, 77, 43, 34, 23},
			{97, 32, 33, 75, 52, 10, 67, 88, 25, 95},
			{16, 93, 93, 50, 89, 57, 64, 10, 50, 17},
			{74, 91, 77, 52, 89, 19, 3, 68, 67, 78}
		};

		//printing out all values in array that are divisble by 11
		System.out.println("All even elements in Array that are divisble by 11:");
		printAllEvenandDivisibleBy11Array(myArray);
	}

	//method to print out all values in array
	public static void printArray(int[][] myArray){
		for(int i = 0; i < myArray.length; i++){
			for(int j =0; j <myArray[i].length; j++){
				System.out.print(myArray[i][j] + " ");
			}
		}
	}

	//method to print out all even values that are divisible by 11 in array
	public static void printAllEvenandDivisibleBy11Array(int[][] myArray){
		for(int i = 0; i < myArray.length; i++){
			for(int j =0; j <myArray[i].length; j++){
				if(myArray[i][j]%2 ==0)
					if(myArray[i][j]%11 ==0)
						System.out.print(myArray[i][j] + " ");
			}
		}
	}

	//method to increment values in array
	public static void incrementArray(int[][] myArray){
		for(int i = 0; i < myArray.length; i++){
			for(int j =0; j <myArray[i].length; j++){
				myArray[i][j]++;
			}
		}
	}
}