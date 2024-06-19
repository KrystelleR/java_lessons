public class NamesMain3{
	public static void main(String[] args) {
		NameGetter3 name3 = new NameGetter3();
		SurnameGetter3 surname3 = new SurnameGetter3();
		AgeGetter3 age3 = new AgeGetter3();

		String name = name3.getName();
		String surname = surname3.getSurname();
		int age = age3.getAge();

		System.out.println("Hello " + name + " " + surname);
		System.out.println("you are " + age + " years old");
	}
}