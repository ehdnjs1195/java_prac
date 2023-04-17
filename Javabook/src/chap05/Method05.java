package chap05;

public class Method05 {
	public static void calculate(int x, double y) {	// int형과 double형의 매개변수를 받아서
		System.out.println(2 * x * y); //원의 둘레를 계산하여 출력하는 함수
	}
	public static void main(String[] args) {
		int r = 4; //반지름
		double pi = 3.14; //원주율
		System.out.println("원의 둘레 구하는 공식 : 2 X 반지름 X 원주율");
		
		System.out.print("2 X " + r + " X " + pi + " = ");
		calculate(r, pi); // 함수를 호출하여 결과값 출력.
	}

}
