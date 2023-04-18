package chap06;

import java.util.Scanner;

public class Task6_1 {

	public static void main(String[] args) {
		int[] score = new int[5];
		Scanner s = new Scanner(System.in);
		int sum = 0;
		for(int i = 0; i < score.length; i++) {
			System.out.print((i+1) +"번 학생의 국어 점수: ");
			score[i] = s.nextInt();
			sum += score[i];
		}
		System.out.println("합계: " + sum);
		System.out.printf("평균: %.1f" , (double)sum/score.length);
	}

}
