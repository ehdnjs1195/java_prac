package chap07;

public class Dog {	
	//public 접근제한자로 변수를 선언하였다. 어디서나 접근가능
	public String breed;
	public String color;
	//protected로 변수 선언. 같은 패키지 내에서 사용 가능
	protected int age;
	//private으로 변수 선언. 같은 클래스 내에서만 사용 가능
	private String name;
	
	//public 접근제한자로 메서드를 선언함. 어디서나 접근 가능
	public void bowwow() {
		System.out.println("멍멍 짖다");
	}
	
	//protected 접근제한자로 메서드 선언.
	//같은 패키지이면 클래스로 접근 가능, 다른 클래스이면 하위 클래스일 때만 접근 가능.
	protected void run() {
		System.out.println("달리다!");
	}
	
	//private 접근제한자로 메서드 선언
	//같은 클래스에서만 사용이 가능하다. 외부 모든 클래스에서 차단.
	private void sleep() {
		System.out.println("잠을 자다");
	}
}
