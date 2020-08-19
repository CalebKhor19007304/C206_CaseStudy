

public class C206_CaseStudy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

			C206_CaseStudy crse = new C206_CaseStudy();
			crse.start();
	}
		
		
		private void start() {
			int option=0;
			
			while(option!=6)
			{
				option=Helper.readInt("Enter option > ");
				menu();
				if(option==1)
				{
					
				}
				else if(option==2)
				{
					
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

		
		
	private static void menu() 
	{
		System.out.println("Course Management System");
		System.out.println("1. Manage member");
		System.out.println("2. Manage course");
		System.out.println("3. Manage course schedule");
		System.out.println("4. Manage registration");
		System.out.println("5. Manage category");
		
	}
	public void addCourse()
	{
		
	}

}
