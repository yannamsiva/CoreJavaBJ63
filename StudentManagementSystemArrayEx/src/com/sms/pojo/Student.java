package com.sms.pojo;

public class Student {

	private int sno;
	private String sname;
	private String sadd;
	public Student(int sno, String sname, String sadd) {
		super();
		this.sno = sno;
		this.sname = sname;
		this.sadd = sadd;
	}
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getSno() {
		return sno;
	}
	public void setSno(int sno) {
		this.sno = sno;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public String getSadd() {
		return sadd;
	}
	public void setSadd(String sadd) {
		this.sadd = sadd;
	}
	
	
}
