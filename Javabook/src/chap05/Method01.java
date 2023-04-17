package chap05;

public class Method01 {
	public static void method() {	//함수를 선언.
		System.out.println("static 메서드 입니다.");
		System.out.println(5+6);
	}
	
	public static void main(String[] args) {
		System.out.println("첫 번째 호출 메서드입니다.");
		method();	// 함수 호출
		
		System.out.println("두 번째 호출 메서드입니다.");
		method();	// 함수 호출
	}

}
