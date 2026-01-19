package t4_etc;

import java.util.Stack;

public class T1_Stack {
	public static void main(String[] args) {
		Stack<Integer> stack = new Stack<Integer>();
		
		System.out.println("1.크기 : " + stack.size());
		System.out.println("1.내용 : " + stack);
		System.out.println();
		
		// 삽입(push)
		stack.push(10);
		stack.push(15);
		stack.push(20);
		stack.push(25);
		stack.push(30);
		
		System.out.println("2.크기 : " + stack.size());
		System.out.println("2.내용 : " + stack);
		System.out.println();
		
		// 스택의 바로 아래자료 내려다보기(peek())
		System.out.println("3.바로 아래자료 확인" + stack.peek());
		
		// 검색(search)
		System.out.println("4.자료 20의 위치 검색하기 " + stack.search(20) + "번지에 위치함");
		
		//자료 꺼내기(pop)
		System.out.println("5.자료 꺼내기 " + stack.pop());
		System.out.println("5.크기 : " + stack.size());
		System.out.println("5.내용 : " + stack);
		System.out.println();
	}
}
