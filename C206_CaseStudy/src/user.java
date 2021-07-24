public class user {
	private int user_id;
	private String name;
	private String role;
	private String email;
	private String password;

	public user(int user_id, String name, String role, String email, String password) {
		this.user_id = user_id;
		this.name = name;
		this.role = role;
		this.email = email;
		this.password = password;
	}

	public String getName() {
		return name;
	}

	public int getUserid() {
		return user_id;
	}

	public String getPassword() {
		return password;
	}

	public String email() {
		return email;
	}

	public String getRole() {
		return role;
	}

	public void setPassword(String password) {
		this.password = password;
	}
}
