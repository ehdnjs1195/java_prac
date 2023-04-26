package chap11;

public class Example02 {

	public static void main(String[] args) {
		try {
			Integer in = new Integer("abc");
			in.intValue();
		} catch (ArithmeticException e) {	//ArithmeticException 에러가 발생하면 실행
			System.out.println("예외 발생 ArithmeticException " + e);
		} catch (NumberFormatException e) {	//NumberFormatException 에러가 발생하면 실행됨
			System.out.println("예외 발생 NumberFormatException " + e);
		}
		System.out.println("try ~ catch문의 외부 문장입니다.");	//에러가 발생해도 실행된다.
	}

}
