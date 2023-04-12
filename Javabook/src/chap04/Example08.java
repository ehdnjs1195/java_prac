package chap04;

public class Example08 {

	public static void main(String[] args) {
		int i = 1;
		while (i <= 10) {	//i가 10보다 작을 때 까지 실행.
			System.out.println(i + " ");
			i++;	//i값을 하나씩 증가. 이 문장이 없으면 무한 반복문으로 빠지게 됨.(주의)
		}
	}

}
