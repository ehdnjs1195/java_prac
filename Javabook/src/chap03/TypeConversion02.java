package chap03;

public class TypeConversion02 {

	public static void main(String[] args) {
		int x = 10;
		double y = 3.0;

		System.out.println(x / y);	//소수로 형변환되어 출력됨.
		System.out.println(x / (int) y);//소수를 정수형을 캐스팅하여 정수로 출력됨.
		System.out.println((int) (x / y));//소수형으로 계산된 결과를 정수형으로 캐스팅하여 정수로 출력됨.
	}

}
