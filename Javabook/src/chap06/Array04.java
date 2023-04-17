package chap06;

public class Array04 {

	public static void main(String[] args) {
		int rows = 2, columns = 3;
		// 2차원 배열 두개를 선언과 동시에 초기화
		int[][] firstMatrix = { { 2, 3, 4 }, { 3, 2, 1 } };	
		int[][] secondMatrix = { { 1, 2, 3 }, { -4, -2, 1 } };

		int[][] sum = new int[rows][columns];	//두 행렬의 합을 저장할 2차원 배열
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < columns; j++) {	//2중 for문을 돌면서
				sum[i][j] = firstMatrix[i][j] + secondMatrix[i][j]; //각 요소의 합을 저장.
			}
		}
		
		System.out.println("두 행렬의 합: ");
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < columns ; j++) {	//2중 for문을 돌면서
				System.out.println(sum[i][j] + " "); //각 요소의 합을 출력.
			}
			System.out.println();
		}
	}

}
