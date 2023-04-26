package chap09;

public class Circle extends Shape{	//추상클래스를 상속받는 일반 클래스
	double radius;
	
	public Circle(String color, double radius) { //생성자를 정의하고
		super(color);	//상위클래스 생성자 호출.(반드시 필요한 과정)
		System.out.println("Circle 클래스 생성자 호출");
		this.radius = radius;
	}
	
	@Override
	double area() { //추상메서드 오버라이딩하기. 재정의.
		return radius * radius* 3.14;
	}
	
	public String toString() {
		return "원 색상은 " + super.getColor() + " 그리고 면적은 : " + area();
	}
}
