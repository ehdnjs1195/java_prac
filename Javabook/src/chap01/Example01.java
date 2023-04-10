package chap01;

public class Example01 {

	public static void main(String[] args) {
		int SPEED = 20;	//final은 값을 고정시킬 때 시킬 때 사용. 상수화
		int count = 10;
		SPEED = 40;
		count = 11;
		
		System.out.println("상수 SPEED 값은 ");
		System.out.println(SPEED);
		System.out.println("변수 count 값은 ");
		System.out.println(count);
		

	}

}
