package chap06;

import java.util.Scanner;

public class Task6_10 {

	public static void main(String[] args) {
		int arr[][] = new int[9][9];
		Scanner s = new Scanner(System.in);
		int max = 0;	//최대값 저장
		int col = 0, row = 0;	// 좌표 저장할 변수
		
		for (int i = 0; i < 9; i++) { //81개 숫자 저장
			for (int j = 0; j < 9; j++) {
				arr[i][j] = s.nextInt();
			}
		}
		
		for (int i = 0; i < 9; i++) {
			for (int j = 0; j < 9; j++) {
				if(arr[i][j] > max) {
					max = arr[i][j];	//최대값으로 저장
					col = i;	//행 좌표 
					row = j;	//열 좌표
				}
			}
		}
		
		System.out.println("입력된 값 중 최대값은: " + max);
		System.out.println("최대값의 좌표는: " + (col + 1) + "행 " + (row + 1) + "열");
		
	}

}
