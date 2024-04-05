public class ArrayManipulation6 {
    public static void main(String[]args){
        int[] array = {3,4,2,6,4,7,9,1,0};

        printArray("array before first add ",array);

        //This add will work       
        array = add(array,12);

        printArray("array after first add ",array);

        //This add will not work. You need to fix the add method       
        array = add(array,13);

        //This l;ine will not execute because of the exception
        //Once you fix the method it will
        printArray("array after second add ", array);
        //This add will not work. You need to fix the add method       
        array = add(array,14);

        //This l;ine will not execute because of the exception
        //Once you fix the method it will
        printArray("array after second add ", array);


    }
    
    //TODO: This method throws an exception please fix it.
    public static int [] add(int[] arrayToAddTo, int itemToAdd){

        int initialSize = arrayToAddTo.length;
        
        //First lets just iterate through the array
        //If we find a slot with a zero we use it and return
        //If this is the case then we do not resize all is good.
        for(int i = 0; i < arrayToAddTo.length;i++){
            if(arrayToAddTo[i]== 0){
                arrayToAddTo[i] = itemToAdd;
                return arrayToAddTo;
            }
        }

        //If we reach this block it means there was no 0 (zero) slot available
        //This means the array is full and we need to extend it by 10

        int newSize = arrayToAddTo.length+10;
        int nextPosition = initialSize;


        //Create an array that is equal to newSize
        int[] newArrayToAddTo = new int[newSize];
        //copy elements over

        for(int i =0; i < arrayToAddTo.length; i++){
            newArrayToAddTo[i] = arrayToAddTo[i];
        }
        //add the element at the end of the array i.e. the first position with -1
        //Note this line is buggy as it uses the old array
        //Your code should use the new array
        newArrayToAddTo[nextPosition]=itemToAdd;

        //This should return the new array
        return newArrayToAddTo;
    
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
