import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class C206_CaseStudyTest {
	private Courses crse1; 
	private ArrayList<Courses>courseList;
	
	@Before
	public void setUp() throws Exception {
		courseList=new ArrayList<Courses>();
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void c206_test() {
		//fail("Not yet implemented"); 
		assertTrue("C206_CaseStudy_SampleTest ",true);
	}
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

}
