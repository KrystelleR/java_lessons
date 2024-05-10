class IDValidator{
	public static boolean isValid(String idStr){
		try{
			if(idStr.length() == 13){
				for(int i =0; i < idStr.length(); i++){
					int numericalValue = idStr.charAt(i);
				}
				return true;
			}
			else{
				return false;
			}
		}
		catch(Exception e){
			return false;
		}
	}
}