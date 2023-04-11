package chap03;

public class Operator05 {

	public static void main(String[] args) {
		int a = 10, b = 10, c = 10, d = 10;

		System.out.println("a++ => " + (a++));	//a를 출력한 뒤 1 증가
		System.out.println("a => " + a);
		System.out.println("++b => " + (++b));	//b를 1 증가한 뒤 출력
		System.out.println("c-- => " + (c--));	//c를 출력한 뒤 1 감소
		System.out.println("--d => " + (--d));	//d를 1 감소한 뒤 출력
	}

}
