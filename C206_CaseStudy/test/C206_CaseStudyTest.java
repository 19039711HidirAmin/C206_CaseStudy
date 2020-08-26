import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class C206_CaseStudyTest {
	
	private CourseSchedule S1;
	
	private ArrayList<Course> courseList;
	private ArrayList<CourseCategory> categoryList;
	private ArrayList<CourseSchedule> scheduleList;
	private ArrayList<Members> memberList;
	
	public C206_CaseStudyTest() {
		super();
	}
	@Before
	public void setUp() throws Exception {
		//prepare test data
		
		S1 = new CourseSchedule(25,20,"25/10/2020 9:00","22/12/2020 10:00","RP");
		
		courseList = new ArrayList<Course>();
		categoryList = new ArrayList<CourseCategory>();
		scheduleList = new ArrayList<CourseSchedule>();
		memberList = new ArrayList<Members>();
	}

	@After
	public void tearDown() throws Exception {
		S1 = null;
		courseList = null;
		categoryList=null;
		scheduleList=null;
		memberList = null;
	}

	@Test
	public void c206_test() {
		//fail("Not yet implemented"); 
		assertTrue("C206_CaseStudy_SampleTest ",true);
	}
	// Member 4 - Haziq Hilman
	@Test
	public void doAddCourseScheduleTest() {
		// Item list is not null, so that can add a new item - boundary
		assertNotNull("Check if there is valid Course Schedule arraylist to add to", scheduleList);
		//Given an empty list, after adding 1 item, the size of the list is 1 - normal
		//The item just added is as same as the first item of the list
		C206_CaseStudy.addCourseSchedule(scheduleList, S1);
		assertEquals("Check that Course Schedule arraylist size is 1", 1, scheduleList.size());
		assertSame("Check that Course Schedule is added", S1, scheduleList.get(0));
		
	}
	@Test
	public void retrieveAllCourseScheduleTest() {
		// Test if Item list is not null but empty -boundary
		assertNotNull("Test if there is valid Course Schedule arraylist to retrieve item", scheduleList);
		
		//test if the list of course schedules retrieved from the SourceCentre is empty - boundary
		String allCourseSchedule= C206_CaseStudy.retrieveAllCourseSchedule(scheduleList);
		String testOutput = "";
		assertEquals("Check the View All Course Schedule", testOutput, allCourseSchedule);
		
		//Given an empty list, after adding 1 item, test if the size of the list is 1 - normal
		C206_CaseStudy.addCourseSchedule(scheduleList, S1);
		assertEquals("Test that Course Schedule arraylist size is 1", 1, scheduleList.size());
		
		//test if the expected output string same as the list of course schedules retrieved from the SourceCentre	
		allCourseSchedule= C206_CaseStudy.retrieveAllCourseSchedule(scheduleList);
		testOutput = String.format("%-10s %-10s %-20s %-20s %-10s","25", "20.00","25/10/2020 9:00","22/12/2020 10:00","RP");
		assertEquals("Test the View All Course Schedule", testOutput, allCourseSchedule);
		
	}
	@Test	
	public void doDeleteCourseScheduleTest() {
		// Item list is not null, so that can delete an item - boundary
		assertNotNull("Check if there is valid Camcorder arraylist to add to", scheduleList);
		
		//Given an empty list, after adding 1 item, test if the size of the list is 1 - normal
		C206_CaseStudy.addCourseSchedule(scheduleList, S1);
		assertEquals("Test that Course Schedule arraylist size is 1", 1, scheduleList.size());
		
		// Given a list that is not empty, after removing 1 item, test if the size of the list is 0 - normal
		C206_CaseStudy.deleteCourseSchedule(scheduleList, S1.getId());
		assertEquals("Test that Course Schedule arraylist size is 0", 0, scheduleList.size());
		
	}
	
}
