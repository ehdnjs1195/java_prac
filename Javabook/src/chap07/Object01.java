package chap07;

public class Object01 {

	public static void main(String[] args) {
		Student stObj1 = new Student();	//Student객체 stObj1을 생성함
		
		stObj1.id = 20230410;	//객체를 이용하여 id 입력
		stObj1.name = "안도원";	//객체를 이용하여 name 입력
		stObj1.printInfo();		//정보를 출력하는 메서드
		
		Student stObj2 = new Student();	//Student객체 stObj2를 생성
		stObj2.insertRecord(20021005, "홍길동");	//파라미터를 통해 값을 변수에 값을 입력해주는 메서드
		stObj2.printInfo();	//정보 출력
	}

}
