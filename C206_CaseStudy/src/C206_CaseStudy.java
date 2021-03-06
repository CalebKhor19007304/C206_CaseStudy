import java.util.ArrayList;
public class C206_CaseStudy {
	
	static ArrayList<Courses>courseList=new ArrayList<Courses>();
    private static ArrayList<Member> MemberList = new ArrayList<Member>();
	static ArrayList<CourseCategory> categoryList = new ArrayList<CourseCategory>();
	static ArrayList<Course_Schedule> ScheduleList = new ArrayList<Course_Schedule>();
	private static ArrayList<RegisterCourse> RegisterList = new ArrayList<RegisterCourse>();
	public static void main(String[] args) {
		MemberList = new ArrayList<Member>();
		RegisterList = new ArrayList<RegisterCourse>();
		MemberList.add(new Member("Dave", 'M', 95214567, "Dave@Gmail.com", "10/08/2001", "Singapore", "Dave10082001"));
		MemberList.add(new Member("Sarah", 'F', 87654321, "Sarah@Gmail.com", "02/12/2001", "Singapore", "SarahlovesDogs"));
		MemberList.add(new Member("Seraphine", 'F', 96358274, "Seraphine@Gmail.com", "10/08/2001", "Malaysia", "SeraphineBao"));
		RegisterList.add(new RegisterCourse(1, 1, "Seraphine@Gmail.com", "Accepted", "10/11/2020"));
			C206_CaseStudy crse = new C206_CaseStudy();
			crse.start();
	}
		
		
		public void start() {
			int option=0;
			int optionCourse=0;
			int memberOption = 0;
			int subView = 0;
			while(option!=6)
			{
				
				menu();
				option=Helper.readInt("Enter option > ");
				//Caleb
				if(option==1)
				{
					System.out.println("1. Add member");
					System.out.println("2. View member");
					System.out.println("3. Delete member");
					System.out.println("4. Update member");
					System.out.println("5. List all upcoming events for member");
					System.out.println("6. Quit");
					memberOption = Helper.readInt("Enter option > ");
					
					if(memberOption == 1) {
						Member m = inputMember();
						C206_CaseStudy.addMember(MemberList, m);
					}else if(memberOption == 2) {
						System.out.println("1. View all Members");
						System.out.println("2. Search by Country of Residence");
						subView = Helper.readInt("Enter Option > ");
						if(subView == 1) {
						C206_CaseStudy.viewMembers(MemberList);
						}else if(subView == 2) {
							C206_CaseStudy.SearchByCountry(MemberList);
						}
					}else if(memberOption == 3) {
						C206_CaseStudy.deleteMember(MemberList);
					}else if(memberOption == 4) {
						C206_CaseStudy.updateMember(MemberList);
					}else if(memberOption == 5) {
						C206_CaseStudy.viewMemberCourses(MemberList);
					}else if(memberOption == 6) {
						System.out.println("Thank you!");
					}else {
						System.out.println("Invalid Option");
					}
				}
				else if(option==2)//Si How
				{
					System.out.println("1.Add Course");
					System.out.println("2.View Course");
					System.out.println("3.Delete Course");
					System.out.println("4.Update Course");
					System.out.println("5.Search course by category");
					System.out.println("6.Assign schedule to course");
					System.out.println("7.List all course schedules for a course");
					optionCourse=Helper.readInt("Enter option > ");
					if(optionCourse==1)
					{
						C206_CaseStudy.addCourse(courseList);
					}
					else if(optionCourse==2)
					{
						C206_CaseStudy.viewAllCourses(courseList);
					}
					else if (optionCourse==3)
					{
						C206_CaseStudy.deleteCourse(courseList);
					}
					else if(optionCourse==4)
					{
						C206_CaseStudy.inputUpdate(courseList);
					}
					else if(optionCourse==5)
					{
						C206_CaseStudy.searchCourse(courseList);
					}
					else if(optionCourse==6)
					{
						C206_CaseStudy.assignSchedule(courseList);
					}
					else if(optionCourse==7)
					{
						C206_CaseStudy.listSchForcourse(courseList);
					}
					else
					{
						System.out.println("Invalid option");
					}
				}
				else if(option==3)//Elayne
				{
					categoryMenu();
					int catType = Helper.readInt("Enter option > ");
					
					if (catType == 1) {
						//Add course category
	 					CourseCategory courseCat = inputCategory();
	 					C206_CaseStudy.addCategory(categoryList, courseCat);
	 					
					} else if (catType == 2) {
						//View course category
						C206_CaseStudy.viewAllCategory(categoryList);
						
					} else if (catType == 3) {
						//Delete course category
						C206_CaseStudy.deleteCategory(categoryList);
					
					} else if (catType == 4) {
						//Update course category
						C206_CaseStudy.updateCategory(categoryList);
					
					}else if (catType == 5) {
						//Search course category
						C206_CaseStudy.SearchCategory(categoryList);
					
					}else if (catType == 6) {
						//Show course category
						C206_CaseStudy.ShowCourses(courseList);
					
					}else if (catType == 7) {
						//New Delete course category
						C206_CaseStudy.newDeleteCategory(courseList);
					
					}else {
						System.out.println("Invalid type");
					}
				}
				else if(option==4) //Hazim
				{

					System.out.println("1.Add Course Schedule!");
					System.out.println("2.View Course Schedule!");
					System.out.println("3.Delete Course Schedule!");
					int optionSchedule = Helper.readInt("Enter an option > ");
					if (optionSchedule == 1) {
						Course_Schedule CrseSche = inputschedule();
						C206_CaseStudy.addSchedule(ScheduleList, CrseSche);
					}else if (optionSchedule == 2) {
						C206_CaseStudy.viewAllSchedules(ScheduleList);
					}else if(optionSchedule == 3) {
						C206_CaseStudy.deleteSchedule(ScheduleList);
					}else if(optionSchedule == 4) {
						C206_CaseStudy.updateSchedule(ScheduleList);
					}else if(optionSchedule == 5) {
						C206_CaseStudy.SearchPrice(ScheduleList);
					}else if(optionSchedule == 6) {
						C206_CaseStudy.ShowRegMembers(RegisterList);
					}else if (optionSchedule == 7) {
						C206_CaseStudy.newDeleteSchedule(RegisterList);;				
					}else {
						System.out.println("INVALID OPTION!!!");
					}
					}
			
				
				else if(option==5) //Ganxi
				{
					System.out.println("1.Register Course Schedule");
                    System.out.println("2.View Registrations");
                    System.out.println("3.Delete Registrations");
                    System.out.println("4.Update Course Registration Status");
					System.out.println("5.Search Registration by Course Schedule ID");
					System.out.println("6.List all course schedules registered by a member");
					System.out.println("7.New Delete Registration");
                    int registerOption = Helper.readInt("Enter option > ");
                    
                    if(registerOption == 1) {
                        C206_CaseStudy.registerCourseSchedule(RegisterList);
                    }else if(registerOption == 2) {
                        C206_CaseStudy.viewRegistrations(RegisterList);
                    }else if(registerOption == 3) {
                        C206_CaseStudy.deleteRegistrations(RegisterList);
                    }else if(registerOption == 4) {
                    	C206_CaseStudy.updateRegistration(RegisterList);  
                    }else if(registerOption == 5) {
                    	C206_CaseStudy.SearchRegistration(RegisterList);
                    }else if(registerOption == 6) {
                    	C206_CaseStudy.ShowCourseschedule(RegisterList);
                    }else if(registerOption == 7) {
                    	C206_CaseStudy.newDeleteRegistration(RegisterList);;
                    }else {
                        System.out.println("Invalid Option");
                    }
				}
				else if(option==6)
				{
					System.out.println("Thank you for using the system.");
				}
				else
				{
					System.out.println("Invalid option!");
				}
			}
		}

		
		
