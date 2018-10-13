package com.andre.maven.assignment1_a;

import java.util.ArrayList;
import java.util.List;

import org.joda.time.DateTime;
import org.joda.time.Years;

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
	private List<Course> studentCourses;
	private List<Module> studentModules;

	public Student(String studentName, DateTime studentDOB, int studentId) {
		this.studentName = studentName;
		this.studentDOB = studentDOB;
		this.studentId = studentId;
		this.studentCourses = new ArrayList<Course>();
		this.studentModules = new ArrayList<Module>();
		this.calculateAge();
	}

	private void calculateAge() {
		Years age = Years.yearsBetween(studentDOB.toLocalDate(), DateTime.now().toLocalDate());

		this.studentAge = age.getYears();
	}

	public String getUsername() {
		return getStudentName() + getStudentAge();
	}

	public String getStudentName() {
		return studentName;
	}

	public int getStudentAge() {
		return studentAge;
	}

	public DateTime getStudentDOB() {
		return studentDOB;
	}

	public int getStudentId() {
		return studentId;
	}

	public void addStudentCourse(Course c) {
		this.studentCourses.add(c);
	}

	public void listStudentCourses() {
		for (Course course : studentCourses) {
			course.showCourseInfo();
		}
	}

	public void addStudentModule(Module m) {
		this.studentModules.add(m);
	}

	public void listStudentModules() {
		System.out.print(" MODULES: ");
		for (Module m : this.studentModules) {
			System.out.print(m.getModuleName() + ' ');
		}
	}
}
