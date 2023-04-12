package chap04;

public class Task4_4_3 {

	public static void main(String[] args) {
		for (int i = 0; i < 10; i++) { //i가 0부터 9까지 10번 반복.
			if(i == 3) continue;	//i가 3일때는 출력되지 않고 건너뛰도록.
			System.out.println(i + "번째 실행되었습니다.");
			if(i == 7) break;	//i가 7이면 반복문을 종료하도록.
		}
	}

}