	public static void menu() 
	{
		System.out.println("Course Management System");
		System.out.println("1. Manage member");
		System.out.println("2. Manage course");
		System.out.println("3. Manage category");
		System.out.println("4. Manage course schedule");
		System.out.println("5. Manage registration");
		System.out.println("6. Quit");
		
	}
	
	//Elayne
	private static void categoryMenu() {
		Helper.line(70, "=");
		System.out.println("COURSE CATEGORIES");
		Helper.line(70, "=");
		
		System.out.println("1. Add Course Category");
		System.out.println("2. View Course Category");
		System.out.println("3. Delete Course Catgeory");
		System.out.println("4. Update Course Catgeory");
		System.out.println("5. Search Course Catgeory");
		System.out.println("6. Show courses under category");
		System.out.println("7. New Delete Catgeory");
	}
	
	//input member details - Caleb
	public static Member inputMember(){
		
		String name = Helper.readString("Enter Name > ");
		char gender = Helper.readChar("Enter Gender (M/F) > ");
		int mobile = Helper.readInt("Enter Mobile Number > ");
		String email = Helper.readString("Enter email address > ");
		String DOB = Helper.readString("Enter Date of Birth (DD/MM/YYYY) > ");
		String country = Helper.readString("Enter country of residence > ");
		String password = Helper.readString("Enter password > ");
		
		Member m= new Member(name, gender,mobile,email,DOB,country,password);
		return m;
	}// add member - Caleb
		public static void addMember(ArrayList<Member> MemberList, Member m) {
			
			MemberList.add(m);
			System.out.println("Member added");
		}
		
