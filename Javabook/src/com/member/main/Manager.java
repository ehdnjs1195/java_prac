package com.member.main;

import java.util.Scanner;

import com.member.controller.Controller;

public class Manager {
	final static int ENROLL_MEMBER = 1;
	final static int VIEW_MEMBER_INFO = 2;
	final static int UPDATE_MEMBER_INFO = 3;
	final static int DELETE_MEMBER = 4;
	final static int VIEW_MEMBER_LIST = 5;
	final static int MAKE_INFO_FILE = 6;
	final static int SHUTDOWN = 7;

	public static void main(String[] args) {
		Controller control = new Controller();

		Scanner s = new Scanner(System.in);
		String choose;
		boolean on = true;

		while (on) {
			System.out.println();
			System.out.println("***********************************************");
			System.out.println("\t\t회원 관리 프로그램");
			System.out.println("***********************************************");
			System.out.println("1. 고객 정보 등록하기\t2. 고객 정보 조회하기");
			System.out.println("3. 고객 정보 수정하기\t4. 고객 정보 삭제하기");
			System.out.println("5. 고객 정보 목록보기\t6. 고객 정보 파일저장");
			System.out.println("7. 종료");
			System.out.println("***********************************************");
			System.out.print("메뉴 번호를 선택해주세요. ");

			choose = s.next();	//선택옵션을 스트링으로 받기
			boolean isAlphabet = false;
			for(char tmp : choose.toCharArray()) { //한글자씩 받아서
				if(Character.isAlphabetic(tmp)) isAlphabet = true; //알파벳이면 
			}
			if(isAlphabet) { //문자를 입력할 수 없도록 하기
				System.out.println("문자는 입력할 수 없습니다.");
				continue;
			}
			switch (Integer.parseInt(choose)) {
				case ENROLL_MEMBER: // 1
					control.createMember();
					break;
				case VIEW_MEMBER_INFO: // 2
					control.readMember();
					break;
				case UPDATE_MEMBER_INFO: // 3
					control.updateMember();
					break;
				case DELETE_MEMBER: // 4
					control.deleteMember();
					break;
				case VIEW_MEMBER_LIST: // 5
					control.listMember();
					break;
				case MAKE_INFO_FILE:
					control.fileMember(); // 6
					break;
				case SHUTDOWN: // 7
					on = false;
					System.out.println("프로그램을 종료합니다.");
					break;
				default:
					System.out.println("잘못된 입력값입니다! 다시 입력해주세요.\n");
					break;
			}
		}
		
	}

}
