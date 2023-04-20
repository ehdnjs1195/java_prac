package chap07;

public class Constructor02 {

	public static void main(String[] args) {
		System.out.println("****학생 주소록****");
		Student st1 = new Student(); //기본생성자로 Student 객체 생성
		st1.insertRecord(20221004, "홍길순"); //정보를 넣어주는 insertRecord 메서드 호출
		st1.printInfo(); //정보 출력
		
		Student st2 = new Student(20221005, "홍길동"); //생성자를 통해 정보를 입력
		st2.printInfo(); //정보 출력
		
	}

}
