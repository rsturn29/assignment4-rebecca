package com.codercampus.assignment4;

public class Student implements Comparable<Student>{
	private String studentId;
	private String studentName;
	private String course;
	private String grade;
	public String getStudentId() {
		return studentId;
	}
	public void setStudentId(String studentId) {
		this.studentId = studentId;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public String getCourse() {
		return course;
	}
	public void setCourse(String course) {
		this.course = course;
	}
	public String getGrade() {
		return grade;
	}
	public void setGrade(String grade) {
		this.grade = grade;
	}

public Student(String studentId, String studentName, String course, String grade) {
	this.studentId = studentId;
	this.studentName = studentName;
	this.course = course;
	this.grade = grade;
}
public Student(String[] line) {
	studentId = line[0];
	studentName = line[1];
	course = line[2];
	grade = line[3];
}
@Override
public String toString() {
	
	return  studentId  +","+  studentName +"," + course +","+  grade +"\n";
}
@Override
public int compareTo(Student that) {
	if(this.getGrade().equals(that.getGrade())) {
	return this.studentName.compareTo(that.studentName);
} else{
	return this.getGrade().compareTo(that.getGrade());
}
}
	
}
