package chap08;

public class Example01 {

	public static void main(String[] args) {
		BabyCat catObj = new BabyCat();	//ParentCat을 상속받은 BabyCat 객체 생성
		System.out.println("품종: " + catObj.breed);	//부모클래스에서 가져온 멤버변수
		System.out.println("색상: " + catObj.color);	//자식클래스에서 가져온 멤버변수
		
		catObj.eat();	//부모클래스의 메서드
		catObj.meow();	//자식클래스의 메서드
	}

}
