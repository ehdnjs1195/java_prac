package chap06;

public class Example06 {

	public static void main(String[] args) {
		String s = " Java Programming ";
		System.out.println("s.length() : " + s.length());	//문자열 길이
		System.out.println("s.charAt(1) : " + s.charAt(1));	//인덱스 1의 문자
		System.out.println("s.substring(6) : " + s.substring(6)); // 6 <= index 잘라내기
		System.out.println("s.substring(5, 13) : "+s.substring(5, 13)); // 5 <= index <13 잘라내기
		System.out.println("s.indexOf('P') : " + s.indexOf('P')); //문자 P의 처음 인덱스 번호반환
		System.out.println("s.toLowerCase() : " + s.toLowerCase()); //소문자로 변환
		System.out.println("s.toUpperCase() : " + s.toUpperCase()); //대문자로 변환
	}

}
