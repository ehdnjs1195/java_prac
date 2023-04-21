package chap08;

public class BabyCat extends ParentCat{ //ParentCat 클래스를 상속하여 BabyCat은 자식 클래스가 됨.
	public String color = "초콜릿색";	//멤버변수
	void meow() {	//멤버 메서드
		System.out.println("야옹~~");
	}
}
