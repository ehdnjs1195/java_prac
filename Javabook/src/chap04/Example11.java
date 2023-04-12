package chap04;

public class Example11 {

	public static void main(String[] args) {
		for (int n = 1; n <= 5; n++) {	//n이 5번 반복하는 동안 *을 출력하도록 하는 반복문.
			System.out.println("*");
			if (n == 2) { //n이 2이면 break되어 반복문을 탈출함.
				break;
			}
		}
	}

}
