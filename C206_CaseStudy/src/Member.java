
public class Member {
	String name;
	char gender;
	int mobile;
	String email;
	String DOB;
	String country;
	
	public Member(String name, char gender, int mobile, String email, String DOB, String country) {
		this.name = name;
		this.gender = gender;
		this.mobile = mobile;
		this.email = email;
		this.DOB = DOB;
		this.country = country;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public char getGender() {
		return gender;
	}

	public void setGender(char gender) {
		this.gender = gender;
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

	public void setEmail(String email) {
		this.email = email;
	}

	public String getDOB() {
		return DOB;
	}

	public void setDOB(String dOB) {
		DOB = dOB;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}
}
