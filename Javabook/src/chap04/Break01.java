package chap04;

public class Break01 {

	public static void main(String[] args) {
		for (int i = 0; i < 10; i++) { //10번 반복하는 반복문.
			if (i == 5) //i가 5이면 반복문이 종료되도록 함.
				break;
			System.out.println("i: " + i); //반복문 실행 횟수를 알 수 있도록 i를 출력.
		}
	}

}
