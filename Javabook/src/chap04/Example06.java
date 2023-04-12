package chap04;

public class Example06 {

	public static void main(String[] args) {
		char grade = 'B';
		switch(grade) {	//조건문으로 grade를 받고
			case 'A':	//grade가 A이면 실행
				System.out.println("매우 우수");
				break;	//실행하고나면 break문으로 switch문 빠져나가기. 
			case 'B':	//grade가 B이면 실행
				System.out.println("우수");
				break;
			case 'C':	//grade가 C이면 실행
				System.out.println("좋음");
				break;
			case 'D':	//grade가 D이면 실행
				System.out.println("좀 더 열심히");
				break;
			case 'F':	//grade가 F이면 실행
				System.out.println("미흡");
				break;
			default:	// 어느 case에도 해당하지 않으면 항상 실행되는 문장.	
				System.out.println("잘못된 등급");
		}
	}

}
