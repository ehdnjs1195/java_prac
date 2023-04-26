package manage;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Admin {
	final static int SIGN_UP = 1;
	final static int VIEW_USER_INFO = 2;
	final static int MODIFY_USER_INFO = 3;
	final static int DELETE_USER = 4;
	final static int VIEW_USER_LIST = 5;
	final static int SHUTDOWN = 0;
	
	
	public static void main(String[] args) {
//		User[] users = new User[100];
		ArrayList<User> users = new ArrayList<>();
		ManageUser mu = new ManageUser();
		
		Scanner s = new Scanner(System.in);
		int choose;
		boolean on = true;
		
		while(on) {
			System.out.println("관리 기능을 입력하세요.");
			System.out.println("회 원 가 입: 1");
			System.out.println("회원정보보기: 2");
			System.out.println("회원정보수정: 3");
			System.out.println("회원정보삭제: 4");
			System.out.println("회원목록보기: 5");
			System.out.println("프로그램종료: 0");
			choose = s.nextInt();
			switch(choose) {
				case SIGN_UP:
					users.add(mu.signUp());
					break;
				case VIEW_USER_INFO:
					mu.viewUsertInfo(users);
					break;
				case MODIFY_USER_INFO:
					mu.modifyUserInfo(users);
					break;
				case DELETE_USER:
					mu.deleteUser(users);
					break;
				case VIEW_USER_LIST:
					mu.viewUserList(users);
					break;
				case SHUTDOWN:
					on = false;
					System.out.println("프로그램을 종료합니다.");
					break;
				default:
					System.out.println("잘못된 입력값입니다. 다시 입력해주세요.");	
					break;
			}
		}
	}

}
