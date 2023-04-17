package chap06;

public class Array06 {

	public static void main(String[] args) {
		String s = " Java Programming ";
		String s1 = "Java";
		String s2 = " Programming";
		String s3 = s1.concat(s2); //s1끝에 s2를 이어붙여주는 함수
		String s4 = s.trim();	//양 끝의 스페이스 공백을 지워주는 함수. 
		
		System.out.println("s3 " + s3);
		System.out.println("s4 " + s4);
		System.out.println("s3.equals(s4) " + s3.equals(s4)); //s3와 s4의 값이 같은지 비교.
		//같으면 true를 반환함.
	}

}
