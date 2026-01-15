package t9_etc_class.t4_anonymous2;

public interface Tire {
	public abstract void roll();
	public abstract void companyModelName(String model);
	
	default public void roll2() {
		System.out.println("일반 타이어가 굴러갑니다.");
	}
	
}
