package chap08;

class Calculate {
	//같은 이름으로 여러 형태의 메서드를 작성할 수 있다.
	//메서드 오버로딩.
	public int add(int num1, int num2) {
		return num2 + num2;
	}
	
	public double add(double n1, double n2) {
		return n1 + n2;
	}
}

public class Example07 {
	public static void main(String[] args) {
		int a = 5;
		int b = 4;
		double c = 11.12;
		double d = 21.34;
		Calculate obj = new Calculate();
		System.out.println(obj.add(c, d));
		System.out.println(obj.add(a, b));
	}
}
