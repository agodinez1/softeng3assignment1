package com.andre.maven.assignment1_a;

import java.util.ArrayList;
import java.util.List;

import org.joda.time.DateTime;

/**
 * Course class
 * 
 * @author Andre Godinez - 15460718
 *
 */

public class Course {

	private String courseName;
	private List<Student> enrolledStudents;
	private List<Module> associatedModules;
	private DateTime academicStartDate;
	private DateTime academicEndDate;

	public Course(String courseName, DateTime academicStartDate, DateTime academicEndDate) {
		this.courseName = courseName;
		this.enrolledStudents = new ArrayList<Student>();
		;
		this.associatedModules = new ArrayList<Module>();
		this.academicStartDate = academicStartDate;
		this.academicEndDate = academicEndDate;
	}

	public void showCourseInfo() {
		System.out.print("COURSE_NAME: " + this.courseName + " ACADEMIC_START_DATE: "
				+ this.academicStartDate.toString("dd/MM/YYYY") + " ACADEMIC_END_DATE: "
				+ this.academicEndDate.toString("dd/MM/YYYY"));
	}

	public void showCourseModules() {
		System.out.println("\n COURSE MODULES: ");
		for (Module module : associatedModules) {
			System.out.println("\n \t MODULE_NAME: " + module.getModuleName());
			System.out.println("\t ASSOCIATED STUDENTS:");
			module.printStudents();
		}
	}

	public void enrollStudent(Student s) {
		this.enrolledStudents.add(s);
	}

	public void addModule(Module m) {
		this.associatedModules.add(m);
	}

	public DateTime getAcademicStartDate() {
		return academicStartDate;
	}

	public DateTime getAcademicEndDate() {
		return academicEndDate;
	}

}
