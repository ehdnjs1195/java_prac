package chap04_prac;

public class Prac04 {

	public static void main(String[] args) {
		for (int i = 1; i <= 3; i++) {
			System.out.print("**********\t");
			System.out.print("**********\t");
			System.out.print("**********\t");
			System.out.println();

			for (int j = 0; j < 3; j++) {
				System.out.print("구구단 " + (i + j * 3) + " 단 \t");
			}
			System.out.println();
			System.out.print("**********\t");
			System.out.print("**********\t");
			System.out.print("**********\t");
			System.out.println();

			for (int k = 1; k < 10; k++) {
				for (int j = 0; j < 3; j++) {
					System.out.print((i + j * 3) + " * " + k + " = " + (i + j * 3) * k + "\t");
				}
				System.out.println();

			}

			System.out.println();

		}
	}

}
