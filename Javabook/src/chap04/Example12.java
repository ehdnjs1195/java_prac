package chap04;

public class Example12 {

	public static void main(String[] args) {
		for (int i = 0; i <= 10; i++) { //10번 반복하는 동안
			if (i == 3 || i == 6 || i == 9) { //i가 3, 6, 9 이면
				continue; // 아래 문장을 실행하지 않고 건너뛰도록 continue를 실행한다.
			}
			System.out.print(i + " "); //i를 출력.
		}
	}

}
