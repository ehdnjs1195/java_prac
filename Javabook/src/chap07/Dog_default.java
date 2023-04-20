package chap07;

public class Dog_default {
	//접근제한자를 선언하지 않으면 default 접근제한자가 된다.
	//default는 같은 패키지 내에 있을 때만 접근이 가능하다.
	
	String breed;
	String color;
	
	void bowwow() {
		System.out.println("왈왈");
	}
	
	void run() {
		System.out.println("헥헥..");
	}
	
	void sleep() {
		System.out.println("드르렁...zZ");
	}
}
