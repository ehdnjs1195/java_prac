package chap04;

import java.util.Scanner;

public class If03 {

	public static void main(String[] args) {
		System.out.println("점수를 입력하세요.");

		Scanner s = new Scanner(System.in);
		int grade = s.nextInt();

		if (grade >= 90) { //grade가 90이상일 때
			System.out.println("A학점");
		} else if (grade >= 80) {	//grade가 90미만, 80이상일 때
			System.out.println("B학점");
		} else if (grade >= 70) {	//grade가 80미만, 70이상일 때
			System.out.println("C학점");
		} else if (grade >= 60) {	//grade가 70미만, 60이상일 때
			System.out.println("D학점");
		} else {	//grade가 60미만일 때
			System.out.println("F학점");
		}
	}

}
