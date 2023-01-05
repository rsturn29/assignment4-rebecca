package com.codercampus.assignment4;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class StudentLists {

	public static void main(String[] args) throws IOException {
		FileService fileService = new FileService();
		Student[] students = fileService.getStudents();

		String compSciReg = "COMPSCI";
		String apmthReg = "APMTH";
		String statReg = "STAT";

		Arrays.sort(students, new Comparator<Student>() {
			public int compare(Student one, Student two) {
				if (two.getGrade().equals(one.getGrade())) {
					return one.getStudentName().compareTo(two.getStudentName());
				} else {
					return two.getGrade().compareTo(one.getGrade());
				}
			}
		});

		ArrayList<Student> compSciStudent = new ArrayList<>();
		ArrayList<Student> apmthStudent = new ArrayList<>();
		ArrayList<Student> statStudent = new ArrayList<>();

		for (Student student : students) {
			if (student.getCourse().contains(compSciReg)) {
				compSciStudent.add(student);
			} else if (student.getCourse().contains(apmthReg)) {
				apmthStudent.add(student);
			} else if (student.getCourse().contains(statReg)) {
				statStudent.add(student);
			}

		}

		Student[] newCompSci = new Student[compSciStudent.size()];
		for (int i = 0; i < compSciStudent.size(); i++) {
			newCompSci[i] = compSciStudent.get(i);
		}

		File file = new File("course1.csv");
		FileWriter fw = new FileWriter(file, true);
		BufferedWriter bw = new BufferedWriter(fw);
		bw.write("Student Id, Student Name, Course, Grade ");
		bw.newLine();
		for (int i = 0; i < newCompSci.length; i++) {
			bw.append(String.valueOf(newCompSci[i]));

		}

		bw.close();
		fw.close();

		Student[] newApmthStudent = new Student[apmthStudent.size()];
		for (int i = 0; i < apmthStudent.size(); i++) {
			newApmthStudent[i] = apmthStudent.get(i);
		}

		File file2 = new File("course2.csv");
		FileWriter fw2 = new FileWriter(file2, true);
		BufferedWriter bw2 = new BufferedWriter(fw2);
		bw2.write("Student Id, Student Name, Course, Grade ");
		bw2.newLine();
		for (int i = 0; i < newApmthStudent.length; i++) {
			bw2.append(String.valueOf(newApmthStudent[i]));

		}

		bw2.close();
		fw2.close();

		Student[] newStatStudent = new Student[statStudent.size()];
		for (int i = 0; i < statStudent.size(); i++) {
			newStatStudent[i] = statStudent.get(i);
		}

		File file3 = new File("course3.csv");
		FileWriter fw3 = new FileWriter(file3, true);
		BufferedWriter bw3 = new BufferedWriter(fw3);
		bw3.write("Student Id, Student Name, Course, Grade ");
		bw3.newLine();
		for (int i = 0; i < newStatStudent.length; i++) {
			bw3.append(String.valueOf(newStatStudent[i]));

		}

		bw3.close();
		fw3.close();
	}
}

