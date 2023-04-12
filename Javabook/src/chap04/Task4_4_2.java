package chap04;

public class Task4_4_2 {
	public static void main(String[] args) {
		for (int i = 0; i < 10; i++) {	//초기화식; 조건식; 증감식
			System.out.println("반복문 10번 실행");
		}
		
		int i = 0; //초기화식
		while (i < 10) { //조건식
			System.out.println("반복문 10번 실행");
			i++; //증감식
		}
	}
}
