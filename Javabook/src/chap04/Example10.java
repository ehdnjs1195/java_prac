package chap04;

public class Example10 {

	public static void main(String[] args) {
		for (int i = 2; i <= 4; i++) {	//반복할 단수를 범위로 설정.
			System.out.println("구구단 " + i + "단");	//i단임을 알려주고,
			for (int j = 0; j <= 10; j++) { //i단을 0~10까지 곱할 범위
				System.out.println(i + " * " + j + " = " + (i * j)); //i단 출력.
			}
		}
	}

}
