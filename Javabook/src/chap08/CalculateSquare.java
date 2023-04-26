package chap08;

public class CalculateSquare {
	//동일한 이름을 정의된
	//여러형태의 메서드. => 메서드 오버로딩
	public void sqare() {
		System.out.println("No Parameter Method Called");
	}

	public int square(int width, int height) {
		int area = width * height;
		return area;
	}

	public double square(double width, double height) {
		double area = width * height;
		return area;
	}

	public double square(int width, double height) {
		double area = width * height;
		return area;
	}
}
