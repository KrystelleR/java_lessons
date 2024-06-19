public enum Day {
	MONDAY(1),
	TUESDAY(2),
	WEDNESDAY(3),
	THURSDAY(4),
	FRIDAY(50),
	SATURDAY(100),
	SUNDAY(1);
	 
	Day(int level){
		excitement = level;
	}
	 
	private int excitement;
	 
	public int getExcitement(){
		return excitement;
	}	
}
