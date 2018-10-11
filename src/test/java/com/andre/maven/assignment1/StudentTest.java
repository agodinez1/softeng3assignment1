package com.andre.maven.assignment1;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.joda.time.DateTime;
import org.junit.Test;

/**
 * Unit test Student Class
 * 
 * @author Andre Godinez - 15460718
 * 
 */
public class StudentTest {
	
////	Course Test variables
//	private String courseName = "sampleCourseName";
//	private List<Student> enrolledStudents = new ArrayList<Student>();
//	private DateTime academicStartDate = new DateTime(2018,9,01,0,0);
//	private DateTime academicEndDate = new DateTime(2019,5,01,0,0);
//	
////	Module Test variables
//	private String moduleName = "sampleModuleName";
//	private List<Student> entrolledStudentsModule = new ArrayList<Student>();
//	private List<CourseProgramme> coursesAssociated = new ArrayList<CourseProgramme>();
//	
//	Student Test Variables
	private String studentName = "sampleName";
	private int studentAge = 21;
	private DateTime studentDOB = new DateTime(1997,10,03,0,0);
	private int studentId = 15406718;
	private String studentUsername = "testUsername";
	private List<Course> studentCourses = new ArrayList<Course>();
	private List<Module> studentModules = new ArrayList<Module>();
	
	@Test
	public void testGetUsername() {
		
		// Arrange
		studentCourses.add(new Course());
		studentModules.add(new Module());
		
		Student testStudent = new Student();
		testStudent.setStudentName(studentName);
		testStudent.setStudentAge(studentAge);
		testStudent.setStudentDOB(studentDOB);
		testStudent.setStudentId(studentId);
		testStudent.setStudentUsername(studentUsername);
		testStudent.setStudentCourses(studentCourses);
		testStudent.setStudentModules(studentModules);
		
		// Test
		String testUsername = testStudent.getUsername();
		
		// Verify
		assertEquals(testUsername, studentName+studentAge);
	}
		
	
}
