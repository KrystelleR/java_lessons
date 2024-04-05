class FizzBuzz{
	public static void main(String[] args) {
		int[] array = new int[100];
		populateArray(array);
		printArray(array);
	}

	//populating array
	public static void populateArray(int[] array){
		int j=1;
		for(int i =0; i<array.length; i++){
			array[i] = j++;
		}
	}

	//printing array
	public static void printArray(int[] array){
		for(int i =0; i <array.length; i++){
			if(array[i]%3==0 && array[i]%5==0){
				System.out.print("FizzBuzz ");
			}
			else if(array[i]%3==0){
				System.out.print("Fizz ");
			}
			else if(array[i]%5==0){
				System.out.print("Buzz ");
			}
			else{
			System.out.print(array[i] + " ");
			}
		}
	}
}