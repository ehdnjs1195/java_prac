package chap08;

public class SubDaughter extends SubFather{
	void printDaughter() {
		System.out.println("나는 딸램.");
		System.out.println("나는 아버지로 부터 상속 받습니다.");
		System.out.println("나의 아버지는 " + this.familyName);
		System.out.println("나의 집은 " + this.houseAddress);
	}
}
