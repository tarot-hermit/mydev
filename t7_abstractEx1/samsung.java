package t7_abstractEx1;

public class samsung extends phone {

	public samsung(String name) {
		super(name +"(삼성)" );		
	}

	@Override
	public void function() {
		System.out.println(getName()+"폰은 삼성페이 기능이 우수합니다.");
	}

	public String getName() {
		
		return null;
	}

	@Override
	public void sound() {
		System.out.println(getName() +"폰의 전화벨소리는 따르릉~ 입니다."  );
		
	}

}
