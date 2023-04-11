package chap03;

public class Example01 {

	public static void main(String[] args) {
		int a = 10;
		int b = 20;
		//주의점) 앞에서 문자열로 출력하기 위해 따옴표를 써 주었기 때문에 괄호로 묶어주지 않으면 a와 b가 각각 문자열로 순서대로 출력된다.
		System.out.println("a + b = " + (a + b));
		System.out.println("a - b = " + (a - b));
		System.out.println("a * b = " + (a * b));
		System.out.println("a / b = " + (a / b));
		System.out.println("a % b = " + (a % b));
	}
}
