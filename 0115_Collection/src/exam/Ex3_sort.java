package exam;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Ex3_sort {
		public static void main(String[] args) {
			
		List<Integer> vos = new ArrayList<Integer>();
		for(int i=0; i<10; i++) {
			vos.add((int)(Math.random()*(99-10+1)+10));
		
		}
		System.out.println("원본자료 : " + vos);
		System.out.println();
		
		Collections.sort(vos);
		
		
		System.out.println("오름차순 : " + vos);
		System.out.println();
		
		Collections.sort(vos, Comparator.reverseOrder());
		System.out.println("내림차순 : " + vos);
		System.out.println();
		}
		
	}