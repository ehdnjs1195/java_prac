package chap07;

public class Constructor03 {

	public static void main(String[] args) {
		Add num1 = new Add(1, 2);	//Add(int a, int b)
		Add num2 = new Add(2.4, 6.2);//Add(double a, double b)
		Add num3 = new Add(1, 5.5); //Add(int a, double b)
	}

}
