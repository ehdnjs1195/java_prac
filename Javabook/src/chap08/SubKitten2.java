package chap08;

public class SubKitten2 extends SuperCat2{
	String name;
	String age = "2살";
	public SubKitten2(String n1, String n2) {
		/*부모클래스를 상속받은 클래스는 기본적으로 상위 클래스를 생성자로 생성하게 
		 * 되어있다. default로 기본생성자가 생략되어있음. 
		 * 그런데 상위클래스에서 임의로 생성자를 명시해주면 상속 받은 클래스에서는
		 * 그 생성자를 형식에 맞게 호출해줘야 한다.
		 */
		super(n1);
		this.name = n2;
		System.out.println("아기 고양이입니다. 이름은 " + name);
	}
}
