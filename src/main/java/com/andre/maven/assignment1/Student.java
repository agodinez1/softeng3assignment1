package com.andre.maven.assignment1;

import java.util.List;

import org.joda.time.DateTime;

/**
 * Student class
 * 
 * @author Andre Godinez - 15460718
 *
 */

public class Student {

	private String studentName;
	private int studentAge;
	private DateTime studentDOB;
	private int studentId;
	private String studentUsername;
	private List<Course> studentCourses;
	private List<Module> studentModules;
	
	public Student() {}
	
	public Student(String studentName, int studentAge, DateTime studentDOB, int studentId, String studentUsername,
			List<Course> studentCourses, List<Module> studentModules) {
		this.studentName = studentName;
		this.studentAge = studentAge;
		this.studentDOB = studentDOB;
		this.studentId = studentId;
		this.studentUsername = studentUsername;
		this.studentCourses = studentCourses;
		this.studentModules = studentModules;
	}

	public String getUsername() {
		return getStudentName()+getStudentAge();
	}
	
	public String getStudentName() {
		return studentName;
	}
	
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	
	public int getStudentAge() {
		return studentAge;
	}
	
	public void setStudentAge(int studentAge) {
		this.studentAge = studentAge;
	}

	public DateTime getStudentDOB() {
		return studentDOB;
	}

	public void setStudentDOB(DateTime studentDOB) {
		this.studentDOB = studentDOB;
	}

	public int getStudentId() {
		return studentId;
	}

	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}

	public String getStudentUsername() {
		return studentUsername;
	}

	public void setStudentUsername(String studentUsername) {
		this.studentUsername = studentUsername;
	}

	public List<Course> getStudentCourses() {
		return studentCourses;
	}

	public void setStudentCourses(List<Course> studentCourses) {
		this.studentCourses = studentCourses;
	}

	public List<Module> getStudentModules() {
		return studentModules;
	}

	public void setStudentModules(List<Module> studentModules) {
		this.studentModules = studentModules;
	}
	
}
