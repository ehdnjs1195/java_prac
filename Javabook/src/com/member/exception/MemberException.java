package com.member.exception;

public class MemberException extends Exception{
	String str;

	public MemberException(String str) {
		super();
		this.str = str;
	}
	
	@Override
	public String toString() {
		return "MemberException 발생 [str=" + str + "]";
	}
	
}
