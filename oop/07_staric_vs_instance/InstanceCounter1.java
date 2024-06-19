public class InstanceCounter1 {
	
	public static int staticCounter;
    public int objectCounter;
	
    public InstanceCounter1(){
		staticCounter++;
		System.out.println("new object created:"+staticCounter);             
             }

	public static void incrementStaticCounter(){
		staticCounter++;
		System.out.println("Number of instances in static:"+staticCounter);
	}

	public void incrementObjectCounter(){
                         objectCounter++;
		System.out.println("Counter in instance:"+objectCounter);
	}

	public int getStaticCounter(){
		return staticCounter;
	}

	public int getObjectCounter(){
		return staticCounter;
	}

}
