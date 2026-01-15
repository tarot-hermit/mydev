package t7_static;

public class Test2 {
	
	static int su1 = 100;
	static int su2;
	
	static void mbc() {}
	
	static {
		su2 = 100;
		mbc();
	}
	
}
