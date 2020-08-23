
public class Courses {
	String code;
	String title;
	String name;
	String description;
	int duration;
	String requisite;
	public Courses(String code, String title, String name, String description,int duration, String requisite) 
	{
		
		this.code = code;
		this.title = title;
		this.name = name;
		this.description = description;
		this.duration = duration;
		this.requisite = requisite;
	}
	public String getCode() {
		return code;
	}

	public String getTitle() {
		return title;
	}

	public String getName() {
		return name;
	}

	public String getDescription() {
		return description;
	}
	
	public int getDuration() {
		return duration;
	}

	public String getRequisite() {
		return requisite;
	}
	public void setRequisite(String requisite) {
		this.requisite = requisite;
	}
	
	

}
