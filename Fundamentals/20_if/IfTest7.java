public class IfTest7 {
    public static void main(String[] args) {
        int a = 0;
        int b = 5;
       
        String message = a > b ? "Cool" : "Not Cool";       
        System.out.println(message);

        String result  = a>0? "positive": a<0? "negative": "zero";
        System.out.println(result);
    }
}
