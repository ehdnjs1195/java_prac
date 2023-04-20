package chap07;

public class Example01 {

	public static void main(String[] args) {
		Cat catObj = new Cat();	// Cat 클래스 객체 인스턴스 선언.
		catObj.breed = "페르시안 고양이";	//Cat클래스의 breed 변수에 접근하여 초기화
		catObj.color = "흰색";			//Cat클래스의 color 변수에 접근하여 초기화
		System.out.println("품종: " + catObj.breed); // breed 출력
		System.out.println("색상: " + catObj.color);	// color 출력
		
	}

}
