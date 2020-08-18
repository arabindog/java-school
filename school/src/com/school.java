package com;

import java.util.ArrayList;

public class school {
private String schoolname;
private String address;
ArrayList<classroom> clist=new ArrayList<classroom>();;


public school() {
	super();
	// TODO Auto-generated constructor stub
}
public school(String schoolname, String address) {
	super();
	this.schoolname = schoolname;
	this.address = address;
}
public String getSchoolname() {
	return schoolname;
}
public void setSchoolname(String schoolname) {
	this.schoolname = schoolname;
}
public String getAddress() {
	return address;
}
public void setAddress(String address) {
	this.address = address;
}
public ArrayList<classroom> getClist() {
	return clist;
}
public void setClist(ArrayList<classroom> clist) {
	this.clist = clist;
}
public void funclass(int classno,int maxstrength,String roomtype,ArrayList<student> s)
{
	clist.add(new classroom(roomtype,classno,maxstrength,s));
}
public void funlab(int classno,int maxstrength,String roomtype,ArrayList<student> s)
{
	clist.add(new computerlab(roomtype,classno,maxstrength,s));
	
}


public boolean addclassroom(int roomno, int strength,String roomtype, ArrayList<student> slist) throws ClassRoomAlreadyExistsException
{
	classroom c=new classroom(roomtype,strength,roomno,slist);
	boolean status=false;
	int flag=0;
	for(classroom cr:clist)
	{
		if(cr.getClassno()==c.getClassno())
		{
			flag=1;
		}
		else{
			flag=2;
		}
	}
	if(flag==1)
	{
		throw new ClassRoomAlreadyExistsException("classroom exists already");
	}
	if(flag==2)
	{
		clist.add(c);
		status=true;
	}
	return status;
}

public boolean registerStudentToClass(int classno,student s) throws ClassRoomNotFoundException, MaxCapacityExceededException, StudentAlreadyExistsException
{
	boolean status=false;
	int flag=0;
	for(classroom cr:clist)
	{
		if(cr.getClassno()==classno)
		{
			if(cr.getMaxstrength()<50)
				{
			for(student st:cr.getSlist())
			{
				if(st.getRollno()!=s.getRollno())
				{
					
					flag=6;
				}
				else{
					flag=5;
				}
			}
		}
			else{
				flag=4;
			}
	}
		else{
			flag=3;
		}
	}
	
	if(flag==6)
	{
		for(classroom cr:clist)
		{
			cr.getSlist().add(s);
		status=true;
	}
	}
				if(flag==5)
				{
					throw new StudentAlreadyExistsException("student already exists");
				}
				if(flag==4)
				{
					throw new MaxCapacityExceededException("max students");
				}
				if(flag==3)
				{
					throw new ClassRoomNotFoundException("invalid classroom");
				}

	return status;
}




public boolean removeStudent(int classno, int rollno) throws ClassRoomNotFoundException, StudentNotPresentException
{
	boolean status=false;
	int flag=0;
	student stuob=new student();
	for(classroom cr:clist)
	{
		if(cr.getClassno()==classno)
		{
			for(student st:cr.getSlist())
			{
				if(st.getRollno()==rollno)
				{
					flag=1;
					stuob.setRollno(rollno);
				}
				else{
					flag=2;
				}
			}
		}
		else{
			flag=3;
		}
	}
	if(flag==1)
	{
		for(classroom cr:clist)
		{
			cr.getSlist().remove(stuob);
	}
		
	}
	if(flag==2)
	{
		throw new StudentNotPresentException("student not present");
	}
	if(flag==3)
	{
		throw new ClassRoomNotFoundException("clasroom not found");
	}
	
return status;	
}

public ArrayList<student> getAllStudentsByAge(int age) 
{
	ArrayList<student> sli=new ArrayList<student>();
	for(classroom cr:clist)
	{
		for(student s:cr.getSlist())
		{
			if(s.getAge()==age)
			{
				sli.add(s);
			}
		}
	}
	return sli;
}

public ArrayList<highschoolstudent> getAllHighScoolStudents(String electivename)
{
ArrayList<highschoolstudent> hlist=new ArrayList<highschoolstudent>();

for(classroom cr:clist)
{
	for(student s:cr.getSlist())
	{
			if(s instanceof highschoolstudent)
			{
				if(((highschoolstudent) s).getElectivename()==electivename)
				{
					hlist.add((highschoolstudent) s);	
				}
			}
	}
}
	return hlist;
}
}