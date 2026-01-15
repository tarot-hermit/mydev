package t9_etc_class.t4_anonymous2;

public class Car implements Tire {

	@Override
	public void roll() {	
		System.out.println("추상 타이어가 굴러갑니다.");
	}
	
	public void mod1() {
		System.out.println("Car클래스의 mod1메소드입니다.");
	}
	public void roll3() {
		System.out.println("일반 타이어가 굴러갑니다.");
	
}
	Tire tire1 = new Tire() {
		
		@Override
		public void roll() {
			System.out.println("익명 타이어가 굴러갑니다.");
			
		}

		@Override
		public void companyModelName(String model) {}
	}; 
	
	public void mod2() {
		tire1.roll();
		tire1.roll2();
	}
	public void mod3() {
		Tire tire3 = new Tire() {
			
			@Override
			public void companyModelName(String model) {	
			}
			@Override
			public void roll() {
			System.out.println("로컬 타이어가 굴러갑니다.");	
			}
		};
		tire3.roll();
	} 
	@Override
	public void companyModelName(String model) {
		System.out.println("타이어 제조회사 : " + model);
	}
	
}
