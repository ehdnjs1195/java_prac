package chap07;

public class AccessModifier03 {

	public static void main(String[] args) {
		Dog dog = new Dog(); //Dog 클래스의 객체 생성
		
		dog.breed = "포메라니언"; 
		dog.color = "갈색";	
		
		System.out.println("강아지 품종: " + dog.breed);
		System.out.println("강아지 색상: " + dog.color);
		dog.bowwow(); 
		dog.age = 10; 
		System.out.println("강아지 나이:" + dog.age);
		dog.run();
		
		//private으로 선언된 변수, 메서드는 다른 클래스에서 사용할 수 없다.
//		dog.name = "다운";
//		System.out.println("강아지 이름: " + dog.name);
//		dog.sleep();
		
	}

}
