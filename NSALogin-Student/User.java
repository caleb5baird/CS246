
public class User {

	private String password;
	private String salt;
	private String hashedPassword;

	public User(String password) {
		this.password = password;
	}

	public String getPassword() {
		return password;
	}

	public String getSalt() {
		return salt;
	}

	public String getHashedPassword() {
		return hashedPassword;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public void setSalt(String salt) {
		this.salt = salt;
	}

	public void setHashedPassword(String hashedPassword) {
		this.hashedPassword = hashedPassword;
	}

}
