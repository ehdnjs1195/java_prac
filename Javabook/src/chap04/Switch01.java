package chap04;
import java.util.Scanner;
public class Switch01 {

	public static void main(String[] args) {
		System.out.println("점수를 입력하세요.");
		Scanner s = new Scanner(System.in);
		int num = s.nextInt();
		
		switch(num/10) {	//입력받은 점수를 10으로 나눠서 몫으로 학점을 매김.
			case 10: //10이면 break가 없기 때문에 case 9으로 넘어가게 됨.
			case 9:	//9 또는 10이면 실행
				System.out.println("A학점");
				break;//switch문 빠져나가기
			case 8: //8이면 실행
				System.out.println("B학점");
				break;
			case 7: //7이면 실행
				System.out.println("C학점");
				break;
			case 6: //6이면 실행
				System.out.println("D학점");
				break;
			default: //해당되는 케이스가 없으면 실행
				System.out.println("F학점");
				break;
		}
	}

}
