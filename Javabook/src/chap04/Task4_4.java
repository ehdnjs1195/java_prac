package chap04;

public class Task4_4 {

	public static void main(String[] args) {
		for(int i=0; i<5; i++) {
			System.out.println("기본 for문 5번 실행");
			for(int j=0; j<3; j++) {
				System.out.println("이중 for문은 상위for문마다 3번씩 실행");
			}
		}
	}

}
