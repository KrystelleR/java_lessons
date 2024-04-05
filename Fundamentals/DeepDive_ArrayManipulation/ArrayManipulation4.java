public class ArrayManipulation4 {
    public static void main(String[]args){
        int[] array = {3,4,2,6,4,7,9,1};

        printArray("array before overwriting ",array);

        array[array.length - 1] = -1;
        array[array.length - 2] = -1;

        //creating smaller array with length size of array minus removed values
        int size =0;
        for(int i =0; i<array.length; i++){
            if(array[i]!=-1){
                size++;
            }
        }

        //populating array with correct values
        int [] smallerArray = new int[size];     
        for(int i =0; i< array.length; i++){
            if(array[i]!=-1){
                smallerArray[i] = array[i];
            }
        }        

        printArray("array after overwriting ",smallerArray);

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