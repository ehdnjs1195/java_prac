package chap08;

public class SubKitten extends SuperCat {
	String age = "2살";

	void printInfo() {
		System.out.println("아기 고양이 입니다.");
	}

//	String breed = "자식고양이";	breed를 새로 선언하고 this.breed를 사용해주면 '자식고양이'가 나옴 

	void printDetail() {
		super.printInfo();
		System.out.println("품종은 " + super.breed + breed + ", 나이는 " + super.age);
		printInfo();
		System.out.println("품종은 " + breed + ",나이는 " + age);
		System.out.println("아기고양이는 " + this.breed + ",나이는 " + this.age);
	}
}
