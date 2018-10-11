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
	private List<CourseProgramme> coursesAssociated;
	
	public Module(String moduleName, List<Student> enrolledStudents, List<CourseProgramme> coursesAssociated) {
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

	public List<CourseProgramme> getCoursesAssociated() {
		return coursesAssociated;
	}

	public void setCoursesAssociated(List<CourseProgramme> coursesAssociated) {
		this.coursesAssociated = coursesAssociated;
	}
	
}
