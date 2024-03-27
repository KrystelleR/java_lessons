import java.util.Random;
class MultidimensionalArray12{
	public static void main(String[] args) {
		//declarations
		int[][] myArray =new int[100][30];

		//populating array
		populateArray(myArray);

		//printing out all elements in array that are odd and divisible by 8
		System.out.println("All elements in my array that are odd and divisible by 8:");
		printAllEvenandDivisibleBy11Array(myArray);
	}

	//method to populate array
	public static void populateArray(int[][] myArray){
		Random randomValue = new Random();
		int i = 0;
		while(i <myArray.length){
			int j =0;
			while(j <myArray[i].length){
				myArray[i][j] = randomValue.nextInt(1000);
				j++;
			}
			i++;
		}
	}

	//method to print array
	public static void printArray(int[][] myArray){
		int i = 0;
		while(i <myArray.length){
			int j =0;
			while(j <myArray[i].length){
				System.out.print(myArray[i][j] + "\t");
				j++;
			}
			System.out.print("\n");
			i++;
		}
	}

	//method to populate array
	public static void incrementArray(int[][] myArray){
		int i = 0;
		while(i <myArray.length){
			int j =0;
			while(j <myArray[i].length){
				myArray[i][j]++;
				j++;
			}
			i++;
		}
	}

	//method to print odd numbers divisble by 8
	//this is a logical error (there are no odd numbers that are divisble by 8)
	public static void printAllEvenandDivisibleBy11Array (int[][] myArray){
		int i = 0;
		while(i <myArray.length){
			int j =0;
			while(j <myArray[i].length){
				int isOdd = myArray[i][j]%2;
				switch(isOdd){
				case 0:
					break;
				default:
					int isDivisibleBy8 = myArray[i][j]%8;
					switch(isDivisibleBy8){
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
}