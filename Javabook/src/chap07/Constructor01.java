package chap07;

public class Constructor01 {

	public static void main(String[] args) {
		System.out.println("****학생 주소록****");
		Student st = new Student();
		
		st.insertRecord(20221004, "홍길순");
		st.printInfo();
	}

}
