package org.itstep;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;

public class StudentServiceTest {

	@Test
	public void testGetStudentInArray() {
		StudentData[] array = new StudentData[3];
		StudentData student1 =new StudentData("Alex", "Borisov");
		StudentData student2 =new StudentData("Nik", "Harisson");
		StudentData student3 =new StudentData("Dik", "Advokat");
		array[0] = student1;
		array[1] = student2;
		array[2] = student3;
		StudentService studentService = new StudentService();
		StudentData[] studentName = studentService.getStudentInArray();
		String name = studentName[0].getFirstName();
		assertEquals("Alex", name);
	}

	@Test
	public void testGetStudentInList() {
		ArrayList list = new ArrayList();
		StudentData student1 =new StudentData("Alex", "Borisov");
		StudentData student2 =new StudentData("Nik", "Harisson");
		StudentData student3 =new StudentData("Dik", "Advokat");
		list.add(student1);
		list.add(student2);
		list.add(student3);
		StudentService studentService = new StudentService();
		ArrayList<StudentData> studentSecondName = studentService.getStudentInList();
		assertNotNull(studentSecondName != null);
	}

}
