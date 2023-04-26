package chap09;

public class Interface02 {

	public static void main(String[] args) {
		Chicken myck = new Chicken();
		Bird myb = new Bird();
		//닭과 새의 객체를 생성하여 각 가지고 있는 메서드를 호출함.
		myck.fly();
		myck.walk();
		myb.fly();
	}

}
