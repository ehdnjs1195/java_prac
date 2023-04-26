package chap09;

public class Baby implements Papa, Mama {
	//엄마, 아빠 인터페이스를 다중 상속 받은 아기는
	//상속 받은 모든 메서드를 재정의 하여야 한다.
	@Override
	public void genderMother() {
		System.out.println("나는 어머니입니다.");
	}

	@Override
	public void genderFather() {
		System.out.println("나는 아버지입니다.");
	}

	public void printInfo() {
		System.out.println("나는 아가");
	}

}
