
public class Courses {
	String code;
	String title;
	String name;
	String description;
	String duration;
	String requisite;
	public Courses(String code, String title, String name, String description, String duration, String requisite) 
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
	public void setCode(String code) {
		this.code = code;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getDuration() {
		return duration;
	}
	public void setDuration(String duration) {
		this.duration = duration;
	}
	public String getRequisite() {
		return requisite;
	}
	public void setRequisite(String requisite) {
		this.requisite = requisite;
	}
	
	

}
