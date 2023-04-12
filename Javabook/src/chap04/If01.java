package chap04;
import java.util.Scanner;
public class If01 {

	public static void main(String[] args) {
		System.out.println("당신의 나이를 입력하세요.");
		
		Scanner s = new Scanner(System.in);
		int age = s.nextInt();
		
		if(age>= 18) {	//입력받은 정수가 18보다 크거나 같으면 실행됨.
			System.out.println("당신의 나이는 18세 이상입니다.");
			System.out.println("당신은 투표할 자격이 있습니다.");
		}
		
		System.out.println("이 문장은 if문 외부에 있습니다.");	//if문 외부에 있으므로 항상 실행됨.
	}

}
