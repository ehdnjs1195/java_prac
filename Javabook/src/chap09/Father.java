package chap09;

public class Father implements Parent{

	@Override
	public void printInfo() { //인터페이스를 상속받았으므로 반드시 오버라이딩.
		System.out.println("아버지 입니다.");
	}
}
