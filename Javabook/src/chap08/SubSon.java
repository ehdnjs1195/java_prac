package chap08;
//SubFather 상속받기
public class SubSon extends SubFather{
	void printfSon() {
		System.out.println("나는 아들입니다.");
		System.out.println("나는 아버지로부터 상속 받습니다.");
		//SubFather를 상속받았기 때문에
		//this접근자를 통해 SubFather의 변수를 사용할 수 있다.
		System.out.println("나의 아버지는" + this.familyName);
		System.out.println("나의 집은 " + this.houseAddress);
	}
}
