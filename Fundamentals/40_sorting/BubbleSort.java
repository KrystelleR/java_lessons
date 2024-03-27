class BubbleSort{
	public static void main(String[] args) {
		int myArray[] = {5, 8, 1, 6, 9, 2};

		//print array
		for (int value: myArray){
			System.out.print(value + " ");
		}

		for(int i=0; i < myArray.length-1; i++){
			for(int j = 0; j < myArray.length-1-i; j++){
				int temp;
				if(myArray[j] > myArray[j+1]){
					//swop
					temp = myArray[j];
					myArray[j] = myArray[j+1];
					myArray[j+1] = temp;
				}
			}
		}
		System.out.println("\n");
		//print array
		for (int value: myArray){
			System.out.print(value + " ");
		}
	}
}