	// view all member - Caleb
		public static String retrieveALLMembers(ArrayList<Member> MemberList) {
			String output = "";

			for (int i = 0; i < MemberList.size(); i++) {

				output += String.format("%-10s %-20c %-20d %-20s %10s %10s %10s\n", MemberList.get(i).getName(), MemberList.get(i).getGender(), MemberList.get(i).getMobile(),
						MemberList.get(i).getEmail(), MemberList.get(i).getDOB(), MemberList.get(i).getCountry(),MemberList.get(i).getPassword());
						
			}
			return output;
		}
// view members - Caleb
public static String viewMembers(ArrayList<Member> MemberList) {
	
	String output = String.format("%-10s %-20s %-20s %-20s %10s %10s %10s\n", "NAME", "GENDER",
			"MOBILE NO", "EMAIL","DATE OF BIRTH", "COUNTRY", "PASSWORD");
	 output += retrieveALLMembers(MemberList);	
	System.out.println(output);
	return null;
}

	// Delete Member - Caleb
		public static void deleteMember(ArrayList<Member>MemberList)
		{
			String Email=Helper.readString("Enter email to delete > ");
			for(int i=0;i<MemberList.size();i++){
				if(Email.equals(RegisterList.get(i).getMail())){
					System.out.println("This member cannot be deleted");
					}else {
					MemberList.remove(i);
					System.out.println("Member deleted");
				}
			}
			
		}
	//Update Member - Caleb
		public static void updateMember(ArrayList<Member>MemberList)
		{
			String name = Helper.readString("Enter member name to update > ");
			for(int i=0; i<MemberList.size();i++) {
				if(name.equalsIgnoreCase(MemberList.get(i).getName())) {
					String newPass = Helper.readString("Enter new password > ");
					MemberList.get(i).setPassword(newPass);
					
					String newCountry = Helper.readString("Enter new Country of residence > ");
					MemberList.get(i).setCountry(newCountry);
					
					int newNum = Helper.readInt("Enter new phone number > ");
					MemberList.get(i).setMobile(newNum);
					
					System.out.println("Member details updated!");
					
				}
			}
		}
	//Search by Country - Caleb
		public static void SearchByCountry(ArrayList<Member>MemberList) {
			
			String Country = Helper.readString("Enter Member Country of Residence > ");
			for(int i=0; i<MemberList.size();i++) {
			if(Country.equalsIgnoreCase(MemberList.get(i).getCountry())) {
				System.out.println(MemberList.get(i).getName());
			}
		}
	}
		// view member courses - Caleb
		public static void viewMemberCourses(ArrayList<Member>MemberList) {
			 String email = Helper.readString("Enter member's email to view upcoming courses > ");
			    for(int i=0;i<MemberList.size();i++) {
			      if(email.equals(RegisterList.get(i).getMail())) {
			        System.out.println(String.format("%-20s %-20s %-20s %-20s %-20s ", "NAME","EMAIL","COURSE NO","STATUS","START DATE"));
			        System.out.println(String.format("%-20s %-20s %-20s %-20s %-20s\n ", MemberList.get(i).getName(),MemberList.get(i).getEmail(),RegisterList.get(i).getRegistrationNo(),RegisterList.get(i).getStatus(),RegisterList.get(i).getRegistration_date()));
			      }
			    }
			  }
		
