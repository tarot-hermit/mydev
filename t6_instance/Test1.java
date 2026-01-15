package t6_instance;

public class Test1 {

	double pi = Math.PI;
	
	// 원넓이(반지름 * 반지름 * 3.141592...)
	double cicleArea(int r) {
		double res = r * r * this.pi;
		return res;
	}
}
