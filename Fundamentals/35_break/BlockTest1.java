public class BlockTest1 {
    public static void main(String[] args) {
       int x;
        {
           int i =1;
           x=i;
           System.out.println("Block 1 i = "+ i);
        }
       
        {
            int i =1;
            System.out.println("Block 2 i = "+ i); 
            System.out.println(i+x);  
        }
       
    }
}
