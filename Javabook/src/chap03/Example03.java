package chap03;

public class Example03 {

	public static void main(String[] args) {
		int x = 10;
		System.out.println(x < 10 && x < 20);	//x가 10보다 작고, 20보다 작으면 참(둘다 참이어야 참)
		System.out.println(x < 10 || x < 20);	//x가 10보다 작거나 20보다 작으면 참(둘중 하나 참이면 참)
		System.out.println(!(x < 10 && x < 20));//첫번째 조건 논리결과의 반대값.(true 면 false)
	}
}
