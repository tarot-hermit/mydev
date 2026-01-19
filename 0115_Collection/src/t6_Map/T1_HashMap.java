package t6_Map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Set;



/*
  Map계열 자료구조 : '키' 와 '값' 으로 구성되는 자료구조로, 사전식 자료구조라고도 한다. web에서는 json 형식과 같다.
  							: '키' 는 중복될수 없으나, '값' 은 중복될수 있다.
 */


public class T1_HashMap {
	public static void main(String[] args) {
		//Map<Integer, String> map = new HashMap<Integer, String>();
		HashMap<Integer, String> map = new HashMap<Integer, String>();
		
		System.out.println("1.HashMap크기 : " + map.size());
		System.out.println("1.HashMap내용 : " + map);
		System.out.println();
		
		// 자료의 추가(삽입) : put(키, 값)
		map.put(11, "홍길동");
		map.put(13, "김말숙");
		map.put(21, "이기자");
		map.put(15, "오하늘");
		System.out.println("2.HashMap크기 : " + map.size());
		System.out.println("2.HashMap내용 : " + map);
		System.out.println();
		
		map.put(12, "김말숙");
		System.out.println("3.HashMap크기 : " + map.size());
		System.out.println("3.HashMap내용 : " + map);
		System.out.println();
		
		map.put(12, "김말자");
		System.out.println("4.HashMap크기 : " + map.size());
		System.out.println("4.HashMap내용 : " + map);
		System.out.println();
		
		//검색 : get(키)
		String name = map.get(11);
		System.out.println("5.name : " + name);
		name = map.get(18);
		System.out.println("6.name : " + name);
		
		//삭제 : remove(키)
		map.remove(11);
		System.out.println("7.HashMap크기 : " + map.size());
		System.out.println("7.HashMap내용 : " + map);
		System.out.println();

		map.remove(10);
		System.out.println("8.HashMap크기 : " + map.size());
		System.out.println("8.HashMap내용 : " + map);
		System.out.println();
		
		// key만 출력 : keySet()
		Set<Integer> keys = map.keySet();
		for(Integer k : keys) {
			System.out.println("key : " + k + ", value : " + map.keySet());
		}
		System.out.println();
		
		Collection<String> val = map.values();
		System.out.println("값 : " + val);
		
		//map.clear();
		//System.out.println("9.HashMap크기 : " + map.size());
		//System.out.println("9.HashMap내용 : " + map);
		//System.out.println("9. : " + map.isEmpty());
		//System.out.println();
		
		
	}
}
