package com.andre.maven.assignment1;

import static org.junit.Assert.assertEquals;

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
	private DateTime studentDOB = new DateTime(1997,10,03,0,0,0,0);
	private int studentId = 15406718;
	
	@Test
	public void testGetUsername() {
		
		// Arrange
		Student testStudent = new Student(studentName,studentDOB, studentId);
		
		// Test
		String testUsername = testStudent.getUsername();
		int studentAge = testStudent.getStudentAge();
		
		// Verify
		assertEquals(21, studentAge);
		assertEquals(studentName+studentAge, testUsername);
	}
		
	
}
