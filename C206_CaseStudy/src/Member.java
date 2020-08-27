
public class Member {
	private String name;
	private char gender;
	private int mobile;
	private String email;
	private String DOB;
	private String country;
	private String password;
	
	public Member(String name, char gender, int mobile, String email, String DOB, String country, String password) {
		this.name = name;
		this.gender = gender;
		this.mobile = mobile;
		this.email = email;
		this.DOB = DOB;
		this.country = country;
		this.password = password;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getName() {
		return name;
	}


	public char getGender() {
		return gender;
	}

	public int getMobile() {
		return mobile;
	}
	
	public void setMobile(int mobile) {
		this.mobile = mobile;
	}

	public String getEmail() {
		return email;
	}

	public String getDOB() {
		return DOB;
	}


	public String getCountry() {
		return country;
	}
	
	public void setCountry(String country) {
		this.country = country;
	}

}
