package t5_Set;

import java.util.TreeSet;

public class T2_TreeSet {
	public static void main(String[] args) {
		
	TreeSet<Integer> treeSet = new TreeSet<Integer>();
	
	for(int i=50; i> 0; i-=2) {
		treeSet.add(i);
	}
	System.out.println("1.TreeSet크기 : " + treeSet.size());
	System.out.println("1.TreeSet내용 : " + treeSet);
	System.out.println();
	
	System.out.println("2.first()" + treeSet.first());	
	System.out.println("3.last()" + treeSet.last());	
	
	System.out.println("4.lower() : " + treeSet.lower(26));
	System.out.println("5.higher() : " + treeSet.higher(26));
	System.out.println("6.floor() : " + treeSet.floor(25));
	System.out.println("7.ceiling() : " + treeSet.ceiling(25));
	}
}
