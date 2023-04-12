package chap04;

import java.util.Scanner;

public class Loop03 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("10보다 큰 숫자를 입력하세요.");
		int x = s.nextInt(); //정수 입력받기.
		int sum = 0;

		do { //먼저 한번 실행하고, 조건문이 참이면 계속 실행.
			sum += x; //sum에 x를 더하여 대입.
			x--; //x는 하나 감소
		} while (x >= 10); // x가 10보다 같거나 크면 반복실행.
		System.out.println("합계: " + sum); //합계 출력.
	}

}
