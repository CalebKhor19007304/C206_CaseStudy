

public class RegisterCourse {
	private int registrationNo;
    private int course_schedule_id;
    private String mail;
    private String status;
    private String registration_date;
    
    public RegisterCourse(int registrationNo, int course_schedule_id, String mail, String status,
            String registration_date) {
        this.registrationNo = registrationNo;
        this.course_schedule_id = course_schedule_id;
        this.mail = mail;
        this.status = status;
        this.registration_date = registration_date;
    }

 

    public int getRegistrationNo() {
        return registrationNo;
    }

 

    public int getCourse_schedule_id() {
        return course_schedule_id;
    }

 

    public String getMail() {
        return mail;
    }

 

    public String getStatus() {
        return status;
    }

 

    public String getRegistration_date() {
        return registration_date;
        
    }



	public void setStatus(String status) {
		this.status = status;
	}
    
    



    
    




    
    

 

}

