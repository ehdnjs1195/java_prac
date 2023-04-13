package chap04;

public class Task4_9 {

	public static void main(String[] args) {
		int sum = 0;
		for (int i = 0; i < 10; i++) {
			sum = sum + i;
		}
		System.out.println("sum: " + sum);

		for (int i = 1; i < 10; i++) {
			System.out.println("**********");
			System.out.println("구구단 " + i + "단");
			System.out.println("**********");
			for (int j = 0; j < 10; j++) {
				System.out.println(i + " * " + j + " = " + i * j);
			}
			
		}
	}

}
