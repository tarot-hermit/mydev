package t5_test;
//Calculator 계산기.
public class Calculator {
	String name;
	int su1, su2;
	
	//public Calculator() {}	
	
	public Calculator(int su1, int su2) {
		this.su1 = su1;
		this.su2 = su2;
	}
	
	void add() {
		System.out.println("su1 + su2 = " + (su1 + su2));
	}

	void sub() {
		System.out.println("su1 - su2 = " + (su1 - su2));
	}
	
	int mul() {
		return su1 * su2;
	}
	
	double dev() {
		return (double) su1 / su2;
	}
	
}
