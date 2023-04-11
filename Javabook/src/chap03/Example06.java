package chap03;

public class Example06 {

	public static void main(String[] args) {
		int i = 100;
		long l = i;	//int가 long보다 작으므로 가능
		float f = l;//float이 long보다 크므로 가능

		System.out.println(i);
		System.out.println(l);
		System.out.println(f);//정수를 소수로 형변환되어 출력된다.
	}

}
