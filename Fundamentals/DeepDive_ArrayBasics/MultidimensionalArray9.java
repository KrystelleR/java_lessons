class MultidimensionalArray9{
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
		int i = 0; 
		while(i < myArray.length){
			int j =0;
			while(j <myArray[i].length){
				System.out.print(myArray[i][j] + "\t ");
				j++;
			}
			System.out.println("\n");
			i++;
		}
	}


	//method to print out all even values that are divisible by 11 in array
	public static void printAllEvenandDivisibleBy11Array(int[][] myArray){
		int i = 0;
		while(i < myArray.length){
			int j =0;
			while(j <myArray[i].length){
				int isEven = myArray[i][j]%2;
				switch(isEven){
					case 0:
					int isDivisibleBy11 = myArray[i][j]%11;
					switch(isDivisibleBy11){
						case 0:
							System.out.print(myArray[i][j] + " ");
							break;
					}
					break;
				}
				j++;
			}
			i++;
		}
	}

	//method to increment values in array
	public static void incrementArray(int[][] myArray){
		int i = 0;
		while(i < myArray.length){
			int j =0;
			while(j <myArray[i].length){
				myArray[i][j]++;
				j++;
			}
			i++;
		}
	}
}
