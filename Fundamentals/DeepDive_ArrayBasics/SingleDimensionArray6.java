import java.util.Random;

class SingleDimensionArray6{
	 public static void main(String[] args) {
	 	//declare
	 	int[] myArray = new int[50];

	 	//populating array
	 	myArray = populateArray(myArray);

	 	//printing out all even elements that are divisible by 11 in array
		System.out.println("All even elements that are divisible by 11 in Array:");
		printAllEvenandDivisibleBy11Array(myArray);
	 }

	 //method to populate array with random values
	 public static int[] populateArray(int[] myArray){
	 	Random randomNumbers = new Random();
	 	int i =0;
	 	while(i < myArray.length){
	 		myArray[i] = randomNumbers.nextInt(100);
	 		i++;
	 	}
	 	return myArray;
	 		 }

	 //method to print out all elements in array
	 public static void printArray(int[] myArray){
	 		 	int i =0;
	 	while(i < myArray.length){
	 		System.out.print(myArray[i] + " ");
	 		i++;
	 	}
	 }

	//method to print out all even values in array
	 public static void printAllEvenandDivisibleBy11Array(int[] myArray){
	 	int i =0;
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

	 //method to increment all values in array
	 public static int[] incrementArray(int[] myArray){
	 	int i=0;
	 	while(i < myArray.length){
	 		myArray[i]++;
	 		i++;
	 	}
	 	return myArray;
	 }
}

