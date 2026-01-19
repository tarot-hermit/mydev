package exam;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class Ex1_speed {
	public static void main(String[] args) {
		
		List<String> vos1 = new Vector<String>();
		List<String> vos2 = new ArrayList<String>();
		List<String> vos3 = new LinkedList<String>();
		
		int su = 200000;
		long startTime, endTime;
		
		System.out.println("0번 인덱스에 자료 추가하기");
		//Vector
		startTime = System.nanoTime();
		for(int i=0; i<su; i++) vos1.add(0, "자료" + i);		
		endTime = System.nanoTime();
		System.out.println("vector : \t\t\t\t\t" + (endTime-startTime) + "ns");
		// ArrayList
		startTime = System.nanoTime();
		for(int i=0; i<su; i++) vos2.add(0, "자료" + i);		
		endTime = System.nanoTime();
		System.out.println("ArrayList : \t\t\t\t\t" + (endTime-startTime) + "ns");
		//LinkedList
		startTime = System.nanoTime();
		for(int i=0; i<su; i++) vos3.add(0, "자료" + i);		
		endTime = System.nanoTime();
		System.out.println("LinkedList : \t\t\t\t\t" + (endTime-startTime) + "ns");
	}
}
