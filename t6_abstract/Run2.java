package t6_abstract;

public class Run2 {
	public static void main(String[] args) {
		
//		Animal animalDog = new Dog();
//		Animal animalCat = new Cat();
//		Animal animalBird = new Bird();
		
//		Animal[] animals = new Animal[3]; 
//		animals[0] = new Dog();		
//		animals[1] = new Cat();		
//		animals[2] = new Bird();		
		
		Animal[] animals = {new Dog(), new Cat(), new Bird()};
		String[] title = {"강아지" , "고양이" , "새"};
	//	animalDog.sound();
	//	animalCat.sound();
	//	animalBird.sound();
		
		
		//new Animals();
		System.out.println();
		for(int i=0; i<animals.length; i++) {
			System.out.print(title[i] + "==>" );			
			animals[i].sound();
		}
		
		
	}
	
}
