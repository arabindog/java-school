package com;

public class primarystudent extends student {
private String extraCurricularactivity;

public String getExtraCurricularactivity() {
	return extraCurricularactivity;
}

public void setExtraCurricularactivity(String extraCurricularactivity) {
	this.extraCurricularactivity = extraCurricularactivity;
}

public primarystudent(int rollno, String name, int age,
		String extraCurricularactivity) {
	super(rollno, name, age);
	this.extraCurricularactivity = extraCurricularactivity;
}

public primarystudent() {
	super();
	// TODO Auto-generated constructor stub
}

public primarystudent(int rollno, String name, int age) {
	super(rollno, name, age);
	// TODO Auto-generated constructor stub
}

}
