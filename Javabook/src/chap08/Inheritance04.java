package chap08;

public class Inheritance04 {

	public static void main(String[] args) {
		SubSon son = new SubSon();	//아들객체
		son.printfSon();
		son.printFather();//아들객체에서 아빠메서드 호출
		
		SubDaughter dt = new SubDaughter(); //딸램객체
		dt.printDaughter();
		dt.printFather();//딸램객체에서 아빠메서드 호출
	}

}
