
//Done by Hazim
public class Course_Schedule {
	String id;
    int price;
    String startdate;
    String enddate;
    String Location;
    public Course_Schedule(String id, int price, String startdate, String enddate, String Location) {
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
    public String getStartdate() {
        return startdate;
    }
    public String getEnddate() {
        return enddate;
    }
    public String getLocation() {
        return Location;
    }
    
    

 

}

