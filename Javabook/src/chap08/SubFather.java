package chap08;

//GrandFather상속 받기
public class SubFather extends GrandFather {
	String familyName = "프로그래머";
	String houseAddress = "인천";
	
	void printFather() {
		System.out.println("나는 아버지 입니다! 나는 할아버지로부터 상속 받습니다.");
	}
}
