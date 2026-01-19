package t1_Vector;

import java.util.Vector;

/*
 	 Vector : List 계열 
 	 	List 자료구조의 특징 : 인덱스로 관리, 순차처리, 앞에서부터 자료를 기억, 많은자료의 삽입/삭제시 많은 시간이 소요됨, 중복허용
		'멀티스레드'의 동기화작업에 유리 - ArrayList에 비해서 안전(안정)적이다.
 */

public class Test1 {
	public static void main(String[] args) {
	Vector<String> vector	= new Vector<>();
		//List 는 인터페이스로 import 해야한다.
	//List<String> vector	= new Vector<>();
	
	System.out.println("1.vector용량 : " + vector.capacity());
	System.out.println("1.vector크기 : " + vector.size());
	System.out.println("1.vector내용 : " + vector.toString());
	System.out.println("1.vector내용 : " + vector);
	System.out.println();
	
	vector.add("홍길동");
	vector.add("김말숙");
	vector.add("이기자");
	vector.add("김연아");
	vector.add("강감찬");
	vector.add("이방원");
	vector.add("손흥민");
	
	System.out.println("2.vector용량 : " + vector.capacity());
	System.out.println("2.vector크기 : " + vector.size());
	System.out.println("2.vector내용 : " + vector);
	System.out.println();
	
	vector.add("홍길동");
	vector.add("김말숙");
	vector.add("이기자");
	vector.add("김연아");
	vector.add("강감찬");
	vector.add("이방원");
	vector.add("손흥민");
	
	System.out.println("3.vector용량 : " + vector.capacity());
	System.out.println("3.vector크기 : " + vector.size());
	System.out.println("3.vector내용 : " + vector);
	System.out.println();
	
	// add 는 배열에 추가 set은 인덱스 주소에 맞춰 덮어쓰기.
	vector.set(0, "홍길순");
	System.out.println("4.vector내용 : " +vector );
	System.out.println();
	
	vector.remove(1);
	System.out.println("5.vector용량 : " + vector.capacity());
	System.out.println("5.vector크기 : " + vector.size());
	System.out.println("5.vector 내용 : " + vector);
	System.out.println("5.isEmpty() : " +vector.isEmpty());
	System.out.println();
	
	vector.remove(1);
	System.out.println("6.vector용량 : " + vector.capacity());
	System.out.println("6.vector크기 : " + vector.size());
	System.out.println("6.vector 내용 : " + vector);
	System.out.println("6.isEmpty() : " +vector.isEmpty());
	System.out.println();
	
	System.out.println("7.1번자료 : " + vector.get(1));
	System.out.println();
	
	vector.clear();
	System.out.println("7.vector용량 : " + vector.capacity());
	System.out.println("7.vector크기 : " + vector.size());
	System.out.println("7.vector 내용 : " + vector);
	System.out.println("7.isEmpty() : " +vector.isEmpty());
	System.out.println();
	}
}
