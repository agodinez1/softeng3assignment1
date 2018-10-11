package com.andre.maven.assignment1;

import java.util.List;

/**
 * Module class
 *
 * @author Andre Godinez - 15406718
 *
 */

public class Module {

	private String moduleName;
	private List<Student> enrolledStudents;
	private List<Course> coursesAssociated;
	
	public Module() {}
	
	public Module(String moduleName, List<Student> enrolledStudents, List<Course> coursesAssociated) {
		this.moduleName = moduleName;
		this.enrolledStudents = enrolledStudents;
		this.coursesAssociated = coursesAssociated;
	}

	public String getModuleName() {
		return moduleName;
	}

	public void setModuleName(String moduleName) {
		this.moduleName = moduleName;
	}

	public List<Student> getEnrolledStudents() {
		return enrolledStudents;
	}

	public void setEnrolledStudents(List<Student> enrolledStudents) {
		this.enrolledStudents = enrolledStudents;
	}

	public List<Course> getCoursesAssociated() {
		return coursesAssociated;
	}

	public void setCoursesAssociated(List<Course> coursesAssociated) {
		this.coursesAssociated = coursesAssociated;
	}
	
}
