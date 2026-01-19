package t3_LinkedList;
import java.util.LinkedList;

public class Test1 {

	/*
	 	 LinkedList : List 계열
	 	 List자료구조의 특징 : 인덱스로 관리, 중복허용, 자료의 삽입/삭제가 편리하다
	 */
		public static void main(String[] args) {
		LinkedList<String> LinkedList	= new LinkedList<>();
			
		//List<String> LinkedList	= new LinkedList<>();
		
		//System.out.println("1.LinkedList용량 : " + LinkedList.capacity());
		System.out.println("1.LinkedList크기 : " + LinkedList.size());
		System.out.println("1.LinkedList내용 : " + LinkedList.toString());
		System.out.println("1.LinkedList내용 : " + LinkedList);
		System.out.println();
		
		LinkedList.add("홍길동");
		LinkedList.add("김말숙");
		LinkedList.add("이기자");
		LinkedList.add("김연아");
		LinkedList.add("강감찬");
		LinkedList.add("이방원");
		LinkedList.add("손흥민");
		
		//System.out.println("2.LinkedList용량 : " + LinkedList.capacity());
		System.out.println("2.LinkedList크기 : " + LinkedList.size());
		System.out.println("2.LinkedList내용 : " + LinkedList);
		System.out.println();
		
		LinkedList.add("홍길동");
		LinkedList.add("김말숙");
		LinkedList.add("이기자");
		LinkedList.add("김연아");
		LinkedList.add("강감찬");
		LinkedList.add("이방원");
		LinkedList.add("손흥민");
		
		//System.out.println("3.LinkedList용량 : " + LinkedList.capacity());
		System.out.println("3.LinkedList크기 : " + LinkedList.size());
		System.out.println("3.LinkedList내용 : " + LinkedList);
		System.out.println();
		
		// add 는 배열에 추가 set은 인덱스 주소에 맞춰 덮어쓰기.
		LinkedList.set(0, "홍길순");
		System.out.println("4.LinkedList내용 : " +LinkedList );
		System.out.println();
		
		LinkedList.remove(1);
		//System.out.println("5.LinkedList용량 : " + LinkedList.capacity());
		System.out.println("5.LinkedList크기 : " + LinkedList.size());
		System.out.println("5.LinkedList 내용 : " + LinkedList);
		System.out.println("5.isEmpty() : " +LinkedList.isEmpty());
		System.out.println();
		
		LinkedList.remove(1);
		//System.out.println("6.LinkedList용량 : " + LinkedList.capacity());
		System.out.println("6.LinkedList크기 : " + LinkedList.size());
		System.out.println("6.LinkedList 내용 : " + LinkedList);
		System.out.println("6.isEmpty() : " +LinkedList.isEmpty());
		System.out.println();
		
		System.out.println("7.1번자료 : " + LinkedList.get(1));
		System.out.println();
		
		LinkedList.clear();
		//System.out.println("7.LinkedList용량 : " + LinkedList.capacity());
		System.out.println("7.LinkedList크기 : " + LinkedList.size());
		System.out.println("7.LinkedList 내용 : " + LinkedList);
		System.out.println("7.isEmpty() : " +LinkedList.isEmpty());
		System.out.println();
		}
	}