	//add course to list.Done by Si How.
	public static void addCourse(ArrayList<Courses> courseList)
	{
		boolean check=false;
		boolean check2=false;
		String code=Helper.readString("Enter course code > ");
		String title=Helper.readString("Enter course title >");
		String categoryName=Helper.readString("Enter category name > ");
		String description=Helper.readString("Enter course description > ");
		int duration=Helper.readInt("Enter course duration in years > ");
		String requisite=Helper.readString("Enter pre-requisite course > ");
		if(code.equals("")||title.equals("")||categoryName.equals("")||description.equals("")||duration==0||requisite.equals(""))
		{
			check2=false;
		}
		else
		{
			check2=true;
		}
		if(check2==false)
		{
			System.out.println("Please enter all details");
		}
		
		if(check2==true)
		{
		for(int i=0;i<courseList.size();i++)
		{
		if(!code.equals(courseList.get(i).getCode()))
		{
			check=false;
		}
		else
		{
			check=true;
		}
		
		}
		if(check==false)
		{
			courseList.add(new Courses(code,title,categoryName,description,duration,requisite));
			
		}
		else
		{
			System.out.println("Course code already exist!");
		}
		}
		
		
	}
	//Done by Si How
	public static  String retrieveAllCourses(ArrayList<Courses>courseList)
	{
		String output="";
		
		for(int i=0;i<courseList.size();i++)
		{
			output+=String.format("\n%-10s %-20s %-20s %-20s %-8d %-10s",courseList.get(i).getCode(),courseList.get(i).getTitle(),courseList.get(i).getName()
					,courseList.get(i).getDescription(),courseList.get(i).getDuration(),courseList.get(i).getRequisite());
		}
		return output;
	}
	//Done by Si How
	public static void viewAllCourses(ArrayList<Courses>courseList)
	{
		System.out.println("COURSES");
		String output=String.format("%-10s %-20s %-20s %-20s %-8s %-10s","COURSE CODE","TITLE","CATEGORY NAME","DESCRIPTION","DURATION","REQUISITE");
		output+=retrieveAllCourses(courseList);
		System.out.println(output);
	}
	//delete Done by Si How.
	public static void deleteCourse(ArrayList<Courses>courseList)
	{
		String code=Helper.readString("Enter course code to delete > ");
		for(int i=0;i<courseList.size();i++)
		{
			if(code.equals(courseList.get(i).getCode()) && courseList.get(i).getScheduleid()=="")
			{
				courseList.remove(i);
				System.out.println("Course deleted");
			}
			else
			{
				System.out.println("Course not deleted");
			}
		}
	}
	public static void assignSchedule(ArrayList<Courses> courseList)
	{
		int i=0;
		String scheduleid="";
		String code=Helper.readString("Enter course code to add schedule");
		for( i=0;i<courseList.size();i++)
		{
			if(code.equals(courseList.get(i).getCode()) )
			{
				 scheduleid=Helper.readString("Enter schedule id >");
			}
			else
			{
				System.out.println("Invalid course code");
			}
			if(scheduleid.equals(ScheduleList.get(i).getId()))
			{
				System.out.println("Assigned schedule to course");
				courseList.get(i).setScheduleid(scheduleid);
				System.out.println(courseList.get(i).getScheduleid());
			}
			else
			{
				System.out.println("Invalid schedule ID");
			}
			
		}
		
	}
	//Si How
	public static void inputUpdate(ArrayList<Courses> courseList)
	{
		String code=Helper.readString("Enter course code > ");
		
		for(int i=0;i<courseList.size();i++)
		{
			if(code.equals(courseList.get(i).getCode()));
			{
				String title=Helper.readString("Enter course title >");
				String categoryName=Helper.readString("Enter category name > ");
				String description=Helper.readString("Enter course description > ");
				int duration=Helper.readInt("Enter course duration in years > ");
				String requisite=Helper.readString("Enter pre-requisite course > ");
				courseList.get(i).setTitle(title);
				courseList.get(i).setName(categoryName);
				courseList.get(i).setDescription(description);
				courseList.get(i).setDuration(duration);
				courseList.get(i).setRequisite(requisite);
				System.out.println("Course updated!");
			}
		}
		
	}
	//Si How
	public static void searchCourse(ArrayList<Courses> courseList)
	{
		String output=String.format("%-10s %-20s %-20s %-20s %-8s %-10s","COURSE CODE","TITLE","CATEGORY NAME","DESCRIPTION","DURATION","REQUISITE");
		String categoryName=Helper.readString("Search course by category > ");
		for(int i=0;i<courseList.size();i++)
		{
			if(categoryName.equals(courseList.get(i).getName()))
			{
				output+=String.format("\n%-10s %-20s %-20s %-20s %-8d %-10s",courseList.get(i).getCode(),courseList.get(i).getTitle(),courseList.get(i).getName()
						,courseList.get(i).getDescription(),courseList.get(i).getDuration(),courseList.get(i).getRequisite());
			}
		}
		System.out.println(output);
	}
	//Si How
	public static void listSchForcourse(ArrayList<Courses>courseList)
	{
		String output=String.format("%-10s %-20s %-20s %-20s %-8s %-10s %-10s","SCHEDULE ID","COURSE CODE","TITLE","CATEGORY NAME","DESCRIPTION","DURATION","REQUISITE");
		for(int i=0;i<courseList.size();i++)
		{
			output+=String.format("\n%-10s %-20s %-20s %-20s %-10s %-8d %-10s",courseList.get(i).getScheduleid(),courseList.get(i).getCode(),courseList.get(i).getTitle(),courseList.get(i).getName()
					,courseList.get(i).getDescription(),courseList.get(i).getDuration(),courseList.get(i).getRequisite());
		}
		System.out.println(output);
	}
	
	
	//Add Course Category (Elayne)
		public static CourseCategory inputCategory() {
			String name = Helper.readString("Enter category name > ");
			String description = Helper.readString("Enter category description > ");
			
			CourseCategory courseCat = new CourseCategory(name, description);
			return courseCat;
		}
		
