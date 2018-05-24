package org.itstep;

public class StudentData {

	private String firstName;
	private String secondName;
	private int age;
	private String dateOfBirth;
	private String group;
	
	public String getFirstName() {
		return firstName;
	}
	
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getSecondName() {
		return secondName;
	}

	public void setSecondName(String secondName) {
		this.secondName = secondName;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(String dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public String getGroup() {
		return group;
	}

	public void setGroup(String group) {
		this.group = group;
	}

	public StudentData(String firstName, String secondName, int age, String dateOfBirth, String group) {
		super();
		this.firstName = firstName;
		this.secondName = secondName;
		this.age = age;
		this.dateOfBirth = dateOfBirth;
		this.group = group;
	}

	public StudentData(String firstName, String secondName) {
		super();
		this.firstName = firstName;
		this.secondName = secondName;
	}

	public StudentData() {
		super();
	}
	
	
	
}
