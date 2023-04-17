package chap05;

public class Example05 {
	public static void add(int x, int y) {	//int x와 y를 받아서
		System.out.println(x + "(와)과" + y + "의 합은 " + (x + y) + "입니다."); //출력.
	}
	public static void main(String[] args) {
		int a = 5, b = 6;
		add(a, b); // int a와 b를 매개변수로 전달하여 함수 호출.
	}

}
