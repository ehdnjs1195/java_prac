package chap08;

public class Child2 extends Parent2 {
	String name = "홍길동";

	public Child2() {
		//상위클래스의 생성자를 호출해줘야 한다.
		//기본 생성자는 생략이 가능하기 때문에 안써줘도 된다.
		super(); // =>생략가능
		System.out.println("자식이름 : " + name);
	}

}
