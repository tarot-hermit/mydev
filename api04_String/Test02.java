package api04_String;

public class Test02 {
	public static void main(String[] args) {
		//						0					1			 2
		// 						012345678012345678
		String msg = "Welcom to Korea!!!";
		
		int position;
		
		position = msg.indexOf("o");
		System.out.println("1 :첫번째 o의 위치는? " + position);
		
		System.out.println("2 : 4번째 인덱스 위치부터 이후 자료 출력?" + msg.substring(position));
		System.out.println("3 : com만 출력? " + msg.substring(3, 6));
	
		System.out.println("4 : " + msg.substring(msg.indexOf("com"), msg.indexOf("!")));
		
		
		
	}
}
