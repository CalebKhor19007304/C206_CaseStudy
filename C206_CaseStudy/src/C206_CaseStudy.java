import java.util.ArrayList;

public class C206_CaseStudy {
	static String code;
	static ArrayList<Courses>courseList=new ArrayList<Courses>();
	static ArrayList<Member> MemberList = new ArrayList<Member>();
	static ArrayList<CourseCategory> categoryList = new ArrayList<CourseCategory>();
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

			C206_CaseStudy crse = new C206_CaseStudy();
			crse.start();
	}
		
		
		public void start() {
			int option=0;
			int optionCourse=0;
			int memberOption = 0;
			
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
					System.out.println("4. Quit");
					memberOption = Helper.readInt("Enter option > ");
					
					if(memberOption == 1) {
						Member m = inputMember();
						C206_CaseStudy.addMember(MemberList, m);
					}else if(memberOption == 2) {
						C206_CaseStudy.viewMembers(MemberList);
					}else if(memberOption == 3) {
						C206_CaseStudy.deleteMember(MemberList);
					}else if(memberOption == 4) {
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
					else if(option==4)
					{
						System.out.println("Thank you for using the system");
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
					
					} else {
						System.out.println("Invalid type");
					}
				}
				else if(option==4)
				{
					
				}
				else if(option==5)
				{
					
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
		System.out.println("4. Manage registration");
		System.out.println("5. Manage course schedule");
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
	}
	
	//input member details - Caleb
	public static Member inputMember(){
		
		String name = Helper.readString("Enter Name > ");
		char gender = Helper.readChar("Enter Gender (M/F) > ");
		int mobile = Helper.readInt("Enter Mobile Number > ");
		String email = Helper.readString("Enter email address > ");
		String DOB = Helper.readString("Enter Date of Birth (DD/MM/YYYY) > ");
		String country = Helper.readString("Enter country of residence > ");
		
		Member m= new Member(name, gender,mobile,email,DOB,country);
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

				output += String.format("%-10s %-20c %-20d %-20s %-8s %10s\n", MemberList.get(i).getName(), MemberList.get(i).getGender(), MemberList.get(i).getMobile(),
						MemberList.get(i).getEmail(), MemberList.get(i).getDOB(), MemberList.get(i).getCountry());
						
			}
			return output;
		}
// view members - Caleb
public static String viewMembers(ArrayList<Member> MemberList) {
	
	String output = String.format("%-10s %-20s %-20s %-20s %-8s %10s\n", "NAME", "GENDER",
			"MOBILE NO", "EMAIL","DATE OF BIRTH", "COUNTRY");
	 output += retrieveALLMembers(MemberList);	
	System.out.println(output);
	return null;
}

	// Delete Member - Caleb
		public static void deleteMember(ArrayList<Member>MemberList)
		{
			String Email=Helper.readString("Enter email to delete > ");
			for(int i=0;i<MemberList.size();i++)
			{
				if(Email.equals(MemberList.get(i).getEmail()))
				{
					MemberList.remove(i);
					System.out.println("Member deleted");
				}
			}
		}
	//add course to list.Done by Si How
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
			if(code.equals(courseList.get(i).getCode()))
			{
				courseList.remove(i);
				System.out.println("Course deleted");
			}
		}
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
		public static boolean doDeleteCategory(ArrayList<CourseCategory> categoryList, String name) {
			boolean isDeleted = false;
			
			for (int i = 0; i < categoryList.size(); i++) {
				if (name.equalsIgnoreCase(categoryList.get(i).getCategoryName())) {
					isDeleted = true;
				}
			}
			return isDeleted;
		}
		
		public static void deleteCategory(ArrayList<CourseCategory> categoryList) {
			C206_CaseStudy.viewAllCategory(categoryList);
			String name = Helper.readString("Enter category name > ");
			Boolean isDeleted = doDeleteCategory(categoryList, name);
			
			if (isDeleted == true) {
				System.out.println("Category " + name + " deleted!");
			} else {
				System.out.println("Invalid category name");
			}
		}
}
