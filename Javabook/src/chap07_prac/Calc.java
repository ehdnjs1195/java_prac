package chap07_prac;

public class Calc { //계산을 도와주는 클래스
	public int sum(int a, int b) {//정수형 두개를 입력받아 덧셈으로 반환
		return a + b;
	}

	public int sum(int a, int b, int c) {//정수형 세개의 합을 반환
		return a + b + c;
	}

	public int sum(int a, int b, int c, int d) {//정수형 네개의 합을 반환
		return a + b + c + d;
	}

	public double sum(double a, double b) {//실수형 두개의 합을 반환
		return a + b;
	}
}
