package t2_use;

class Apple {}
class Banana {}

class Goods <T>{
	private T t;

	public T getT() {
		return t;
	}
	public void setT(T t) {
		this.t = t;
	}
}

public class Test3 {
	public static void main(String[] args) {
		Goods<Apple> goods1 = new Goods<>();
		//goods1.setT(new Banana());
		goods1.setT(new Apple());
		Apple apple = goods1.getT();
		System.out.println("apple : " + apple);
		
		Goods<Banana> goods2 = new Goods<>();
		goods2.setT(new Banana());
		Banana banana = goods2.getT();
		System.out.println("banana : " + banana);
		
		
	}
}
