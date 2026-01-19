package t2_ArrayList;

import java.util.ArrayList;


/*
 	 ArrayList : List 계열 
 	 	List 자료구조의 특징 : 인덱스로 관리, 순차처리, 앞에서부터 자료를 기억, 많은자료의 삽입/삭제시 많은 시간이 소요됨, 중복허용
		'멀티스레드'의 동기화작업에 유리 - ArrayList에 비해서 안전(안정)적이다.
 */

public class Test1 {
	public static void main(String[] args) {
	ArrayList<String> ArrayList	= new ArrayList<>();
		
	//List<String> ArrayList	= new ArrayList<>();
	
	//System.out.println("1.ArrayList용량 : " + ArrayList.capacity());
	System.out.println("1.ArrayList크기 : " + ArrayList.size());
	System.out.println("1.ArrayList내용 : " + ArrayList.toString());
	System.out.println("1.ArrayList내용 : " + ArrayList);
	System.out.println();
	
	ArrayList.add("홍길동");
	ArrayList.add("김말숙");
	ArrayList.add("이기자");
	ArrayList.add("김연아");
	ArrayList.add("강감찬");
	ArrayList.add("이방원");
	ArrayList.add("손흥민");
	
	//System.out.println("2.ArrayList용량 : " + ArrayList.capacity());
	System.out.println("2.ArrayList크기 : " + ArrayList.size());
	System.out.println("2.ArrayList내용 : " + ArrayList);
	System.out.println();
	
	ArrayList.add("홍길동");
	ArrayList.add("김말숙");
	ArrayList.add("이기자");
	ArrayList.add("김연아");
	ArrayList.add("강감찬");
	ArrayList.add("이방원");
	ArrayList.add("손흥민");
	
	//System.out.println("3.ArrayList용량 : " + ArrayList.capacity());
	System.out.println("3.ArrayList크기 : " + ArrayList.size());
	System.out.println("3.ArrayList내용 : " + ArrayList);
	System.out.println();
	
	// add 는 배열에 추가 set은 인덱스 주소에 맞춰 덮어쓰기.
	ArrayList.set(0, "홍길순");
	System.out.println("4.ArrayList내용 : " +ArrayList );
	System.out.println();
	
	ArrayList.remove(1);
	//System.out.println("5.ArrayList용량 : " + ArrayList.capacity());
	System.out.println("5.ArrayList크기 : " + ArrayList.size());
	System.out.println("5.ArrayList 내용 : " + ArrayList);
	System.out.println("5.isEmpty() : " +ArrayList.isEmpty());
	System.out.println();
	
	ArrayList.remove(1);
	//System.out.println("6.ArrayList용량 : " + ArrayList.capacity());
	System.out.println("6.ArrayList크기 : " + ArrayList.size());
	System.out.println("6.ArrayList 내용 : " + ArrayList);
	System.out.println("6.isEmpty() : " +ArrayList.isEmpty());
	System.out.println();
	
	System.out.println("7.1번자료 : " + ArrayList.get(1));
	System.out.println();
	
	ArrayList.clear();
	//System.out.println("7.ArrayList용량 : " + ArrayList.capacity());
	System.out.println("7.ArrayList크기 : " + ArrayList.size());
	System.out.println("7.ArrayList 내용 : " + ArrayList);
	System.out.println("7.isEmpty() : " +ArrayList.isEmpty());
	System.out.println();
	}
}
