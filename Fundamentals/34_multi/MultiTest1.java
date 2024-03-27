public class MultiTest1 {
    public static void main(String[] args) {
    	
        int [][] lottogroups = {{1111,2222,3333,4444},{6666,7777,8888,9999},{11111,121212,131313}};
    	int x = 0;
        for(int[] i : lottogroups){
            System.out.println("Group :"+x);
            int y = 0;
            for(int j : i){
                if(j%2==0)
                System.out.println("  Value " + y + "="+j);
                y++;
            }
            x++;        	
        }
    }
}
