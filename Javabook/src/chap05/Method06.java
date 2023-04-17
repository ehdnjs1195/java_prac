package chap05;

public class Method06 {
	//각 형태의 자료형을 합하는 메서드 오버로딩.
	public static int sum(int x, int y) { // 두 정수의 합을 리턴
		return (x + y);
	}
	public static int sum(int x, int y, int z) { // 세 정수의 합을 리턴
		return (x + y + z);
	}
	public static double sum(double x, double y) { // 두 실수의 합을 리턴
		return (x + y);
	}

	public static void main(String[] args) {
		//각 메서드를 형태별로 호출하여 반환값을 출력함.
		System.out.println("sum(10, 20)의 값 : "+ sum(10, 20));
		System.out.println("sum(10, 20, 30)의 값 : "+ sum(10, 20, 30));
		System.out.println("sum(10.5, 20.5)의 값 : "+ sum(10.5, 20.5));
	}

}
