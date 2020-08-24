import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class C206_CaseStudyTest {
	private Courses crse1; 
	private ArrayList<Courses>courseList;
	private ArrayList<Member>MemberList;
	private ArrayList<CourseCategory>categoryList;
	private ArrayList<Course_Schedule>ScheduleList;
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
	public void addMember() {
		assertEquals("Check that Member arraylist size is 0", 0, MemberList.size());
		assertNotNull("Check if there is valid Course arraylist to add to", MemberList);
		C206_CaseStudy.addMember(MemberList, null);
		assertEquals("Check that Member arraylist size is 1", 1, MemberList.size());   
		C206_CaseStudy.addMember(MemberList, null);
		assertEquals("Check that Member arraylist size is 2", 2, MemberList.size());    
		
	}
	// Caleb
	@Test
	public void viewMembers() {
		assertNotNull("Test if there is valid Member arraylist to retrieve item from",MemberList);
		String allMembers=C206_CaseStudy.viewMembers(MemberList);
		String testOutput = "";
		assertEquals("Test that the retrieved Memberlist is empty?", testOutput, allMembers);
	}
	// Caleb
	@Test
	public void deleteMember() {
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
	public void retrieveAllCourses()
	{
		assertNotNull("Test if there is valid Chromebook arraylist to retrieve item from",courseList);
		String allCourses=C206_CaseStudy.retrieveAllCourses(courseList);
		String testOutput = "";
		assertEquals("Test that the retrieved Chromebooklist is empty?", testOutput, allCourses);
	}
	//Si How
	@Test
	public void deleteCourse()
	{
		C206_CaseStudy.addCourse(courseList);
		assertNotNull("Check if there is valid Course  to delete", courseList);
		C206_CaseStudy.deleteCourse(courseList);	
		assertEquals("Check that Courses arraylist size is 0", 0, courseList.size());
		
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
	public void retrieveAllCategory()
	{
		assertNotNull("Test if there is valid Category arraylist to retrieve item from",categoryList);
		String allCategory=C206_CaseStudy.retrieveAllCategory(categoryList);
		String testOutput = "";
		assertEquals("Test that the retrieved Category is empty?", testOutput, allCategory);
	}
	//Done by Elayne
	@Test
	public void deleteCategory()
	{
		C206_CaseStudy.addCategory(categoryList, null);
		assertNotNull("Check if there is valid Category  to delete", categoryList);
		C206_CaseStudy.deleteCategory(categoryList);	
		assertEquals("Check that Category arraylist size is 0", 0, categoryList.size());
	}//Done by Hazim
	@Test
	public void addScheduleTest()
	{
		assertEquals("Check that Schedule arraylist size is 0", 0, ScheduleList.size());
		assertNotNull("Check if there is valid Category arraylist to add to", ScheduleList);
		C206_CaseStudy.addSchedule(ScheduleList, null);
		assertEquals("Check that Schedule arraylist size is 1", 1, ScheduleList.size());   
		C206_CaseStudy.addSchedule(ScheduleList, null);
		assertEquals("Check that Category arraylist size is 2", 2, ScheduleList.size());    
		
	}
	//Done by Hazim
	@Test
	public void retrieveAllSchdules()
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
		C206_CaseStudy.deleteSchedules(ScheduleList);	
		assertEquals("Check that Schedules arraylist size is 0", 0, ScheduleList.size());
		

}
}
