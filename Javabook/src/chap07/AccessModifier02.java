package chap07;

public class AccessModifier02 {

	public static void main(String[] args) {
		Dog dog = new Dog(); //Dog 클래스의 객체 생성
		
		dog.breed = "포메라니언"; //breed는 public 접근제한자이기 때문에 접근이 가능하므로 값 초기화.
		dog.color = "갈색";	//color값 초기화
		
		System.out.println("강아지 품종: " + dog.breed);
		System.out.println("강아지 색상: " + dog.color);
		
		dog.bowwow(); //public 메서드이기 때문에 어디서나 접근 가능
		dog.age = 10; //protected로 선언된 변수이기 때문에 같은 패키지이면 사용 가능.
		
		System.out.println("강아지 나이:" + dog.age);
		dog.run();//protected로 선언된 메서드. 같은 패키지면 사용 가능.
	}

}
