package chap04;

import java.util.Scanner;

public class Task4_5 {

	public static void main(String[] args) {
		System.out.println("점수를 입력하세요.");
		Scanner s = new Scanner(System.in);
		int num = s.nextInt();

		if (num / 10 == 10) {
			System.out.println("A학점");
		} else if (num / 10 == 9) {
			System.out.println("A학점");
		} else if (num / 10 == 8) {
			System.out.println("B학점");
		} else if (num / 10 == 7) {
			System.out.println("C학점");
		} else if (num / 10 == 6) {
			System.out.println("D학점");
		} else {
			System.out.println("F학점");
		}
	}

}
