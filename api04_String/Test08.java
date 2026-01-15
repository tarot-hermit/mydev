package api04_String;

import java.util.HashMap;

public class Test08 {
	public static void main(String[] args) {
		
		String atom = "1234";
		System.out.println("atom + 100 = " + (atom +100));
		
		int intAtom = Integer.parseInt(atom); 
		System.out.println("intAtom + 100 = " + (intAtom +100));
		
		//int intSu0 = 1234;
		//double dblSu = 1234.0;
		
		Integer intSu = 1234;
		Double dblSu = 1234.0;
		String strSu = "1234";
		
		System.out.println("1. " + strSu);
		System.out.println("2. " + strSu.getClass().getName());
		System.out.println("3. " + intSu.getClass().getName());
		//System.out.println("4. " + intSu0.getClass().getName());
		System.out.println("4. " + dblSu.getClass().getName());
		
		
		
		//HashMap<String, Integer> map = new HashMap<String, Integer>();
		HashMap<String, Integer> map = new HashMap<>();
		System.out.println("5. " + map.getClass().getName());
		System.out.println();
		
		
		int intSu2 = 1234;
		System.out.println("6. " + (intSu2 + 100));
		String strSu2 = intSu2 + "";
		System.out.println("7. " + (strSu2 + 100));
		
		//valueOf() String 객체의 형변환 
		
		String strSu4 = String.valueOf(intSu2);
		System.out.println("8. " + (strSu4 + 100));
		
		strSu4 = String.valueOf(1234.0);
		strSu4 = String.valueOf(false);
		strSu4 = String.valueOf(1234L);
		strSu4 = String.valueOf(1234.0F);
		System.out.println("9. " + strSu4);
		
		String strSu3 = String.valueOf(intSu2);
		int intSu3 = Integer.parseInt(strSu3);
		System.out.println("10. " + (intSu3 + 100));
		
		
		
		
		
	}
}
