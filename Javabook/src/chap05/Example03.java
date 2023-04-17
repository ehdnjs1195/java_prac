package chap05;

public class Example03 {
	public static int add(int x, int y) { // 매개변수로 int x,y를 받아서
		return x + y; // 두 정수의 합을 리턴하는 함수
	}

	public static void main(String[] args) {
		int a = 5, b = 6; 
		int sum = add(a, b); //add 메서드를 호출하여 a, b를 넘겨주어 합을 반환고 저장한다.
		System.out.println(a + "(와)과" + b + "의 합은 " + sum + "입니다."); //출력.
	}

}
