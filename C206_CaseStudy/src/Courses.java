//Done by Si How
public class Courses {
	String code;
	String title;
	String name;
	String description;
	int duration;
	String requisite;
	String scheduleid;
	public Courses(String code, String title, String name, String description,int duration, String requisite) 
	{
		
		this.code = code;
		this.title = title;
		this.name = name;
		this.description = description;
		this.duration = duration;
		this.requisite = requisite;
	}
	
	public Courses(String code, String title, String name, String description, int duration, String requisite,
			String scheduleid) {
		this.code = code;
		this.title = title;
		this.name = name;
		this.description = description;
		this.duration = duration;
		this.requisite = requisite;
		this.scheduleid = scheduleid;
	}

	public String getScheduleid() {
		return scheduleid;
	}

	public void setScheduleid(String scheduleid) {
		this.scheduleid = scheduleid;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public void setDuration(int duration) {
		this.duration = duration;
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
