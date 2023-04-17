package chap05;

import java.util.Scanner;

public class Task5_7 {

	public static void main(String[] args) {
		System.out.print("숫자를 입력하세요: ");
		Scanner s = new Scanner(System.in);
		int num = s.nextInt();
		
		star(num);
	}
	
	public static void star(int num) {//별로 tree를 만드는 함수
		int n = 1;
		while(true) {// break를 만나기 전까지 반복
			for(int i = 0; i < num; i++) System.out.print(" ");	//입력받은 num만큼 반복하여 공백출력.
			for(int i = 0; i < n; i++) System.out.print("*");	//n의 수 만큼 * 출력
			System.out.println();
			
			num--;	//공백은 하나씩 줄여가며 출력되도록
			n += 2;	//n은 2개씩 늘어나면서 출력되도록
			if(num < 0) break;	//num이 0보다 작으면 더 이상 출력할 수 없으므로 break
		}
	}

}
