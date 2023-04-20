package chap07;

public class AccessModifier {

	public static void main(String[] args) {
		//멤버, 메서드가 접근제한자가 default인 객체
		//같은 패키지이면 접근이 가능하다.
		Dog_default dog = new Dog_default();
		dog.breed = "포메라니언";
		dog.color = "갈색";

		System.out.println("강아지 품종: " + dog.breed);
		System.out.println("강아지 색상: " + dog.color);
		dog.bowwow();
	}

}
