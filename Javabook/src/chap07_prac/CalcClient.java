package chap07_prac;

public class CalcClient {

	public static void main(String[] args) {
		Calc c = new Calc();//계산 메서드가 있는 객체를 생성

		System.out.println("2개 덧셈이 호출됨: " + c.sum(1, 2)); //정수형 2개의 합
		System.out.println("3개 덧셈이 호출됨: " + c.sum(1, 2, 3));//정수형 3개의 합
		System.out.println("4개 덧셈이 호출됨: " + c.sum(1, 2, 3, 4));//정수형 4개의 합
		System.out.println("더블형 덧셈이 호출됨: " + c.sum(1.3, 2.4));//실수형 2개의 합

	}

}
