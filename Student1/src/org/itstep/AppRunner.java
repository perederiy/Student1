package org.itstep;

import java.util.ArrayList;

public class AppRunner {

	public static void main(String[] args) {
		StudentService studentService = new StudentService();
		StudentData[] studentName = studentService.getStudentInArray();
		for(int i=0; i<studentName.length; i++) {	
			System.out.println(studentName[i].getFirstName());
		}
		
		ArrayList<StudentData> lists = studentService.getStudentInList();
		for(StudentData list:lists) {
			System.out.println(list.getSecondName());
		}
	}

}
