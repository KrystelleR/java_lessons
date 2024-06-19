public class Shooter{
    public static void main(String[] args) {
        Shooter.shoot(5);
    }
    public String shoot(){
        return "John";
    }
    public static void shoot(int count){
        for(int i =0; i <=count; i++)
        System.out.println("booom!!!");
    }
}