		public static void addCategory(ArrayList<CourseCategory> categoryList, CourseCategory courseCat) {
			categoryList.add(courseCat);
			System.out.println("Category Added!");
		}
		
		//View Course Category (Elayne)
		public static String retrieveAllCategory(ArrayList<CourseCategory> categoryList) {
			String output = "";
			
			for (int i = 0; i < categoryList.size(); i++) {
				output += String.format("%-50s %-50s\n", categoryList.get(i).getCategoryName(), categoryList.get(i).getCategoryDesc());
			}
			return output;
		}
		
		public static void viewAllCategory(ArrayList<CourseCategory> categoryList) {
			Helper.line(70, "=");
			System.out.println("COURSE CATEGORY LIST");
			Helper.line(70, "=");
			
			String output = String.format("%-50s %-50s\n", "CATEGORY NAME", "CATEGORY DESCRIPTION");
			output += retrieveAllCategory(categoryList);
			System.out.println(output);
		}
		
		//Delete Course Category (Elayne)

		public static void deleteCategory(ArrayList<CourseCategory>categoryList)
		{
			String catName=Helper.readString("Enter category name > ");
			for(int i=0;i<categoryList.size();i++)
			{
				if(catName.equalsIgnoreCase(categoryList.get(i).getCategoryName()))
				{
					categoryList.remove(i);
					System.out.println("Category deleted");
				}
				
			}
		}
		
