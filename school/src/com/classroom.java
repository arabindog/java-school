package com;

import java.util.ArrayList;

public class classroom {
private String roomtype;
private int classno;
private int maxstrength;
ArrayList<student> slist=new ArrayList<student>();

public String getRoomtype() {
	return roomtype;
}
public void setRoomtype(String roomtype) {
	this.roomtype = roomtype;
}
public int getClassno() {
	return classno;
}
public void setClassno(int classno) {
	this.classno = classno;
}
public int getMaxstrength() {
	return maxstrength;
}
public void setMaxstrength(int maxstrength) {
	this.maxstrength = maxstrength;
}
public ArrayList<student> getSlist() {
	return slist;
}
public void setSlist(ArrayList<student> slist) {
	this.slist = slist;
}
public classroom(String roomtype, int classno, int maxstrength,
		ArrayList<student> slist) {
	super();
	this.roomtype = roomtype;
	this.classno = classno;
	this.maxstrength = maxstrength;
	this.slist = slist;
}
public classroom() {
	super();
	// TODO Auto-generated constructor stub
}

}
