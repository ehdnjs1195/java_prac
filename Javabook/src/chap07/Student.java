package chap07;

public class Student {
	int id;	
	String name;
	
	Student(){	//기본생성자 => new 생성자() 를 할 때 바로 호출됨.
		System.out.println("기본 생성자 Student() 호출");
	}
	
	Student(int parm1, String parm2){ //일반 생성자
		System.out.println("일반 생성자 Student(...) 호출");
		id = parm1;
		name = parm2;
	}
	
	void insertRecord(int parm1, String parm2) { //파라미터를 받아와서
		id = parm1;	//id 변수에 입력
		name = parm2; // name에 입력
	}
	
	void printInfo() {	//정보를 출력하는 메서드
		System.out.println("아이디: " + id);
		System.out.println("이름: " + name);
	}
}
