package t6_abstract;

public class Run1 {
	public static void main(String[] args) {
		
		Dog dog = new Dog();
		dog.sound();
		
		Cat cat = new Cat();
		cat.sound();
		System.out.println();
		
		Animal animalDog = new Dog();
		animalDog.sound();
		
		Animal animalCat = new Cat();
		animalCat.sound();
		
		Animal animalBird = new Bird();
		animalBird.sound();
	}
	
}
