class SingleDimensionArray3{

	public static void main(String[] args) {
		//declarations
		int[] myArray = {234, 54, 789, 15, 6, 890, 321, 22, 167, 76, 8, 678, 13, 987, 
		543, 89, 241, 46, 66, 7, 543, 167, 24, 890, 79, 345, 456, 82, 121, 456, 876, 23, 810, 567, 17, 
		890, 876, 567, 234, 80, 719, 543, 34, 2, 12, 234, 57, 80, 88, 79};

		//printing out all even elements that are divisible by 11 in array
		System.out.println("All even elements that are divisible by 11 in Array:");
		printAllEvenandDivisibleBy11Array(myArray);
	}

	//method to print all elements in array
	public static void printArray(int[] myArray){
		int i = 0;
		while(i < myArray.length){
			System.out.print(myArray[i] + " ");
			i++;
		}
	}

	//method to print out all even values in array
	public static void printAllEvenandDivisibleBy11Array(int[] myArray){
				int i = 0;
		while(i < myArray.length){
			int isEven = myArray[i]%2;
			switch(isEven){
				case 0:
					int isDivisibleBy11 = myArray[i]%11;
					switch(isDivisibleBy11){
					case 0:
						System.out.print(myArray[i] + " ");
						break;
					}
				break;
			}
			i++;
		}
	}

	//method to increment all elements in array
	public static int[] incrementArray(int[] myArray){
		int i = 0;
		while(i < myArray.length){
			myArray[i]++;			
			i++;
		}
		return myArray;
	}
}

