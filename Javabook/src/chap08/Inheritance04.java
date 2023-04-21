package chap08;

public class Inheritance04 {

	public static void main(String[] args) {
		SubSon son = new SubSon();
		son.printfSon();
		son.printFather();
		
		SubDaughter dt = new SubDaughter();
		dt.printDaughter();
		dt.printFather();
	}

}
