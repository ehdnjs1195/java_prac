package chap06;

public class Task6_6 {

	public static void main(String[] args) {
		int[] idays = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };

		for (int i = 1; i < 13; i++) {
			System.out.print(i + "월 => ");

			for (int j = 0; j < 32; j++) {
				System.out.print(j);
				if(idays[i - 1] == j) break;
				System.out.print(",");
			}
			System.out.println();
		}
	}

}
