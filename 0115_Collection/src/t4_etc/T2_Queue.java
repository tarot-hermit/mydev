package t4_etc;

import java.util.LinkedList;
import java.util.Queue;

public class T2_Queue {
	public static void main(String[] args) {
		Queue<Integer> queue = new LinkedList<Integer>();
		
		System.out.println("1.크기 : " + queue.size());
		System.out.println("1.내용 : " + queue);
		System.out.println();
		
		queue.add(3);
		queue.add(4);
		queue.add(5);
		queue.add(6);
		queue.add(7);
		
		System.out.println("2.크기 : " + queue.size());
		System.out.println("2.내용 : " + queue);
		System.out.println();
		
		// 바로 아래자료 쳐다보기
		System.out.println("3. 바로 아래자료 : " + queue.peek());
		System.out.println();
		
		// 자료 꺼내기 (poll)
		System.out.println("4-1. 자료 꺼내기 " + queue.poll());
		System.out.println("4-2. 자료 꺼내기 " + queue.poll());
		System.out.println("4-3. 자료 꺼내기 " + queue.poll());
		System.out.println("4-4. 자료 꺼내기 " + queue.poll());
		System.out.println("4-5. 자료 꺼내기 " + queue.poll());
		System.out.println("4.크기 : " + queue.size());
		System.out.println("4.내용 : " + queue);
		System.out.println();
		
		System.out.println("4-6 자료 꺼내기 " + queue.poll());
		System.out.println();

		queue.add(15);
		queue.add(16);
		System.out.println("5. 바로 아래자료 : " + queue.element());
		System.out.println();
		System.out.println("5-1. 자료 꺼내기 " + queue.remove());
		System.out.println("5-2. 자료 꺼내기 " + queue.remove());
		// 자료가 없을시에는 사용자가 예외 처리한다.
		System.out.println("5-3. 자료 꺼내기 " + queue.remove());
	}
	
	
	
}
