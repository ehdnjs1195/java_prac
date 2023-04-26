package chap08;

public class SuperCat2 {
	String name;
	String age = "15살";
	SuperCat2(String s){ //생성자 정의.
		name = s;
		System.out.println("부모고양이입니다. 이름은 " + name);
	}
}
