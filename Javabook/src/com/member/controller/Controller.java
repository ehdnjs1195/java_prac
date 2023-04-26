package com.member.controller;

import java.io.File;
import java.io.FileWriter;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Scanner;

import com.member.domain.Member;
import com.member.exception.MemberException;

public class Controller extends ManageMember {
	ArrayList<Member> members = new ArrayList<>();
	int primeMemberNumber = 0;
	Scanner s = new Scanner(System.in);
	
	LocalDateTime now = LocalDateTime.now();
	String formatedNow = now.format(DateTimeFormatter.ofPattern("yyyyMMdd_HHmmss"));

	@Override
	public boolean createMember() { //고객 등록
		System.out.print("등록하실 회원의 이름을 입력하세요 : ");
		String name = s.next();
		System.out.print("등록하실 회원의 연락처를 입력하세요 : ");
		String phone = s.next();
		System.out.print("등록하실 회원의 주소를 입력하세요 : ");
		String addr = s.next();
		Member member = new Member(++primeMemberNumber, name, phone, addr);
		members.add(member);
		System.out.println("등록이 완료되었습니다.");
		return true;
	}

	@Override
	public boolean readMember() { //고객 정보 조회
		System.out.print("조회할 고객 번호를 입력해주세요 : ");
		int num = s.nextInt();
		boolean found = false; //고객을 찾았는지 여부확인
		if (num > 0 && num <= primeMemberNumber) {	//고객이 생성된 범위 전체에서 찾기.
			System.out.println("[고객 정보를 조회합니다]");
			for(int i = 0; i < members.size(); i++) { //명단 내에서 반복문 실행.
				if(members.get(i).getNum() == num) { //입력 받은 번호와 일치하는 고객이 있으면
					num = i;	//해당 인덱스를 저장
					found = true; //찾았음으로 변경.
				}
			}
			if(!found) { //명단 내에서 고객을 찾지 못한다면 삭제된 경우이므로
				System.out.println("이미 삭제된 고객입니다.");
				 return false; //메서드 종료.
			}
			System.out.println("회원번호: " + members.get(num).getNum());
			System.out.println("이름: " + members.get(num).getName());
			System.out.println("연락처: " + members.get(num).getPhone());
			System.out.println("주소: " + members.get(num).getAddr());
			System.out.println();
		} else {
			System.out.println("등록된 회원이 없습니다!\n");
		}

		return false;
	}

	@Override
	public boolean updateMember() {	//고객 정보 수정
		System.out.print("수정할 회원 번호를 입력해주세요: ");
		int num = s.nextInt();
		s.nextLine();	//nextInt() 로 숫자를 입력받고 엔터를 치면 버퍼에 엔터가 남는데, 그걸 가져가는 역할.
		
		boolean found = false; //고객을 찾았는지 여부확인
		if (num > 0 && num <= primeMemberNumber) {	//고객이 생성된 범위 전체에서 찾기.
			for(int i = 0; i < members.size(); i++) { //명단 내에서 반복문 실행.
				if(members.get(i).getNum() == num) { //입력 받은 번호와 일치하는 고객이 있으면
					num = i;	//해당 인덱스를 저장
					found = true; //찾았음으로 변경.
				}
			}
			if(!found) { //명단 내에서 고객을 찾지 못한다면 삭제된 경우이므로
				System.out.println("이미 삭제된 고객입니다.");
				 return false; //메서드 종료.
			}
			
			System.out.print("이름: " );
			String name = s.nextLine(); //nextLine은 엔터를 만나면 입력을 종료하므로 빈칸을 입력할 수 있다.
			if(!name.equals("")) members.get(num).setName(name); //빈칸이 아니라면 새로 받은 값으로 수정.
			
			System.out.print("연락처: " );
			String phone = s.nextLine();
			if(!phone.equals("")) members.get(num).setPhone(phone);
			
			System.out.print("주소: " );
			String addr = s.nextLine();
			if(!addr.equals("")) members.get(num).setAddr(addr);
			
			System.out.println("수정이 완료되었습니다.\n");
		} else {
			System.out.println("등록된 회원이 없습니다!\n");
		}

		return false;
	}

	@Override
	public boolean deleteMember() { //고객 정보 삭제
		System.out.print("삭제할 회원 번호를 입력해주세요: ");
		int num = s.nextInt();
		
		boolean found = false; //고객을 찾았는지 여부확인
		if (num > 0 && num <= primeMemberNumber) {	//고객이 생성된 범위 전체에서 찾기.
			for(int i = 0; i < members.size(); i++) { //명단 내에서 반복문 실행.
				if(members.get(i).getNum() == num) { //입력 받은 번호와 일치하는 고객이 있으면
					num = i;	//해당 인덱스를 저장
					found = true; //찾았음으로 변경.
				}
			}
			if(!found) { //명단 내에서 고객을 찾지 못한다면 삭제된 경우이므로
				System.out.println("이미 삭제된 고객입니다.");
				 return false; //메서드 종료.
			}
			
			members.remove(num); //입력받은 번호에 해당하는 고객 삭제.
			System.out.println("삭제 되었습니다.\n");
			
		} else {
			System.out.println("등록된 회원이 없습니다!\n");
		}
		return false;
	}

	@Override
	public boolean fileMember() {
		File file = new File("C:\\Users\\ADW.DESKTOP-9D96GT0\\Desktop\\고객관리\\" + formatedNow + "_고객 명단.txt");
		try{
			if(!file.exists()) //파일이 존재하지 않으면
				file.createNewFile(); //생성.
			FileWriter myWriter = new FileWriter(file);
			for(int i = 0; i < members.size(); i++) {
				myWriter.write(members.get(i).toString()+"\n");
			}
			myWriter.close();
			System.out.println("[고객명단 파일을 생성했습니다]");
			
		} catch(Exception e) {
			System.out.println(e);
		}
		return false;
	}

	@Override
	public void listMember() {
		if(members.size() == 0) {
			System.out.println("등록된 회원이 없습니다.\n");
			return ;
		}
		System.out.println("----------------------------------회 원 목 록----------------------------------");
		for (int i = 0; i < members.size(); i++) {
			System.out.printf("회원번호:%3s" , members.get(i).getNum());
			System.out.printf("\t이름:%5s" , members.get(i).getName());
			System.out.printf("\t번호:%15s" , members.get(i).getPhone());
//			System.out.printf("\t주소:%15s" , members.get(i).getAddr());
			System.out.println();
		}
		System.out.println("-----------------------------------------------------------------------------");
	}
	
	@Override
	public void memberException(Object choose)  throws MemberException {
		
	}

}
