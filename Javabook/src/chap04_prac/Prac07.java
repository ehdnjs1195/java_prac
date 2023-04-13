package chap04_prac;

import java.util.Scanner;

public class Prac07 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("첫번째 숫자를 입력하세요: ");
		int a = s.nextInt();
		
		System.out.print("사칙연산 기호를 입력하세요: ");
		String op = s.next();
		
		System.out.print("두번째 숫자를 입력하세요:");
		int b = s.nextInt();
		int result = 0;
		if(op.equals("+")) result = a + b;
		else if(op.equals("-")) result = a - b ;
		else if(op.equals("*")) result = a * b ;
		else if(op.equals("/")) result = a / b ;
		else if(op.equals("%")) result = a % b ;
		System.out.println(a + op + b + "=" + result);
	}

}
