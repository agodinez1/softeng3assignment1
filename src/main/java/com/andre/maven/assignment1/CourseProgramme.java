package com.andre.maven.assignment1;

import java.util.List;

import org.joda.time.DateTime;

/**
 * Course Programme class
 * 
 * @author Andre Godinez - 15460718
 *
 */

public class CourseProgramme {
	
	private String courseName;
	private List<Student> enrolledStudents;
	private DateTime academicStartDate;
	private DateTime academicEndDate;
	
	public CourseProgramme() {}
	
	public CourseProgramme(String courseName, List<Student> enrolledStudents, DateTime academicStartDate,
			DateTime academicEndDate) {
		this.courseName = courseName;
		this.enrolledStudents = enrolledStudents;
		this.academicStartDate = academicStartDate;
		this.academicEndDate = academicEndDate;
	}
	
	public String getCourseName() {
		return courseName;
	}
	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}
	public List<Student> getEnrolledStudents() {
		return enrolledStudents;
	}
	public void setEnrolledStudents(List<Student> enrolledStudents) {
		this.enrolledStudents = enrolledStudents;
	}
	public DateTime getAcademicStartDate() {
		return academicStartDate;
	}
	public void setAcademicStartDate(DateTime academicStartDate) {
		this.academicStartDate = academicStartDate;
	}
	public DateTime getAcademicEndDate() {
		return academicEndDate;
	}
	public void setAcademicEndDate(DateTime academicEndDate) {
		this.academicEndDate = academicEndDate;
	}
}
