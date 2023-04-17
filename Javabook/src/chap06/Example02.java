package chap06;

public class Example02 {

	public static void main(String[] args) {
		int[] myArr = {10, 20, 30, 40, 50};	// int 배열 myArr를 선언하면서 동시에 초기화함.
		for(int i = 0; i < myArr.length; i++) {	//myArr 사이즈만큼 반복하면서
			System.out.println(i + "번째 요소값: " + myArr[i]); // 출력.
		}
	}

}
