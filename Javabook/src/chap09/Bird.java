package chap09;

public class Bird implements Fly {
	//나는 기능을 상속받아 재정의 함.
	@Override
	public void fly() {
		System.out.println("새는 날 수 있다.");
	}
}
