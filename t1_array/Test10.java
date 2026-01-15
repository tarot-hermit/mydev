package t1_array;

// 배열복사(얕은복사)
public class Test10 {
	public static void main(String[] args) {
		int[] mbc = {10,20,30,40,50};
		int[] kbs = new int[mbc.length];
		
		for(int i=0; i<mbc.length; i++) {
			System.out.println("mbc["+i+"] ="+mbc[i]+ " , kbs["+i+"]="+kbs[i]);
		}
		System.out.println();
		
		kbs = mbc;

		System.out.println("=============");
		
		mbc[0] = 500;
		mbc[4] = 100;			
		kbs[1] = 3000;
		kbs[2] = 5000;
		
		for(int i=0; i<mbc.length; i++) {
			System.out.println("mbc["+i+"] ="+mbc[i]+ " , kbs["+i+"]="+kbs[i]);
		}
	}
}