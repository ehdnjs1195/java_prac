package chap08;

public class Child extends Parent{
	String name = "홍길동";
	
	public void details() {
		super.details();	//상위클래스 메서드 호출
		System.out.println(name);
	}
	
	public void printDetails() {
		details();
		System.out.println("부모 이름 : " + super.name);//상위클래스 변수
		System.out.println("자식 이름 : " + name);	//현재클래스 변수
	}
}
