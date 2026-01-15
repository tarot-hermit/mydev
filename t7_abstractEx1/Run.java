package t7_abstractEx1;

public class Run {
	public static void main(String[] args) {
		
		//메뉴 : 1.삼성,,, 2.LG
		
		phone samsungPhone = new samsung("홍길동");
		samsungPhone.powerOn();
		samsungPhone.sound();
		samsungPhone.function();
		samsungPhone.powerOff();
		
		
		phone lgPhone = new Lg("김말숙");
		samsungPhone.powerOn();
		samsungPhone.sound();
		samsungPhone.function();
		samsungPhone.powerOff();
	}
}