		//Update Course Category (Elayne)
		public static void updateCategory(ArrayList<CourseCategory>categoryList)
		{
			String catName = Helper.readString("Enter category to update > ");
			for(int i=0; i<categoryList.size();i++) {
				if(catName.equalsIgnoreCase(categoryList.get(i).getCategoryName())) {
					String newDesc = Helper.readString("Enter new description > ");
					categoryList.get(i).setCategoryDesc(newDesc);;
					
					System.out.println("Category description updated!");
					
				}
			}
		}
		
		//Search Course Category (Elayne)
		public static void SearchCategory(ArrayList<CourseCategory>categoryList) {
			
			String output = "";
			
			String catName = Helper.readString("Enter search category name > ");
			for(int i=0; i<categoryList.size();i++) {
			if(catName.equalsIgnoreCase(categoryList.get(i).getCategoryName())) {
				Helper.line(20, "=");
				output += String.format("%-50s %-50s\n", categoryList.get(i).getCategoryName(), categoryList.get(i).getCategoryDesc());
				System.out.println(output);
			}else {
				Helper.line(20, "=");
				System.out.println("No Categories found");
			}
		}
	}
		
		//Show all Courses in Category (Elayne)
				public static void ShowCourses(ArrayList<Courses>courseList) {
					
					String output = "";
					
					String catName = Helper.readString("Enter category name > ");
					for(int i=0; i<courseList.size();i++) {
					if(catName.equalsIgnoreCase(courseList.get(i).getName())) {
						Helper.line(20, "=");
						output += String.format("%-50s\n", courseList.get(i).getTitle());
						
					}else {
						Helper.line(20, "=");
						System.out.println("No Courses found");
					}
					
				}
					System.out.println(output);
			}
				
				//New Delete Course Category (Elayne)

				public static void newDeleteCategory(ArrayList<Courses>courseList)
				{
					String catName=Helper.readString("Enter category name > ");
					for(int i=0;i<categoryList.size();i++)
					{
						if(catName.equalsIgnoreCase(courseList.get(i).getName()))
						{
							System.out.println("Category has been used in a course. unable to delete.");
						}else {
							categoryList.remove(i);
						}
						
					}
				}
			
