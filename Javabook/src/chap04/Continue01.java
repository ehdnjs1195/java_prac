package chap04;

public class Continue01 {

	public static void main(String[] args) {
		for (int i = 1; i <= 4; i++) { //i는 1~4까지 반복
			for (int j = 1; j <= 3; j++) { //j는 1~3까지 반복
				if (i == 3 && j == 2) // i가 3이고, j가 2일때만 출력을 생략하도록 함.
					continue;
				System.out.println(i + "*" + j); // 반복문이 돌면서 i와 j를 출력하도록.
			}
		}
	}

}
