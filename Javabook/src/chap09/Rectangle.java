package chap09;

public class Rectangle extends Shape{ //추상클래스를 상속받는 일반클래스
	double length;
	double width;
	
	public Rectangle(String color, double length, double width) {
		super(color); //상위클래스를 호출함.
		System.out.println("Rectangle 클래스 생성자 호출");
		this.length = length;
		this.width = width;
	}

	@Override
	double area() { //추상메서드 오버라이딩.
		return length * width;
	}
	
	public String toString() {
		return "사각형 색상은 "	+ super.getColor() + " 그리고 면적은 : " +area();
	}
}
