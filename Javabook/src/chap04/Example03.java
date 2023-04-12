package chap04;

public class Example03 {

	public static void main(String[] args) {
		int num = 20;
		
		if(num == 10) {	//숫자가 10이면 실행
			System.out.println("숫자가 10입니다.");
		}
		else if(num == 15) { //숫자가 15면 실행
			System.out.println("숫자가 15입니다.");
		}
		else if(num == 20) { //숫자가 20이면 실행
			System.out.println("숫자가 20입니다.");
		}
		else {	//위의 조건에 모두 만족하지 않으면 실행.
			System.out.println("숫자가 존재하지 않습니다.");
		}
	}

}
