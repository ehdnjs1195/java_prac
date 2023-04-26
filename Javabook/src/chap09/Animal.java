package chap09;

public abstract class Animal {
	public abstract void printSound(); //추상메서드는 중괄호(실행부) 없이 함수만 만들어 둠.
	
	public void dispayInfo() {
		System.out.println("나는 동물입니다.");
	}
}
