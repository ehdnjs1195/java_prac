package chap07;

public class Example06 {

	public static void main(String[] args) {
		Cat cat1 = new Cat();	//기본생성자
		Cat cat2 = new Cat("샴"); //일반생성자
		Cat cat3 = new Cat("러시안블루", "회색"); //오버로딩해서 만든 생성자
		
		//cat1의 breed나 color는 초기화해준 값이 없으므로 null
		System.out.println("첫 번째 고양이 품종: " + cat1.breed + "\t색상: " + cat1.color);
		//cat2의 color를 초기화 해주지 않았으므로 null
		System.out.println("두 번째 고양이 품종: " + cat2.breed + "\t색상: " + cat2.color);
		//cat3는 생성자를 호출하면서 동시에 초기화 해주었기 때문에 정상적으로 출력된다.
		System.out.println("세 번째 고양이 품종: " + cat3.breed + "\t색상: " + cat3.color);
	}

}
