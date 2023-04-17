package chap05;

public class Example02 {
	public static String greeting() {	//String 자료형을 반환유형으로 지정함.
		return "HI";	//함수가 호출되면 "HI"문자열이 리턴됨.
	}
	public static void main(String[] args) {
		String str = greeting();	//함수를 호출하여 리턴되는 문자열을 변수 str에 저장.
		System.out.println(str + " JAVA");	//출력.
	}

}
