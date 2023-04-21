package chap08;

public class Calculation {
	int z;	//멤버 변수 선언
	
	public void addition(int x, int y) {	//x, y의 합 메서드
		z = x + y;
		System.out.println("두 수의 덧셈: " + z);
	}
	
	public void subtraction(int x, int y) {	//x, y의 차 메서드
		z = x - y;
		System.out.println("두 수의 뺄셈: " + z);
	}
}
