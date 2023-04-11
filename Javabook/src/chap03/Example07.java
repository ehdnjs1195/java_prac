package chap03;

public class Example07 {

	public static void main(String[] args) {
		double d = 3.14;
		long l = (long) d;	//double을 long으로 캐스팅
		int i = (int) l;	//long을 int로 캐스팅
		System.out.println(d);
		System.out.println(l);//소수를 정수형으로 형변환 하였기 때문에 소수점 밑은 사라진다.
		System.out.println(i);
	}

}
