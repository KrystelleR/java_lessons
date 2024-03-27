import java.util.Random;
class MultidimensionalArray11{
	public static void main(String[] args) {
		//declarations
		int[][] myArray =new int[100][30];

		//populating array
		populateArray(myArray);

		//printing out all elements in array that are odd and divisible by 8
		System.out.println("All elements in my array taht are odd and divisible by 8:");
		printAllOddandDivisibleBy8Array(myArray);
	}

	//method to populate array
	public static void populateArray(int[][] myArray){
		Random randomValue = new Random();
		for(int i = 0; i <myArray.length; i++){
			for(int j =0; j <myArray[i].length; j++){
				myArray[i][j] = randomValue.nextInt(1000);
			}
		}
	}

	//method to print array
	public static void printArray(int[][] myArray){
		for(int i = 0; i <myArray.length; i++){
			for(int j =0; j <myArray[i].length; j++){
				System.out.print(myArray[i][j] + "\t");
			}
			System.out.print("\n");
		}
	}

	//method to populate array
	public static void incrementArray(int[][] myArray){
		for(int i = 0; i <myArray.length; i++){
			for(int j =0; j <myArray[i].length; j++){
				myArray[i][j]++;
			}
		}
	}

	//method to print odd numbers divisble by 8
	//this is a logical error (there are no odd numbers that are divisble by 8)
	public static void printAllOddandDivisibleBy8Array (int[][] myArray){
		for(int i = 0; i <myArray.length; i++){
			for(int j =0; j <myArray[i].length; j++){
				if(myArray[i][j]%2!=0)
					if(myArray[i][j]%8==0)
						System.out.print(myArray[i][j] + " ");
			}
		}
	}
}