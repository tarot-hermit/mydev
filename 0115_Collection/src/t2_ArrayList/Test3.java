package t2_ArrayList;

import java.util.ArrayList;

public class Test3 {
	public static void main(String[] args) {
		ArrayList<int[]> vos = new ArrayList<>();
		
		int[] jum1 = new int[4]; // 번호, 국어,영어,수학
		jum1[0] = 1;
		jum1[1] = 100;
		jum1[2] = 90;
		jum1[3] = 80;
		vos.add(jum1);
		
		System.out.println("1.vos의 크기 : " + vos.size());
		System.out.println("2.vos : " + vos);
		for(int i=0; i<jum1.length; i++) {
			System.out.println("2-.vos : " + vos.get(0)[i]);
		}
		System.out.println();
		
		int[] jum2 = new int[4]; // 번호, 국어,영어,수학
		jum1[0] = 5;
		jum1[1] = 200;
		jum1[2] = 50;
		jum1[3] = 60;
		vos.add(jum2);
		
		System.out.println("1.vos의 크기 : " + vos.size());
		System.out.println("2.vos : " + vos);
		for(int i=0; i<jum1.length; i++) {
			System.out.println("2-.vos : " + vos.get(0)[i]);
		}
		System.out.println();
		
		System.out.println("1.vos의 크기 : " + vos.size());
		System.out.println("2.vos : " + vos);
		for(int i=0; i<jum1.length; i++) {
			System.out.println("2-.vos : " + vos.get(1)[i]);
		}
		System.out.println("===============");
		
	int[] jum3 = new int[4]; // 번호, 국어,영어,수학
			jum1[0] = 3;
			jum1[1] = 80;
			jum1[2] = 70;
			jum1[3] = 50;
			vos.add(jum3);
		
		for(int i=0; i<vos.size(); i++) {
			for(int j=0; j<jum1.length; j++) {
				System.out.println("3-.vos : " + vos.get(i)[j]);
			}
			System.out.println();
		}
		
		jum3 = new int[4]; // 번호, 국어,영어,수학
		jum1[0] = 4;
		jum1[1] = 70;
		jum1[2] = 60;
		jum1[3] = 50;
		vos.add(jum3);
	
	for(int i=0; i<vos.size(); i++) {
		for(int j=0; j<jum1.length; j++) {
			System.out.println("4-.vos : " + vos.get(i)[j]);
		}
		System.out.println();
	}
	}
}
