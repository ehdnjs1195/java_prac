package chap04;
import java.util.Scanner;

public class If02 {

	public static void main(String[] args) {
		System.out.println("숫자를 입력하세요.");
		
		Scanner s = new Scanner(System.in);
		int num = s.nextInt();
		
		if(num % 2 == 0) {	//2로 나눈 나머지가 0이면 짝수이므로 짝수일 때만 실행.
			System.out.println(num + "은 짝수 입니다.");
		}
		else {	//그 외의 숫자는 홀수이므로 홀수일 때 실행.
			System.out.println(num + "은 홀수 입니다.");
		}
		
		System.out.println("이 문장은 if문 외부에 있습니다.");	
	}

}
