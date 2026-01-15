package t1_exception;

public class T0_Interrupted {
	public static void main(String[] args) throws InterruptedException {
		
		int tot = 0;
		
		for(int i=1; i<=10; i++) {
			tot += i;
			Thread.sleep(500);
			System.out.println("1부터 "+i+" 10까지의 합은 "+tot+" 입니다.");
		}
	}
}
