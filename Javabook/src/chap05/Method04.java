package chap05;

public class Method04 {
	public static void sum() {	//메서드가 호출되면
		int sum = 0;	
		for(int i = 0; i <= 10; i++) {	//0부터 10까지 반복하면서
			sum += i; //sum 변수에 합하여
		}
		System.out.println(sum); // 출력한다.
	}
	public static void main(String[] args) {
		System.out.print("1부터 10의 합계: ");
		sum();	//1부터10까지 합하여 출력하는 함수.
	}

}
