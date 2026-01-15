package t7_static;

public class Test1 {
	
	static double pi = Math.PI;
	
	// 원넓이(반지름 * 반지름 * 3.141592...)
	static double cicleArea(int r) {
		double res = r * r * pi;
		return res;
	}
}
