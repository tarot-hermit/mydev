package t2_ArrayList;

import java.util.ArrayList;

public class Test2 {
	public static void main(String[] args) {
		ArrayList<Integer> vos = new ArrayList<>();
		vos.add(10);
		vos.add(500);
		vos.add(1);
		vos.add(7);
		vos.add(20);
		vos.add(25);
		System.out.println("1.vos : " + vos);
		
		System.out.println("2.vos : " + vos.get(3));
		System.out.println();
		
		Object[] objects = vos.toArray();
		int cnt = 0;
		for(Object obj : objects) {
			System.out.println("obj["+cnt+"] : " + obj);
			cnt++;
		}
		System.out.println();
		
		cnt = 0;
		int su = 0;
		
		for(Object obj : objects) {
			 su = (Integer)obj + 10;
			System.out.println("obj["+cnt+"] : " + su);
			cnt++;
		}
		
	}
}
