package chap07;

public class Example03 {
	public static void main(String args[]) {
		Cat catObj = new Cat();	//Cat 클래스의 인스턴스 생성
		System.out.println("페르시안 고양이");
		catObj.meow();	//Cat클래스의 객체를 이용하여 meow 메서드 호출. 
	}
}
