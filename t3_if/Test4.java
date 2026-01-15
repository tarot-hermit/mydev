package t3_if;

public class Test4 {
	public static void main(String[] args) {
		int a=30, b=20, c=0, x=0, y=0;
	
		if(a > b) {
			x = a - b;
		}
			else {
				if(a > c) {
					x = a * b;
			}
				else {
					x = a + b;
				}
			}

		y = a / b;
		System.out.println("x = "+x+" y = _");
	}
}

		