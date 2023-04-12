package chap04;

import java.util.Scanner;

public class Loop04 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in); // 길이 입력받기
		System.out.println("길이 : "); //

		int len = s.nextInt(); // 출력할 길이를 결정하는 변수를 입력받기.

		for (int i = 0; i < len; i++) { // i는 0부터 입력받은 숫자까지
			for (int j = 0; j < i; j++) {
				System.out.print(" "); // q빈칸을 출력
			}
			for (int j = 0; j < (2 * len) - 1 - (i * 2); j++) { // j는 등차수열로 감소하도록 범위 설정.
				System.out.print("*"); // j숫자만큼 '*'을 출력함.
			}
			System.out.println(""); // 한줄띄기
		} // for문을 통해 거꾸로 된 트리가 완성된다.
	}

}
