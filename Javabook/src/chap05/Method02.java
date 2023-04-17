package chap05;

public class Method02 {
	public static int div() {	//두 숫자를 나누어 int 자료형으로 반환하는 메서드
		int a = 10, b = 5;
		int result = a / b;
		
		return result;	//결과값을 반환
	}
	public static void main(String[] args) {
		int num = div();	// 함수를 호출하여 나눈 결과값을 정수형을 반환하여 num변수에 저장
		System.out.println(num); // 출력.
	}

}
