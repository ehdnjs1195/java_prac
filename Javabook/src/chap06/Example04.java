package chap06;

public class Example04 {

	public static void main(String[] args) {
		int myArr[][] = { { 1, 2, 3, 4, 5 }, 	//myArr 2차원배열 선언과 동시에 초기화
				{ 6, 7, 8, 9, 10 }, 
				{ 11, 12, 13, 14, 15 } };
		
		for(int i= 0; i<3; i++) {
			for(int j = 0; j < 5; j++) {	//2중 for문을 돌면서 
				System.out.print(myArr[i][j] + " ");	//2차원 배열 출력하기.
			}
			System.out.println();
		}
		System.out.println("myArr[0][1]값: " + myArr[0][1]);	 //myArr의 [0][1]번째 요소 출력.
	}

}
