package t6_Map;

import java.util.Collection;
import java.util.TreeMap;
import java.util.Set;



/*
  Map계열 자료구조 : '키' 와 '값' 으로 구성되는 자료구조로, 사전식 자료구조라고도 한다. web에서는 json 형식과 같다.
  							: '키' 는 중복될수 없으나, '값' 은 중복될수 있다.
  		TreeMap		: '키' 값으로 정령된 자료로 출력처리한다.
 */


public class T2_TreeMap {
	public static void main(String[] args) {
		//Map<Integer, String> map = new TreeMap<Integer, String>();
		TreeMap<Integer, String> map = new TreeMap<Integer, String>();
		
		System.out.println("1.TreeMap크기 : " + map.size());
		System.out.println("1.TreeMap내용 : " + map);
		System.out.println();
		
		// 자료의 추가(삽입) : put(키, 값)
		map.put(11, "홍길동");
		map.put(13, "김말숙");
		map.put(21, "이기자");
		map.put(15, "오하늘");
		System.out.println("2.TreeMap크기 : " + map.size());
		System.out.println("2.TreeMap내용 : " + map);
		System.out.println();
		
		
		
		
	}
}
