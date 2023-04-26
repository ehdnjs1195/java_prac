package chap08;

public class Son extends Father { //Father를 상속받음
	String name = "홍길동";

	void printDetails() { //정보를 출력하는 메서드.
		//this는 자기 자신 클래스를 가리키는 지시어.
		//Father를 상속받았기 때문에 상위클래스의 변수를 사용할 수 있다.
		System.out.println("나의 이름은 " + this.name);	
		System.out.println("나의 아버지는 " + this.familyName);
		System.out.println("나의 집은 " + this.houseAddress);
	}
}
