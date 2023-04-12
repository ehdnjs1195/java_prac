package chap04;

public class Task4_8_for {

	public static void main(String[] args) {
		for (int i = 0; i < 10; i++) {
			for (int j = 0; j < i + 1; j++) {
				System.out.print('*');
			}
			System.out.println();
		}
	}

}
