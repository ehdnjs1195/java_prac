package chap05;

import java.util.Scanner;

public class Task5_5 {
	public static void loop() {
		int check = 1;
		Scanner s = new Scanner(System.in);
		
		while(check == 1) {	// check가 1이면 홀짝 체크 계속 반복
			System.out.println("숫자를 입력하세요.");
			int i = s.nextInt();
			if(i % 2 == 0) System.out.println("짝수 입니다.");
			else System.out.println("홀수 입니다.");
			
			System.out.println("게속하고 싶으면 예1, 그만하고 싶으면 아니오 0 을 입력하세요.");
			check = s.nextInt();
			
			while (check != 0 && check != 1) {	//계속할 지 정하도록 check입력 받기.
				System.out.println("잘못 입력하였습니다. 다시 입력하세요.");
				check = s.nextInt();
			}
		}
	}
	
	public static void main(String[] args) {
		loop();
	}

}
