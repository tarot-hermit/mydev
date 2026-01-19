package t1_basic;

class Apple2 {}

class Banana2 {}

class Goods {
	private Object object = new Object();

	public Object getObject() {
		return object;
	}
	public void setObject(Object object) {
		this.object = object;
	}
}
	


public class Test2 {
	public static void main(String[] args) {
		Goods goods1 = new Goods ();
		goods1.setObject(new Apple2());
		Apple2 apple2 = (Apple2) goods1.getObject();
		System.out.println("apple2 : " + apple2);
		
		Goods goods2 = new Goods();
		goods2.setObject(new Banana2());
		Banana2 banana2 = (Banana2) goods2.getObject();
		System.out.println("banana2 : " + banana2);
		
		Goods goods3 = new Goods();
		goods3.setObject(new Apple2());
		Banana2 banana3 = (Banana2)goods3.getObject();
		System.out.println("banana3 : " + banana3);
	}

	
	
}
