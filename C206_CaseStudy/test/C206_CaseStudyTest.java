import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class C206_CaseStudyTest {
	private ArrayList<Courses>courseList;
	private ArrayList<Member>MemberList;
	private ArrayList<CourseCategory>categoryList;
	private ArrayList<Course_Schedule>ScheduleList;
	static ArrayList<RegisterCourse> RegisterList = new ArrayList<RegisterCourse>();
	@Before
	public void setUp() throws Exception {
		courseList=new ArrayList<Courses>();
		MemberList = new ArrayList<Member>();
		categoryList = new ArrayList<CourseCategory>();
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void c206_test() {
		//fail("Not yet implemented"); 
		assertTrue("C206_CaseStudy_SampleTest ",true);
	}
	// Caleb
	@Test
	public void addMemberTest() {
		assertEquals("Check that Member arraylist size is 0", 0, MemberList.size());
		assertNotNull("Check if there is valid Course arraylist to add to", MemberList);
		C206_CaseStudy.addMember(MemberList, null);
		assertEquals("Check that Member arraylist size is 1", 1, MemberList.size());   
		C206_CaseStudy.addMember(MemberList, null);
		assertEquals("Check that Member arraylist size is 2", 2, MemberList.size());    
		
	}
	// Caleb
	@Test
	public void viewMembersTest() {
		assertNotNull("Test if there is valid Member arraylist to retrieve item from",MemberList);
		String allMembers=C206_CaseStudy.viewMembers(MemberList);
		String testOutput = "";
		assertEquals("Test that the retrieved Memberlist is empty?", testOutput, allMembers);
	}
	// Caleb
	@Test
	public void deleteMemberTest() {
		C206_CaseStudy.addMember(MemberList, null);
		assertNotNull("Check if there is valid Member  to delete", MemberList);
		C206_CaseStudy.deleteMember(MemberList);	
		assertEquals("Check that Member arraylist size is 0", 0, MemberList.size());
	}
	//Si How
	@Test
	public void addCourseTest()
	{
		assertEquals("Check that Courses arraylist size is 0", 0, courseList.size());
		assertNotNull("Check if there is valid Course arraylist to add to", courseList);
		C206_CaseStudy.addCourse(courseList);
		assertEquals("Check that Courses arraylist size is 1", 1, courseList.size());   
		C206_CaseStudy.addCourse(courseList);
		assertEquals("Check that Courses arraylist size is 2", 2, courseList.size());    
		
	}
	//Si How
	@Test
	public void retrieveAllCoursesTest()
	{
		assertNotNull("Test if there is valid course arraylist to retrieve item from",courseList);
		C206_CaseStudy.addCourse(courseList);
		C206_CaseStudy.viewAllCourses(courseList);
		String allCourses=C206_CaseStudy.retrieveAllCourses(courseList);
		String testOutput = "";
		assertEquals("Test that the retrieved course is empty?", testOutput, allCourses);
	}
	//Si How
	@Test
	public void deleteCourseTest()
	{
		C206_CaseStudy.addCourse(courseList);
		assertNotNull("Check if there is valid Course  to delete", courseList);
		C206_CaseStudy.deleteCourse(courseList);	
		assertEquals("Check that Courses arraylist size is 0", 0, courseList.size());
		
	}
	//Si How
	@Test
	public void updateCourseTest()
	{
		C206_CaseStudy.addCourse(courseList);
		assertNotNull("Check if there is valid Course  to update", courseList);
		C206_CaseStudy.inputUpdate(courseList);
	}
	//Si How
	@Test
	public void searchByCatTest()
	{
		C206_CaseStudy.addCourse(courseList);
		assertNotNull("Check if there is valid Course  to search", courseList);
		C206_CaseStudy.searchCourse(courseList);
	}
	//Si How
	@Test
	public void listSchForCourseTest()
	{
		C206_CaseStudy.addCourse(courseList);
		C206_CaseStudy.assignSchedule(courseList);
		assertNotNull("Check if there is valid Course  to search", courseList);
		C206_CaseStudy.listSchForcourse(courseList);
		
	}
	
	//Done by Elayne
	@Test
	public void addCategoryTest()
	{
		assertEquals("Check that Category arraylist size is 0", 0, categoryList.size());
		assertNotNull("Check if there is valid Category arraylist to add to", categoryList);
		C206_CaseStudy.addCategory(categoryList, null);
		assertEquals("Check that Category arraylist size is 1", 1, categoryList.size());   
		C206_CaseStudy.addCategory(categoryList, null);
		assertEquals("Check that Category arraylist size is 2", 2, categoryList.size());    
		
	}
	//Done by Elayne
	@Test
	public void retrieveAllCategoryTest()
	{
		assertNotNull("Test if there is valid Category arraylist to retrieve item from",categoryList);
		String allCategory=C206_CaseStudy.retrieveAllCategory(categoryList);
		String testOutput = "";
		assertEquals("Test that the retrieved Category is empty?", testOutput, allCategory);
	}
	//Done by Elayne
	@Test
	public void deleteCategoryTest()
	{
		C206_CaseStudy.addCategory(categoryList, null);
		assertNotNull("Check if there is valid Category to delete", categoryList);
		C206_CaseStudy.deleteCategory(categoryList);	
		assertEquals("Check that Category arraylist size is 0", 0, categoryList.size());
	}
	
	@Test
	public void updateCategoryTest()
	{
		C206_CaseStudy.addCategory(categoryList, null);
		assertNotNull("Check if category is valid to update", categoryList);
		C206_CaseStudy.inputCategory();
	}
	
	public void searchByNameTest()
	{
		C206_CaseStudy.addCategory(categoryList, null);
		assertNotNull("Check if category is valid to search", categoryList);
		C206_CaseStudy.SearchCategory(categoryList);
	}
	
	//Done by Hazim
			@Test
			public void addScheduleTest()
			{
				assertEquals("Check that Schedule arraylist size is 0", 0, ScheduleList.size());
				assertNotNull("Check if there is valid Schedule arraylist to add to", ScheduleList);
				C206_CaseStudy.addSchedule(ScheduleList, null);
				assertEquals("Check that Schedule arraylist size is 1", 1, ScheduleList.size());   
				C206_CaseStudy.addSchedule(ScheduleList, null);
				assertEquals("Check that Schedule arraylist size is 2", 2, ScheduleList.size());    
				
			}
			//Done by Hazim
			@Test
			public void retrieveAllSchedules()
			{
				assertNotNull("Test if there is valid Schedule arraylist to retrieve item from",ScheduleList);
				String allSchedules=C206_CaseStudy.retrieveAllSchedules(ScheduleList);
				String testOutput = "";
				assertEquals("Test that the retrieved Schedule is empty?", testOutput, allSchedules);
			}
			//Done by Hazim
			@Test
			public void deleteSchedules()
			{
				C206_CaseStudy.addSchedule(ScheduleList, null);
				assertNotNull("Check if there is valid Schedule to delete", ScheduleList);
				C206_CaseStudy.deleteSchedule(ScheduleList);	
				assertEquals("Check that Schedules arraylist size is 0", 0, ScheduleList.size());
				
			}
			//Done by Hazim
			@Test
			public void updateScheduleTest()
			{
				C206_CaseStudy.addSchedule(ScheduleList, null);
				assertNotNull("Check if Schedule is valid to update", ScheduleList);
				C206_CaseStudy.inputschedule();
			}
			//Done by Hazim
			@Test
			public void searchByPriceTest()
			{
				C206_CaseStudy.addSchedule(ScheduleList, null);
				assertNotNull("Check if price of schedule is valid to search", ScheduleList);
				C206_CaseStudy.SearchPrice(ScheduleList);;
			}
		// Ganxi
        @Test
        public void registerCourseSchedule() {
            assertEquals("Check that RegisterCourse arraylist size is 0", 0, RegisterList.size());
            assertNotNull("Check if there is valid Course arraylist to add to", RegisterList);
            C206_CaseStudy.registerCourseSchedule(RegisterList);
            assertEquals("Check that Register arraylist size is 1", 1, RegisterList.size());  
            C206_CaseStudy.registerCourseSchedule(RegisterList);
            assertEquals("Check that Register arraylist size is 2", 2, RegisterList.size());   
           
        }
        // Ganxi
        @Test
        public void viewRegistrations() {
            assertNotNull("Test if there is valid Register arraylist to retrieve item from",RegisterList);
            String allRegistrations=C206_CaseStudy.viewRegistrations(RegisterList);
            String testOutput = "";
            assertEquals("Test that the retrieved Registerlist is empty?", testOutput, allRegistrations);
        }
        // Ganxi
        @Test
        public void deleteRegistrations() {
            C206_CaseStudy.registerCourseSchedule(RegisterList);
            assertNotNull("Check if there is valid Registrations to delete", RegisterList);
            C206_CaseStudy.deleteRegistrations(RegisterList);   
            assertEquals("Check that Register arraylist size is 0", 0, RegisterList.size());
        }
}
