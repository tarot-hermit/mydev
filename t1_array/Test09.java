package t1_array;

// 배열복사(깊은 복사)
public class Test09 {
	public static void main(String[] args) {
		int[] mbc = {10,20,30,40,50};
		int[] kbs = new int[mbc.length];

		for(int i=0; i<mbc.length; i++) {
			System.out.println("mbc["+i+"] ="+mbc[i]+ " , kbs["+i+"]="+kbs[i]);
		}
		System.out.println("============");
		
//		kbs[0] = mbc[0];  
//		kbs[1] = mbc[1];  
//		kbs[2] = mbc[2];  
//		kbs[3] = mbc[3];  
//		kbs[4] = mbc[4];  
		
		for(int i=0; i<mbc.length; i++) {
			kbs[i] = mbc[i];
		}
		
		for(int i=0; i<mbc.length; i++) {
			System.out.println("mbc["+i+"] ="+mbc[i]+ " , kbs["+i+"]="+kbs[i]);
		}
		System.out.println("=============");
		
		mbc[0] = 500;
		mbc[4] = 100;

		for(int i=0; i<mbc.length; i++) {
			System.out.println("mbc["+i+"] ="+mbc[i]+ " , kbs["+i+"]="+kbs[i]);
		}
	}
}