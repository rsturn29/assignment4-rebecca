package com.codercampus.assignment4;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;



public class FileService {
public Student[] getStudents () {
		
		BufferedReader reader = null;
		
		try {	
			int i = 0;
			String currentLine = null;
			Student[] students = new Student[100];
			reader = new BufferedReader(new FileReader("student-master.csv"));
			int skipLine = 0;
			while ((currentLine = reader.readLine()) != null) {
				if(skipLine== 0) {
					skipLine++;
					continue;
				}
				String[] line = currentLine.split(",");
				Student student = new Student(line[0], line[1], line[2], line[3]);
				students[i] = student;
				i++;
			}
			return students;
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if (reader != null) {
					reader.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		return null;

}}
