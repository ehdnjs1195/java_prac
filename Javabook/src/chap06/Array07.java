package chap06;

public class Array07 {

	public static void main(String[] args) {
		//new 연산자로 생성하게 되면 히프 영역으로 올라가게 된다.
		//새로운 객체를 생성하게 되는 것.(히프영역에 새로운 영역으로 올라감)
		String s1 = new String("Java");	
		String s2 = new String("Java");
		String s3 = s1;
		
		//s1과 s2는 서로 다른 객체이므로 객체를 비교할 땐 s1, s2는 다르다.
		if (s1 == s2) System.out.println("s1과 s2는 같다");
		else System.out.println("s1과 s2는 같지 않다");
		
		//s3에 s1의 객체를 복사해 담아주었기 때문에 둘은 같다.
		if (s1 == s3) System.out.println("s1과 s3는 같다");
		else System.out.println("s1과 s3는 같지 않다");
		
		//equals는 값을 비교하는 메서드 이므로 s1과 s2의 값은 서로 같다.
		if (s1.equals(s2)) System.out.println("s1과 s2의 값은 같다");
		else System.out.println("s1과 s2의 값은 같지 않다");
	}

}
