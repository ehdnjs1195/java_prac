package chap06;

import java.util.Scanner;

public class Task6_2 {

	public static void main(String[] args) {
		int[][] scores = new int[5][3];
		Scanner s = new Scanner(System.in);
		int[] sum = new int[5];

		for (int i = 0; i < scores.length; i++) {
			System.out.print((i + 1) + "번 학생의 국어 점수: ");
			scores[i][0] = s.nextInt();
			System.out.print((i + 1) + "번 학생의 영어 점수: ");
			scores[i][1] = s.nextInt();
			System.out.print((i + 1) + "번 학생의 수학 점수: ");
			scores[i][2] = s.nextInt();
			for (int j = 0; j < scores[i].length; j++) {
				sum[i] += scores[i][j];
			}
		}

		for (int i = 0; i < scores.length; i++) {
			System.out.printf("%d번 학생의 총점: %d, %d번 학생의 평균: %.1f\n"
					, (i + 1), sum[i], (i + 1), (double)sum[i]/scores[i].length);
		}
	}

}
