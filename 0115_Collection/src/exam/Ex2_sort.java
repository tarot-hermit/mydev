package exam;

import java.util.ArrayList;
import java.util.List;

public class Ex2_sort {
	public static void main(String[] args) {
		
	List<Integer> vos = new ArrayList<Integer>();
	for(int i=0; i<10; i++) {
		//int su = (int)(Math.random()*(99-10+1)+10);
		//vos.add(su);
		vos.add((int)(Math.random()*(99-10+1)+10));
	
	}
	System.out.println("원본자료 : " + vos);
	
	//정렬 메소드 :sortProcess(오름차순 : a, 내림차순:b)
	
	vos = sortProcess(vos, "a");
	System.out.println("오름차순 : " + vos);
	System.out.println();
	
	vos = sortProcess(vos, "d");
	System.out.println("내림차순 : " + vos);
	System.out.println();
	
	
	}

	private static List<Integer> sortProcess(List<Integer> vos, String str) {
		int temp = 0;
		for(int i=1; i<vos.size()-1; i++) {
			for(int j=i+1; j<=vos.size(); i++) {
				if(str.equals("a")) {
					if(vos.get(i-1)  <vos.get(j-1)) {
						temp = vos.get(i-1);
						vos.set((i-1), vos.get(i-1));
						vos.set((j-1), temp);
					}
				}
				else {
					
				}
			}
		}
		return vos;
	}
}
