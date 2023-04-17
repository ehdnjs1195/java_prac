package chap05;

public class Example01 {

	public static void main(String[] args) {
		method();	//메서드를 호출.
	}

	public static void method() { //반환 유형이 없는 메서드
		System.out.println("Static 메서드 입니다.");//출력되는 문자열
		System.out.println(5 + 6);
	}

}
