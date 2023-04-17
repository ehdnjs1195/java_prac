package chap06;

public class Example01 {

	public static void main(String[] args) {
		int[] myArr = new int[5];	// int형 크기 5짜리 배열을 선언함.  
		myArr[0] = 10; //0번째 인덱스 초기화
		myArr[1] = 20; //1번째 인덱스 초기화
		myArr[2] = 30; //2번째 인덱스 초기화
		myArr[3] = 40; //3번째 인덱스 초기화
		myArr[4] = 50; //4번째 인덱스 초기화
		for (int i = 0; i < myArr.length; i++) { // for문을 돌면서 배열값 출력. myArr의 길이만큼 반복.
			System.out.println(i + "번째 요소값: " + myArr[i]);
		}
	}

}
