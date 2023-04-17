package chap05;

public class Example06 {
	// calculate이라는 함수를 오버로딩하여 여러형태로 사용.
	public static void calculate(int x, int y) { // 정수 두개를 받아서 곱
		System.out.println(x * y);
	}
	public static void calculate(int x) { // 정수 하나를 받아서 제곱
		System.out.println(x * x);
	}
	public static void calculate(int x, double y) { // 정수와 실수의 곱
		System.out.println(x * y);
	}
	public static void calculate(double x) { // 실수의 제곱
		System.out.println(x * x);
	}
	
	public static void main(String[] args) {
		// 각 형태의 메서드를 호출함.
		calculate(2, 3);
		calculate(2, 3.14);
		calculate(2);
		calculate(2.5);
		
	}

}
