package chap11;

public class Example01 {

	public static void main(String[] args) {
		try {
			//try문에서 에러가 발생하면 catch문이 실행된다.
			int a = 0;
			int b = 5 / a;	//수는 0으로 나눌 수 없으므로 에러 발생.
		}
		catch(ArithmeticException e) {	//ArithmeticException 에러가 나면 실행.
			System.out.println("0으로 나눕니다.");
//			e.printStackTrace();	
		}
		System.out.println("try ~ catch문의 외부 문장입니다.");
	}

}
