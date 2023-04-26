package com.section03;

import com.mypackage.*;

public class Package02 {

	public static void main(String[] args) {
		Dog dog01 = new Dog();
		Dog dog02 = new Dog();
		System.out.println(dog01.equals(dog02));	//서로 다른 객체이므로 false
		
		String str1 = dog01.bowwow();
		String str2 = dog02.bowwow();
		System.out.println(str1.equals(str2));		//서로 값이 같으므로 true
	}

}
