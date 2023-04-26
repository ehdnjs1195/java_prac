package chap09;

public class Example06 {

	public static void main(String[] args) {
		Baby myBaby = new Baby();
		//다중 상속받은 아기 객체를 생성하고 메서드 호출.
		myBaby.genderFather();
		myBaby.genderMother();
		myBaby.printInfo();
	}

}
