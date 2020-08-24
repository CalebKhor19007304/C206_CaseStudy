import java.util.Date;
//Done by Hazim
public class Course_Schedule {
	  String id;
	    int price;
	    Date startdate;
	    Date enddate;
	    String Location;
	    public Course_Schedule(String id, int price, Date startdate, Date enddate, String Location) {
	        super();
	        this.id = id;
	        this.price = price;
	        this.startdate = startdate;
	        this.enddate = enddate;
	        this.Location = Location;
	    }
	    public String getId() {
	        return id;
	    }
	    public int getPrice() {
	        return price;
	    }
	    public Date getStartdate() {
	        return startdate;
	    }
	    public Date getEnddate() {
	        return enddate;
	    }
	    public String getLocation() {
	        return Location;
	    }
	    
	    

	 

	}

