package chap07;

public class Add {
	
	Add(){	//기본생성자
		System.out.println("기본 생성자 Add() 호출");
	}
	
	Add(int a, int b){//정수 두개를 입력받는 생성자
		System.out.println("일반 생성자 Add(int a, int b) 호출");
		System.out.println(a + " + " + b + " = " + (a + b));
	}
	
	Add(double a, double b){ // 실수 두개를 입력받는 생성자
		System.out.println("일반 생성자 Add(bouble a, bouble b) 호출");
		System.out.println(a + " + " + b + " = " + (a + b));
	}
	
	Add(int a, double b){	//정수와 실수를 입력받는 생성자
		System.out.println("일반 생성자 Add(int a, double b) 호출");
		System.out.println(a + " + " + b + " = " + (a + b));
	}
	
	

}
