public class ArrayManipulation2 {
    public static void main(String[]args){
        int[] array = {3,4,2,6,4};

        printArray("array before swapping ",array);
         
        //iterating through half the array only, if full array length then the swopping done 
        //in the first half swops again defeating the purpose
        int j= array.length-1;
        for(int i =0; i <array.length/2; i++){
            int temp = array[i];
            array[i]=array[j];
            array[j]=temp;
            j--;
        }      

        printArray("array after swapping ",array);

    }
    
    public static void printArray(String prefix,int[] arrayToPrint){
        System.out.print(prefix);
        System.out.print("[");
    
        for (int i =0;i < arrayToPrint.length;i++) {
            
            System.out.print(arrayToPrint[i]);
            if(i != arrayToPrint.length-1){
            	System.out.print(",");
            }

            
        }
        System.out.print("]\n");
    }
}
