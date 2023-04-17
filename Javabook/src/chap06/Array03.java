package chap06;

import java.util.Scanner;

public class Array03 {

	public static void main(String[] args) {
		double[][] marks = new double[2][3]; //double형 2차원 배열 선언
		Scanner s = new Scanner(System.in);

		for (int i = 0; i < 2; i++) {	//반복문을 돌면서
			System.out.println("학생번호" + (i + 1));
			System.out.print("국어점수 : ");
			marks[i][0] = s.nextDouble();	//i행의 0번째 인덱스 입력하기

			System.out.print("수학점수 : ");
			marks[i][1] = s.nextDouble();	//i행의 1번째 인덱스 입력하기

			marks[i][2] = (marks[i][0] + marks[i][1]) / 2;	//i행 2번째 인덱스에 평균값 넣기.
		}

		for (int i = 0; i < 2; i++) {	//반복문을 돌면서
			System.out.println("학생번호" + (i + 1));
			System.out.print("국어: " + marks[i][0] + " ");	//국어점수 출력
			System.out.print("수학: " + marks[i][1] + " ");	//수학점수 출력
			System.out.println("평균: " + marks[i][2]);		//평균점수 출력
		}
	}

}
