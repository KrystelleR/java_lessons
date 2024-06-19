public class Constructor3 {
    public Constructor3(){
   	 System.out.println("Running no-args constructor");
    }
    
    public Constructor3(String name){
   	 this();
   	 System.out.println("Running name arg constructor: Name ="+name);
    }

    public Constructor3(String name, String surname){
     this();
     System.out.println("Running name and surname arg constructor: Name ="+name + " Surname =" + surname);
    }

    public Constructor3(String name, String surname, String job){
     this();
     System.out.println("Running name, surname and job arg constructor: Name ="+name + " Surname =" + surname + " Job =" + job );
    }
}
