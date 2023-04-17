package chap05;

public class Task5_4 {
	public static void star() {//별을 순서대로 하나씩 늘려가며 출력하는 메서드
		for (int i = 0; i < 10; i++) {	
			for (int j = 0; j < i + 1; j++) {
				System.out.print("*");	
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		star();	//별을 찍어주는 함수 호출
	}

}
