package chap08;
//Cat을 상속 받음.
public class Kitten extends Cat{
	void meow2() {
		System.out.println("새끼 고양이가 야옹하고 울다");
	}
	
	@Override
	public void sound() { //상위클래스의 메서드 재정의 => 오버라이딩
		System.out.println("새끼고양이는 야아아옹~먀옹 하고 웁니다!");

	}
}
