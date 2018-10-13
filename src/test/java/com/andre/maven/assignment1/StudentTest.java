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
