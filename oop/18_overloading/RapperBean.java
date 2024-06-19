public class RapperBean implements java.io.Serializable{
	private int awards;
	private String socialMediaHandle;
	private String genre;

	public void setAwards(int awards){
		this.awards = awards;
	}

	public int getAwards(){
		return awards;
	}

	public void setSocialMediaHandle(String socialMediaHandle){
		this.socialMediaHandle = socialMediaHandle;
	}

	public String getSocialMediaHandle(){
		return socialMediaHandle;
	}

	public void setGenre(String genre){
		this.genre = genre;
	}

	public String getGenre(){
		return genre;
	}

}