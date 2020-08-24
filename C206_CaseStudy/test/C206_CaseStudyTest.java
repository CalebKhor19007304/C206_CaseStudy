import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class C206_CaseStudyTest {
	private Courses crse1; 
	private ArrayList<Courses>courseList;
	private ArrayList<Member>MemberList;
	
	@Before
	public void setUp() throws Exception {
		courseList=new ArrayList<Courses>();
		MemberList = new ArrayList<Member>();
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

}
