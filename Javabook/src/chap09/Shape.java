package chap09;

public abstract class Shape { //추상클래스
	String color;
	
	abstract double area();	//추상메서드
	//다른 모양의 생성자를 명시해줄 땐 기본생성자의 모양을 따로 정의해야 호출이 가능하다.
//	public Shape() {}; 
	public Shape(String color) { //파라미터를 받는 생성자 정의
		System.out.println("Shape 클래스 생성자 호출");
		this.color = color;
	}
	
	public String getColor() {return color;}	//변수를 가져오는 메서드
}
