public class user {
	private String user_id;
	private String name;
	private String role;
	private String email;
	private String password;

	public user(String user_id, String name, String role, String email, String password) {
		this.user_id = user_id;
		this.name = name;
		this.role = role;
		this.email = email;
		this.password = password;
	}

	public String getName() {
		return name;
	}

	public String getUserid() {
		return user_id;
	}

	public String getPassword() {
		return password;
	}

	public String getemail() {
		return email;
	}

	public String getRole() {
		return role;
	}

	public void setUsername(String user_id) {
		this.user_id = user_id;
	}

	public void setPassword(String password) {
		this.password = password;
	}
}
