package chap04;

public class Task4_8_while {

	public static void main(String[] args) {
		int i = 0;
		while (i < 10) {
			int j = 0;
			while (j < i + 1) {
				System.out.print('*');
				j++;
			}
			System.out.println();
			i++;
		}
	}

}
