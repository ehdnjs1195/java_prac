package com.member.controller;

import com.member.exception.MemberException;

public abstract class ManageMember {
	abstract public boolean createMember();
	
	abstract public boolean readMember();
	
	abstract public boolean updateMember();
	
	abstract public boolean deleteMember();
	
	abstract public boolean fileMember();
	
	abstract public void listMember();
	
	abstract public void memberException(Object choose) throws MemberException;
	
}
