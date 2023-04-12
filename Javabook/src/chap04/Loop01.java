package chap04;

import java.util.Scanner;

public class Loop01 {

	public static void main(String[] args) {
		int sum = 0;	//합계를 받을 변수
		System.out.println("5개의 숫자를 입력하세요.");
		
		for(int n = 1; n <= 5; n++) {	//n은 1부터 5까지 5번 반복하기.
			Scanner s = new Scanner(System.in);
			int num = s.nextInt();	//num을 사용자로부터 입력받아서
			sum += num;	//sum에 더해주기. sum = sum + num;
		}
		
		System.out.println("합계: " + sum);	//합계 출력
	}

}
