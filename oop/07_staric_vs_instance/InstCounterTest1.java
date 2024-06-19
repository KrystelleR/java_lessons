public class InstCounterTest1 {
	public static void main(String[] args) {
		InstanceCounter1 obj1 = new InstanceCounter1();
		InstanceCounter1 obj2 = new InstanceCounter1();
		InstanceCounter1 obj3 = new InstanceCounter1();

                        System.out.println(obj1.getStaticCounter());

                        InstanceCounter1.staticCounter = 1000;

                        System.out.println(obj1.getStaticCounter());

                        obj1.objectCounter++;
                        System.out.println(obj1.getObjectCounter());

                        InstanceCounter1.staticCounter++;
                        System.out.println(obj1.getStaticCounter());


	}
}
