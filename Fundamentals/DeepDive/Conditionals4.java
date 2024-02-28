public class Conditionals4 {
    public static void main(String[] args) {
        int option = 2;

        switch (option){
        case 1:
            switch(option){
            case 2:
                switch(option){
                case 3:
                    System.out.println("Option is 3");
                    break;

                default:
                    System.out.println("Option is not 3");
                    break;
                }
                break;

            default:
                System.out.println("Option is not 2");
                break;
            }
            break;

        default:
        System.out.println("Option is not 1");
        break;
        }
    }
}