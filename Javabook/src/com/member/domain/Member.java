package com.member.domain;

public class Member {
	private int num;
	private String name;
	private String phone;
	private String addr;
	private	String grade;
	
	public Member() {}
	public Member(int num, String name, String phone, String addr) {
		super();
		this.num = num;
		this.name = name;
		this.phone = phone;
		this.addr = addr;
	}
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getAddr() {
		return addr;
	}
	public void setAddr(String addr) {
		this.addr = addr;
	}
	@Override
	public String toString() {
		return "회원번호: " + num + "\t\t 이름: " + name + "\t\t 전화: " + phone + "\t\t 주소: " + addr;
	}



}
