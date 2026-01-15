package t3_if;

public class Tset3 {
	public static void main(String[] args) {
		int a=30, b=20, c=0, x=0, y=0;
		
		if(a > b) {
			if(a > c) {
				x = a + b;
				
			}
			else {
				x = a * b;
				
			}
		}
		else {
			x = a - b;
			
		}
		
		y = a / b;
		System.out.println("x = " + x + ", y = " + y);
	}
}
