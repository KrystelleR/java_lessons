import za.access.AccessMe;

public class PublicAccessor{
	public String getProperty(){
		AccessMe am = new AccessMe();
		return am.getName();
	}
}