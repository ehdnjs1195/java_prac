package chap04;

import java.util.Scanner;

public class Loop02 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int choice = 1;	//반복문을 계속 실행할 지 결정할 변수
		
		while( choice == 1) {	//choice가 1이면 계속 실행
			int a;
			
			System.out.println("숫자를 입력하세요.");
			a = s.nextInt();
			
			if(a%2 == 0) {	//입력받은 변수가 짝수면 실행
				System.out.println("짝수입니다.");
			}else {	//홀수면 실행
				System.out.println("홀수입니다.");
			}
			System.out.println("계속하고 싶으면 1, 그만하고 싶으면 0을 입력하세요");
			choice = s.nextInt(); //반복문을 계속 실행할 변수의 값을 입력
		}
		
		System.out.println("모든 숫자를 확인했습니다."); //반복문이 끝나면 실행되는 문장.
	}

}
