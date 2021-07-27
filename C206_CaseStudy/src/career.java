
public class career {
	
	private int career_id;
	private String career_name;
	
	public career(int career_id, String career_name) {
		super();
		this.career_id = career_id;
		this.career_name = career_name;
	}

	public int getCareer_id() {
		return career_id;
	}

	public void setCareer_id(int career_id) {
		this.career_id = career_id;
	}

	public String getCareer_name() {
		return career_name;
	}

	public void setCareer_name(String career_name) {
		this.career_name = career_name;
	}

}
