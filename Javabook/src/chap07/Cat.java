package chap07;

public class Cat {

	String breed;
	String color;
	int age = 10;
	Cat(){	//기본생성자. 클래스 내에서 생성자를 정의하지 않아도 자동으로 생성함.
			//기본생성자는 다른 클래스에서 객체를 생성할 때 기본적으로 호출됨.
		System.out.println("Cat() 기본 생성자를 호출합니다.");
	}
	Cat(String pBreed){	//일반 생성자.
						//일반 생성자는 생략할 수 없고, 클래스의 멤버 변수를 초기화 하는데 사용됨.
		System.out.println("Cat(...) 일반 생성자 호출합니다.");
		breed = pBreed;
	}
	Cat(String pBreed, String pColor){//생성자 오버로딩
		System.out.println("Cat(..., ...) 생성자를 호출합니다.");
		breed = pBreed;
		color = pColor;
	}
	void eat() {
		System.out.println("먹이를 먹다.");
	}
	void scratch() {
		System.out.println("발톱으로 할퀴다");
	}
	void meow() {
		System.out.println("야옹 하고 울다");
	}

}
