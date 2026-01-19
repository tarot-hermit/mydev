package t1_basic;

class Apple {}

class Banana {}

class Goods1 {
	private Apple apple = new Apple();

	public Apple getApple() {
		return apple;
	}
	public void setApple(Apple apple) {
		this.apple = apple;
	}
	
		}
	class Goods2 {
	private Banana banana = new Banana();
	
	public Banana getBanana() {
		return banana;
	}
	public void setBanana(Banana banana) {
		this.banana = banana;
	}
}


public class Test1 {
	public static void main(String[] args) {
		Goods1 goods1 = new Goods1 ();
		goods1.setApple(new Apple());
		Apple apple = goods1.getApple();
		System.out.println("apple : " + apple);
		System.out.println();
		
		Goods2 goods2 = new Goods2 ();
		goods2.setBanana(new Banana());
		Banana banana = goods2.getBanana();
		System.out.println("banana : " + banana);
		
		
	}

	
}
