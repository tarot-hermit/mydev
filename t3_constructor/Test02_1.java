package t3_constructor;

public class Test02_1 {
	
	String model;
	String color;
	int speed;
	
	Test02_1() {}
	
	Test02_1(String model) {
		this.model = model;
		color ="검정색";
		speed =250;
	}
	
	Test02_1(String model, String color) {
		this.model = model;
		this.color = color;
		speed =280;
	}
	
	Test02_1(String model, String color, int speed) {
		this.model = model;
		this.color = color;
		this.speed = speed;
	}
	
}
