package t3_constructor;

public class Test02_2 {
		
		String model;
		String color;
		int speed;
		
		Test02_2() {}
		
		Test02_2(String model) {
			this(model, "검정색", 250);
		//	this(model, null, 0);
		}
		
		Test02_2(String model, String color) {
			//this(model, "color", 280);
			this(model, color, 0);
	
		}
		
		Test02_2(String model, String color, int speed) {
			this.model = model;
			this.color = color;
			this.speed = speed;
		}
		
	}


