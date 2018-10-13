package com.andre.maven.assignment1;

import java.util.ArrayList;
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

	public Module(String moduleName) {
		this.moduleName = moduleName;
		this.enrolledStudents = new ArrayList<Student>();
		this.coursesAssociated = new ArrayList<Course>();
	}

	public String getModuleName() {
		return moduleName;
	}

	public void addStudents(Student e) {
		this.enrolledStudents.add(e);
	}

	public void addCoursesAssociated(Course c) {
		this.coursesAssociated.add(c);
	}

	public void printStudents() {
		for (Student s : this.enrolledStudents) {
			System.out
					.print("\t\t NAME: " + s.getStudentName() + ' ' + "DOB: " + s.getStudentDOB().toString("YYYY/MM/dd")
							+ ' ' + "AGE: " + s.getStudentAge() + ' ' + "USERNAME: " + s.getUsername());
			s.listStudentModules();
			s.listStudentCourses();
			System.out.println();
		}

	}

}
