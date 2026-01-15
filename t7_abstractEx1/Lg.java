package t7_abstractEx1;

public class Lg extends phone {

	public Lg(String name) {
		super(name + "(LG)");
	}
	
	@Override
	public void function() {
		System.out.println(getName() + "폰은 삼성페이가 좋습니다.");
	}

	@Override
	public void sound() {
		

	}

}