		// Add Schedule - Hazim
				public static Course_Schedule inputschedule() {
					String id = Helper.readString("Enter Schedule ID > " );
					int price = Helper.readInt("Enter Price > ");
					String startdate = Helper.readString("Enter start date(DD/MM/YY) >  ");
					String enddate = Helper.readString("Enter End date(DD/MM/YY) >  ");
					String Location = Helper.readString("Enter Location > ");
					
					Course_Schedule CrseSche = new Course_Schedule( id,  price,  startdate,  enddate,  Location);
					return CrseSche;
					
				}
				public static void addSchedule(ArrayList<Course_Schedule> ScheduleList, Course_Schedule CrseSche) {
					ScheduleList.add(CrseSche);
					System.out.println("Schedule Added!");
					
				}
				// View Schedule - Hazim
				public static String retrieveAllSchedules(ArrayList<Course_Schedule> ScheduleList) {
					String output = "";
					
					for (int i = 0; i < ScheduleList.size(); i++) {
						output += String.format("%-20s %-20d %-20s %-20s %-20s\n", ScheduleList.get(i).getId(), ScheduleList.get(i).getPrice(), ScheduleList.get(i).getStartdate(),ScheduleList.get(i).getEnddate(), ScheduleList.get(i).getLocation());
						
					}
					return output;
				}
				public static void viewAllSchedules(ArrayList<Course_Schedule> ScheduleList) {
					Helper.line(70, "=");
					System.out.println("COURSE SCHEDULE LIST");
					Helper.line(70, "=");
					
					String output = String.format("%-20s %-20s %-20s %-20s %-20s\n", "Schedule ID", "PRICE", "START DATE", "END DATE", "LOCATION");
					output += retrieveAllSchedules(ScheduleList);
					System.out.println(output);
				}
				// Delete Schedule - Hazim
				public static void deleteSchedule(ArrayList<Course_Schedule>ScheduleList)
				{
					String id=Helper.readString("Enter Schedule ID to delete > ");
					for(int i=0;i<ScheduleList.size();i++)
					{
						if(id.equals(ScheduleList.get(i).getId()))
						{
							ScheduleList.remove(i);
							System.out.println("Schedule deleted");
						}
					}
					
				}
				//Update Course Schedule (Hazim)
				public static void updateSchedule(ArrayList<Course_Schedule>ScheduleList)
				{
					String ScheID = Helper.readString("Enter Schedule ID to update > ");
					for(int i=0; i<ScheduleList.size();i++) {
						if(ScheID.equalsIgnoreCase(ScheduleList.get(i).getId())) {
							int newPrice = Helper.readInt("Enter new Price > ");
							ScheduleList.get(i).setPrice(newPrice);
							String newStartDate = Helper.readString("Enter new start date > ");
							ScheduleList.get(i).setStartDate(newStartDate);
							String newEndDate = Helper.readString("Enter new end date > ");
							ScheduleList.get(i).setEnddate(newEndDate);
							String newLocation = Helper.readString("Enter new location > ");
							ScheduleList.get(i).setLocation(newLocation);
							
							System.out.println("Course Schedule updated!");
							
						}
					}
				}
				//Search Course Schedule by Price (Hazim)
				public static void SearchPrice(ArrayList<Course_Schedule>ScheduleList) {
					
					String output = "";
					
					int SchePrice = Helper.readInt("Enter Course Schedule price > ");
					for(int i=0; i<ScheduleList.size();i++) {
					if(SchePrice == ScheduleList.get(i).getPrice()) {
						Helper.line(20, "=");
						output += String.format("%-50s %-50d\n", ScheduleList.get(i).getId(), ScheduleList.get(i).getPrice());
						System.out.println(output);
					}else {
						Helper.line(20, "=");
						System.out.println("No Schedules found");
					}
				}
			}
				//Show all Members in Schedules (Hazim)
				public static void ShowRegMembers(ArrayList<RegisterCourse>RegisterList) {
					
					String output = "";
					
					int ScheID1 = Helper.readInt("Enter Schedule  ID > ");
					for(int i=0; i<RegisterList.size();i++) {
					if(ScheID1 == RegisterList.get(i).getCourse_schedule_id()) {
						Helper.line(20, "=");
						output += String.format("%-50d\n", RegisterList.get(i).getCourse_schedule_id());
						System.out.println(output);
					}else {
						Helper.line(20, "=");
						System.out.println("No Members found");
					}
				}
			}
				//New Delete Course Schedule (Hazim)

				public static void newDeleteSchedule(ArrayList<RegisterCourse>RegisterList)
				{
					int ScheID2=Helper.readInt("Enter schedule ID > ");
					for(int i=0;i<ScheduleList.size();i++)
					{
						if(ScheID2 == RegisterList.get(i).getCourse_schedule_id())
						{
							System.out.println("Schedule has been Registered by a member. Unable to delete!");
						}else {
							ScheduleList.remove(i);
						}
						
					}
				}
			    //Register Ganxi
			    public static void registerCourseSchedule(ArrayList<RegisterCourse> RegisterList){
			    	int registrationNo = Helper.readInt("Enter Registration No > ");
			    	int course_schedule_id = Helper.readInt("Enter Course Schedule ID > ");
			    	String email = Helper.readString("Enter email address > ");
			    	String status = Helper.readString("Enter status > ");
			    	String registrations_date= Helper.readString("Enter Course schedule date > ");
			    	
			    	RegisterCourse r = new RegisterCourse(registrationNo, course_schedule_id, email,status,registrations_date);
			    	RegisterList.add(r);
			    	System.out.println("Register successful!!");
			   }
			    //view Ganxi
			    public static String retrieveAllRegisterCourses(ArrayList<RegisterCourse>RegisterList)
			    {
			    	String output="";
			    	for(int i=0;i<RegisterList.size();i++)
			    	{
			    		output+=String.format("%-15d %-20d %-20s %-10s %-10s\n",RegisterList.get(i).getRegistrationNo(),
			    				RegisterList.get(i).getCourse_schedule_id(), RegisterList.get(i).getMail(),
			                    RegisterList.get(i).getStatus(), RegisterList.get(i).getRegistration_date()) ;
			    		}
			    	return output;
			    }
			    //view Ganxi
			    public static void viewRegistrations(ArrayList<RegisterCourse>RegisterList)
			    {
			    	System.out.println("REGISTRATION");
			    	String output=String.format("%-15s %-20s %-20s %-10s %-10s \n","REGISTRATION NO","COURSE SCHEDULE ID","MAIL","STATUS","DATE");
			    	output+=retrieveAllRegisterCourses(RegisterList);
			    	System.out.println(output);
			    	
			    }
			       
