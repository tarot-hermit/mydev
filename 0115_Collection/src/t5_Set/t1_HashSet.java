package t5_Set;

import java.util.HashSet;


/*
   Set계열 : 집합자료구조 - 중복을 허용하지않는다. 비순서 구조, 인덱스가 없다.
   				: HashSet, LinkedHashSet, TreeSet
 */


public class t1_HashSet {
	public static void main(String[] args) {
		//Set<String> hash = new HashSet<String>();
		HashSet<String> hash = new HashSet<String>();
		
		System.out.println("1.HashSet크기 : " + hash.size());
		System.out.println("1.HashSet내용 : " + hash);
		System.out.println();
		
		hash.add("홍길동");
		hash.add("김말숙");
		hash.add("이기자");
		hash.add("오하늘");
		hash.add("mbc");
		System.out.println("2.HashSet크기 : " + hash.size());
		System.out.println("2.HashSet내용 : " + hash);
		System.out.println();
		
		hash.add("홍길동");
		System.out.println("3.HashSet크기 : " + hash.size());
		System.out.println("3.HashSet내용 : " + hash);
		System.out.println();
		
		//제거 : remove
		hash.remove("홍길동");
		System.out.println("4.HashSet크기 : " + hash.size());
		System.out.println("4.HashSet내용 : " + hash);
		System.out.println();
		
		hash.remove("sbs");
		System.out.println("5.HashSet크기 : " + hash.size());
		System.out.println("5.HashSet내용 : " + hash);
		System.out.println();
		
		// 비어있는지의 유무 : isEmpty()
		System.out.println("6.자료가 비었는가 : "+ hash.isEmpty() );
		System.out.println();
		
		// 포함 유무 : contains()
		System.out.println("7. '숙' 의 포함 유무 : " + hash.contains("김말숙"));
		System.out.println();
		
		// 전체출력(향상된 for문)
		for(String h : hash) {
			System.out.println("8-. " + h);
		}

		String str = "";
		for(String h : hash) {
			str += h + "/";
		}
		System.out.println(str);
		System.out.println(str.subSequence(0, str.length()-1));
		
	}
}
