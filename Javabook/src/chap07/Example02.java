package chap07;

public class Example02 {

	public static void main(String[] args) {
		myMethod1();	//정적 메서드는 객체를 부를 필요 없이 바로 호출이 사용가능하다.
		//myMethode2();	//인스턴스 메서드는 객체가 필요함.
		Example02 myObj = new Example02(); //클래스 객체의 인스턴스 생성
		myObj.myMethod2();	//객체를 이용해 인스턴스 메서드 호출.
	}

	public static void myMethod1() {	//정적 메서드 생성
		System.out.println("정적 메서드 호출");
	}
	public void myMethod2() {	//인스턴스 메서드 생성
		System.out.println("인스턴스 메서드 호출");
	}
}
