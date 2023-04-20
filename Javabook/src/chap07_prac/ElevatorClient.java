package chap07_prac;

public class ElevatorClient {
	private static int inVal;	//private static 변수 선언

	public static void up() {	//static 메서드 선언
		inVal++;
		System.out.println("그냥 메서드" + inVal);
	}

	public static void main(String[] args) {
		inVal = 0;	//private 변수는 같은 클래스 내에서만 사용 가능.
		Elevator elev = new Elevator(); //엘리베이터 객체 생성
		

		up();	//static 함수는 객체 없이도 사용할 수 있다.
		for (int i = 0; i < 10; i++) {
			elev.up();	//엘레베이터를 상승
			System.out.println("MSG: " + elev.help);
		}
		System.out.println();
		for (int i = 0; i < 10; i++) {
			elev.down(); //엘레베이터 하강
			System.out.println("MSG: " + elev.help);
		}
	}

}
