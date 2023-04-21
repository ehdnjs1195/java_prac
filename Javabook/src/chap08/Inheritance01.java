package chap08;

public class Inheritance01 extends Calculation{
	public void multiplication(int x, int y) { //두 수의 곱 메서드
		z = x * y;	//z는 상속받은 Calculation의 멤버변수이므로 선언 없이 사용할 수 있다.
		System.out.println("두 수의 곱셈: " + z);
	}
	public static void main(String[] args) {
		int a = 20, b = 10;
		Inheritance01 obj = new Inheritance01();
		obj.addition(a, b);	//부모 클래스의 메서드
		obj.subtraction(a, b);	//부모 클래스의 메서드
		obj.multiplication(a, b); //자식 클래스의 메서드
	}

}
