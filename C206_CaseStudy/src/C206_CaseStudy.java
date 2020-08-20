import java.util.ArrayList;

public class C206_CaseStudy {
	static String code;
	ArrayList<Courses>courseList=new ArrayList<Courses>();
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

			C206_CaseStudy crse = new C206_CaseStudy();
			crse.start();
	}
		
		
		public void start() {
			int option=0;
			int optionCourse=0;
			
			while(option!=6)
			{
				
				menu();
				option=Helper.readInt("Enter option > ");
				
				if(option==1)
				{
					
				}
				else if(option==2)
				{
					System.out.println("1.Add Course");
					System.out.println("2.Update Course");
					System.out.println("3.Delete Course");
					optionCourse=Helper.readInt("Enter option > ");
					if(optionCourse==1)
					{
						C206_CaseStudy.addCourse(courseList);
					}
					else if(optionCourse==2)
					{
						
					}
					else if (optionCourse==3)
					{
						
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
				else if(option==3)
				{
					
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
		System.out.println("3. Manage course schedule");
		System.out.println("4. Manage registration");
		System.out.println("5. Manage category");
		System.out.println("6. Quit");
		
	}

	//add course to list.
	public static void addCourse(ArrayList<Courses> courseList)
	{
		boolean check=false;
		boolean check2=false;
		String code=Helper.readString("Enter course code > ");
		String title=Helper.readString("Enter course title >");
		String categoryName=Helper.readString("Enter category name > ");
		String description=Helper.readString("Enter course description > ");
		String duration=Helper.readString("Enter course duration > ");
		String requisite=Helper.readString("Enter pre-requisite course > ");
		if(code.equals("")||title.equals("")||categoryName.equals("")||description.equals("")||duration.equals("")||requisite.equals(""))
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
		if(!code.equals(courseList.get(i).getCode())||!code.equals("")||!title.equals("")||!categoryName.equals("")||!description.equals("")||!duration.equals("")||!requisite.equals(""))
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
			System.out.println(courseList.size());
		}
		else
		{
			System.out.println("Course code already exist!");
		}
		}
		
		
	}
	
}
