package chap09;

public class Example03 {

	public static void main(String[] args) {
		Bike mb = new Bike();
		Car c = new Car();
		mb.printType();
		mb.printBrand();
		mb.printPrice();
		System.out.println("--------------");
		c.printType();
		c.printBrand();
		c.printPrice();
	}

}
