package api04_String;
/*
  => mutable(가변) / immutable (불가변)
 String객체 : immutable객체로 class에서 크기를 한번 정해두면 그값을 유지한다. 짧은문자열 처리에 적당
 StringBuffer객체 : mutable객체로서 크기를 변경할수있다. 동기화를 제공해주고, 멀티스레드를 지원및 사용에 적당, 가변길이 문자에 적당
 StringBuilder객체 : mutable객체로서 크기를 변경할수 있다. 동기화여부가 불명확, 가변길이 문자에 적당.
 성능 : StringBuilder > StringBuffer >>> String
 */

public class Test10 {
	public static void main(String[] args) {
		String str1 = new String("홍길동");
		System.out.println("1. " + str1);
		
		
		
		
		// capacity() : 현재 버퍼의 크기(용량)
		//System.out.println("2. " + str1.capacity()); (X)
		
		StringBuffer str2 = new StringBuffer();
		System.out.println("2. " + str2.capacity());
		
		// 값의 추가  : append()
		str2.append("김말숙");
		System.out.println("3-1. " + str2);
		System.out.println("3-2. " + str2.capacity());
		
		str2.append("1234567890");
		System.out.println("4-1. " + str2);
		System.out.println("4-2. " + str2.capacity());

		str2.append("123457890");
		System.out.println("5-1. " + str2);
		System.out.println("5-2. " + str2.capacity());
		
		str2.append("12345789012345");
		System.out.println("6-1. " + str2);
		System.out.println("6-2. " + str2.capacity());
		System.out.println("6-3. " + str2.length());
		System.out.println();
		
		
		StringBuilder str3 = new StringBuilder();
		//str3.append("김말숙");
		System.out.println("7-1. " + str3);
		System.out.println("7-2. " + str3.capacity());
		
		str3.append("김말숙");
		System.out.println("8-1. " + str3);
		System.out.println("8-2. " + str3.capacity());
		
		str3.append("123456789012345");
		System.out.println("9-1. " + str3);
		System.out.println("9-2. " + str3.capacity());
		System.out.println("9-3. " + str3.length());
	}
}
