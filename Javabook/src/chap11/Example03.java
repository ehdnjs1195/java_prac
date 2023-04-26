package chap11;

public class Example03 {
	public static void main(String[] args) {
		int a[] = new int[2];
		try {
			System.out.println("잘못된 요소에 접근: " + a[3]);
		} catch (Exception e) { //예외가 발생하면 실행됨
			//ArrayIndexOutOfBoundException이 발생하게 되고 그 이유가 출력됨.
			System.out.println("예외발생 ArrayIndexOutOfBoundException " + e);
		} finally { //항상 실행되는 문장
			System.out.println("finally는 항상 실행됩니다.");
		}
	}
}
