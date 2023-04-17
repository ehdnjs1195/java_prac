package chap05;

import java.util.Scanner;

public class Task5_6 {

	public static void main(String[] args) {
		System.out.println("3개의 숫자를 입력하세요");
		
		Scanner s = new Scanner(System.in);
		
		int x = s.nextInt();
		int y = s.nextInt();
		int z = s.nextInt();
		
		max(x, y, z);
		min(x, y, z);
	}
	
	public static void max(int x, int y, int z) {//세 정수 중 최대값을 출력하는 메서드
		int max = 0;
		if (x > max) max = x;
		if (y > max) max = y;
		if (z > max) max = z;
		System.out.println(max + "는 가장 큰 정수입니다.");
	}
	
	public static void min(int x, int y, int z) {//세 정수 중 최소값을 출력하는 메서드
		int min = Integer.MAX_VALUE;
		if (min > x) min = x;
		if (min > y) min = y;
		if (min > z) min = z;
		System.out.println(min + "는 가장 작은 정수입니다.");
	}

}
