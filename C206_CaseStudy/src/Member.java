
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


	public char getGender() {
		return gender;
	}



	public int getMobile() {
		return mobile;
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


}
