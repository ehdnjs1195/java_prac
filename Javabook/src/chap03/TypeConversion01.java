package chap03;

public class TypeConversion01 {

	public static void main(String[] args) {
		int x = 10;
		double y = 3.0;
		//double이 int 보다 더 크므로 자동으로 형변환 되어 출력된다.
		System.out.println(x + y);	
		System.out.println(x - y);
		System.out.println(x * y);
		System.out.println(x / y);
	}

}
