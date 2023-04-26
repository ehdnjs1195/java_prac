package manage;

import java.util.ArrayList;
import java.util.Scanner;

public class ManageUser {
	Scanner s = new Scanner(System.in);
	
	User signUp() {	// 회원가입
		System.out.println("회원가입을 진행합니다.");
		User u = new User();
		System.out.print("이름을 입력: ");
		u.name = s.next();
		System.out.print("id를 입력: ");
		u.id = s.next();
		System.out.print("pw를 입력: ");
		u.pw = s.next();
		System.out.print("email 입력: ");
		u.email = s.next();
		System.out.println("정상적으로 가입되었습니다. \n");
		return u;
	}

	void login() {	// 로그인
	} 

	void viewUsertInfo(ArrayList<User> users) { // 회원정보보기
		boolean found = false;
		System.out.print("조회할 회원 이름을 입력하세요: ");
		String name = s.next();
		for(int i = 0; i < users.size(); i++) {
			if(users.get(i).name.equals(name)) {
				System.out.println("회원이름: " + users.get(i).name);
				System.out.println("회원ID : "+ users.get(i).id);
				System.out.println("회원email: " + users.get(i).email);
				System.out.println();
				found = true;
				break;
			} 
		}
		if(!found) {
			System.out.println("일치하는 회원이 없습니다.\n");
		}
	}

	void modifyUserInfo(ArrayList<User> users) { // 회원정보수정
		boolean found = false;
		System.out.println("수정할 회원 이름을 입력하세요");
		String name = s.next();
		for(int i = 0; i < users.size(); i++) {
			if(users.get(i).name.equals(name)) {
				System.out.print("수정할 회원이름: ");
				users.get(i).name = s.next();
				System.out.print("수정할 회원ID : ");
				users.get(i).id = s.next();
				System.out.print("수정할 회원email: ");
				users.get(i).email = s.next();
				System.out.print("수정이 완료되었습니다.\n");
				found = true;
				break;
			} 
		}
		if(!found) {
			System.out.println("일치하는 회원이 없습니다.\n");
		}
	}

	void deleteUser(ArrayList<User> users) { // 회원정보삭제
		boolean found = false;
		System.out.println("삭제할 회원 이름을 입력하세요");
		String name = s.next();
		for(int i = 0; i < users.size(); i++) {
			if(users.get(i).name.equals(name)) {
				users.remove(i);
				System.out.println("회원이 정상적으로 삭제되었습니다.\n");
				found = true;
				break;
			} 
		}
		if(!found) {
			System.out.println("일치하는 회원이 없습니다.\n");
		}
	}

	void viewUserList(ArrayList<User> users) { // 회원목록보기
		if(users.size() == 0) {
			System.out.println("등록된 회원이 없습니다.\n");
			return ;
		}
		System.out.println("----------------회 원 목 록----------------");
		System.out.println("이름\tID\t\te-mail");
		System.out.println("-----------------------------------------");
		for(int i = 0; i < users.size(); i++) {
			System.out.print(users.get(i).name+"\t");
			System.out.print(users.get(i).id+"\t\t");
			System.out.print(users.get(i).email);
			System.out.println();
		}
		System.out.println("-----------------------------------------");
	}
}
