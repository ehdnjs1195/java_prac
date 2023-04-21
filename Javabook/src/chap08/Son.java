package chap08;

public class Son extends Father {
	String name = "홍길동";

	void printDetails() {
		System.out.println("나의 이름은 " + this.name);	//this는 자기 자신 클래스를 가리키는 지시어.
		System.out.println("나의 아버지는 " + this.familyName);
		System.out.println("나의 집은 " + this.houseAddress);
	}
}
