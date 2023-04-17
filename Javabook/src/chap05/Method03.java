package chap05;

public class Method03 {
	public static int max (int x, int y) { // int x와 y를 매개변수로 받고
		int result ; 
		if(x > y) result  = x; // 두 수중 큰 수를 result로 저장하여
		else result = y ;
		
		return result; //반환해주는 함수
	}
	public static void main(String[] args) {
		int a = 5, b = 6;
		int num = max(a, b);	// a와 b중 큰 수를 반환하는 함수를 호출하여 num으로 반환받기.
		System.out.println(a + "(와)과" + b + " 둘 중 " + num + "이 큽니다."); //출력.
	}

}
