package chap03;

public class Operator04 {

	public static void main(String[] args) {
		int a = 10, b = 20, c;
		System.out.println(c = a);	//c에 a를 할당
		System.out.println(b += a);	//b = b+a;
		System.out.println(b -= a);	//b = b-a;
		System.out.println(b *= a);	//b = b*a;
		System.out.println(b /= a);	//b = b/a;
		System.out.println(b %= a);	//b = b%a;	%는 나눗셈의 나머지.
		
	}

}
