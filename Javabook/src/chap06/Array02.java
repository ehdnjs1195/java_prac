package chap06;

public class Array02 {

	public static void main(String[] args) {
		//double 배열을 선언하고 동시에 초기화.
		double[] gradeArr = { 90, 70.5, 80, 79, 82.5, 50, 70, 90.2, 89.5, 89.7 };
		double sum = 0.0; //합계를 저장할 변수
		
		for(int i = 0 ; i < gradeArr.length; i++) {	//반복문을 돌면서 
			sum += gradeArr[i];	//sum 변수에 gradeArr각 인덱스값을 더해준다.
		}
		
		double average = sum / gradeArr.length;	//총 합계를 배열의 사이즈로 나누어 평균값을 구함.
		System.out.println("합계: "+sum);		//합계 출력
		System.out.printf("평균: %.2f" , average);	//평균값을 출력하는데 소수점 2자리까지.
	}

}
