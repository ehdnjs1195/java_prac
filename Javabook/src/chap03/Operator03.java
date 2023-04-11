package chap03;

public class Operator03 {

	public static void main(String[] args) {
		int a = 5, b = 10;

		System.out.println(a > b);	
		System.out.println(!(a > b));	//조건식의 반대 출력
		System.out.println((a == b) && (a == 5));//a,b가 같고, a가 5이면 참
		System.out.println((a != b) && (a == 5));//a,b가 다르고, a가 5면 참
		System.out.println(!(a != b) && (a == 5));//a,b가 다르고의 반대(a,b가 같고), a가 5이면 참
	}

}
