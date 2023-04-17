package chap06;

public class Example07 {

	public static void main(String[] args) {
		//"Java"로 쓰면 스트링 풀로 올라간다.
		// => 값이 이미 저장되어 있는 것을 참조하는 것.
		String s1 = "Java";
		String s2 = "Java";
		String s3 = "java";
		
		System.out.println(s1 == s2);	//이미 저장되어있는 "값"을 비교하는 것이므로 true
		System.out.println(s1 != s2);
		
		System.out.println(s2 == s3);	//값이 다르므로 false가 나온다.
		System.out.println(s2 != s3);
		String s4 = s2 + s3;	// String은 덧셈 연산을 하면 이어붙여지게 된다.
		System.out.println(s4);
		
	}

}
