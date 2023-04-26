package chap08;

public class Polymorphism02 {

	public static void main(String[] args) {
		Animal myAnimal = new Animal();//동물객체생성
		Pig myPig = new Pig();//돼지객체생성
		Dog myDog = new Dog();//개 객체생성
		//각각의 동물소리 출력.
		myAnimal.animalSound();
		myPig.animalSound();
		myDog.animalSound();
	}

}
