package chap03;

public class Task3_10 {

	public static void main(String[] args) {
		int x = 2;
		int y = 5;
		char c = 'A';

		System.out.println(1 + x < 33);	//true
		System.out.println(y >= 5 || x < 0 && x > 2); //true
		System.out.println(y += 10 - x++); // 13
		System.out.println(!('A' <= c && c <= 'Z')); //false
		System.out.println('C' - c); // 2
		System.out.println(c + 1); // 66
		System.out.println(c++); // A
		System.out.println(c); // B
		System.out.println(++c); // C

	}

}