			    //delete Ganxi
			    public static void deleteRegistrations(ArrayList<RegisterCourse>RegisterList)
			    {
			    	String registrationNo=Helper.readString("Enter Registration No to delete > ");
			    	for(int i=0;i<RegisterList.size();i++)
			    	{
			    		if(registrationNo.equals(RegisterList.get(i).getRegistrationNo()))
			    		{
			    			RegisterList.remove(i);
			    			System.out.println("Registrations deleted");
			    			}
			    		}
			    }
					
				//Update status Ganxi
				public static void updateRegistration(ArrayList<RegisterCourse>RegisterList)
				{
					int registrationNo = Helper.readInt("Enter Registration No to update > ");
					for(int i=0; i<RegisterList.size();i++) {
						if(registrationNo == RegisterList.get(i).getRegistrationNo()) {
							String newStatus = Helper.readString("Enter new status > ");
							RegisterList.get(i).setStatus(newStatus);
								
							System.out.println("Course Registration Status updated!");
								
						}
					}
				}
					
				//Search registration Ganxi
				public static void SearchRegistration(ArrayList<RegisterCourse>RegisterList) {
					String output=String.format("%-15s %-20s %-20s %-10s %-10s \n","REGISTRATION NO","COURSE SCHEDULE ID","MAIL","STATUS","DATE");
						
					int coursescheduleid = Helper.readInt("Enter course schedule id > ");
					for(int i=0; i<RegisterList.size();i++) {
					if(coursescheduleid == RegisterList.get(i).getCourse_schedule_id()) {
						output+=String.format("%-15d %-20d %-20s %-10s %-10s\n",RegisterList.get(i).getRegistrationNo(),
			               RegisterList.get(i).getCourse_schedule_id(), RegisterList.get(i).getMail(),
			               RegisterList.get(i).getStatus(), RegisterList.get(i).getRegistration_date()) ;
						System.out.println(output);
						}else {
							System.out.println("No Registration found");
						}
					}
				}
				
				// show course schedule by member Ganxi
				public static void ShowCourseschedule(ArrayList<RegisterCourse>RegisterList) {
					String email = Helper.readString("Enter member's email to view course schdule registered > ");
					for(int i=0;i<RegisterList.size();i++) {
						if(email.equals(RegisterList.get(i).getMail())) {
							System.out.println(String.format("%-20s %-20s %-20s %-20s %-20s\n", "Schedule ID", "PRICE", "START DATE", "END DATE", "LOCATION"));
							System.out.println(String.format("%-20s %-20d %-20s %-20s %-20s\n", ScheduleList.get(i).getId(), ScheduleList.get(i).getPrice(), ScheduleList.get(i).getStartdate(),ScheduleList.get(i).getEnddate(), ScheduleList.get(i).getLocation()));
							}
						}
				}
				
				// new delete registration Ganxi
				public static void newDeleteRegistration(ArrayList<RegisterCourse>RegisterList)
				{
					int regNo =Helper.readInt("Enter registration no > ");
					String status =Helper.readString("Enter status > ");
					for(int i=0;i<RegisterList.size();i++)
					{
						if(status == "Accepted")
						{
							System.out.println(" Course Schedule registration status is Accepted. Unable to delete!");
						}else {
							RegisterList.remove(i);
						}
						
					}
				}

}
