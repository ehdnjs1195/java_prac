package chap04;

import java.util.Scanner;

public class Task4_6 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int choice = 1;
		
		while (choice == 1) {
			System.out.println("숫자를 입력하세요.");
			int a = s.nextInt();
			
			switch (a % 2) {	//입력 받은 숫자를 나머지 연산으로 케이스 나누기
				case 0:
					System.out.println("짝수입니다.");
					break;
				case 1:
					System.out.println("홀수입니다.");
					break;
			}
			System.out.println("계속은 1, 그만은 0 입력.");
			choice = s.nextInt();
		}
	}

}
