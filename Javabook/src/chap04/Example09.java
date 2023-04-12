package chap04;

public class Example09 {

	public static void main(String[] args) {
		int i = 1;
		do {	//일단 한번 실행함.
			System.out.println("Hello world!");
			i++;	//반복문을 빠져나갈 수 있도록 해주는 장치.
		} while (i < 6); // i값이 6보다 작으면 반복문 탈출.
	}

}
