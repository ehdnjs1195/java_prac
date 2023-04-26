package chap08;

public class Polymorphism01 {

	public static void main(String[] args) {
		CalculateSquare myArea = new CalculateSquare();
		//메서드를 사용하기 위해 객체를 생성하고 여러 형태로 메서드를 호출한다.
		System.out.println("가로:10, 세로:5 사각형의 넓이는 " + myArea.square(10, 5));
		System.out.println("가로:2.5 세로:4.5 사각형의 넓이는 " + myArea.square(2.5, 4.5));
	}

}
