package t0_Bunsik;

public class WangjaBunsik extends Bonsa {

	public WangjaBunsik(String name) {
		super(name);
	}


	@Override
	public void kimch() {
		System.out.println("4,500원");
	}

	@Override
	public void budea() {
		System.out.println("5,000원");

	}

	@Override
	public void bibim() {
		System.out.println("6,000원");		
	}

	@Override
	public void sundea() {
		System.out.println("판매하지 않음.");
	}

	@Override
	public void gong() {	
		System.out.println("1,000원");
	}

}
