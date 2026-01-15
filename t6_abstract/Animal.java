package t6_abstract;

public abstract class Animal {
	
	public String name = "동물농장";
	
	public void sori() {
		System.out.println("일반메소드(sori))");
	}
	
	public abstract void sound();
	
}
