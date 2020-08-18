package com;

public class highschoolstudent extends student{
private String electivename;

public String getElectivename() {
	return electivename;
}

public void setElectivename(String electivename) {
	this.electivename = electivename;
}

public highschoolstudent(int rollno, String name, int age, String electivename) {
	super(rollno, name, age);
	this.electivename = electivename;
}

public highschoolstudent() {
	super();
	// TODO Auto-generated constructor stub
}

public highschoolstudent(int rollno, String name, int age) {
	super(rollno, name, age);
	// TODO Auto-generated constructor stub
}

}
