package api05_Wrapper;

// Wrapper클래스 : 기본 타입을 참조타입으로 변형(Boxing), 참조타입을 기본타입으로 변형(UnBoxing)
public class Test1 {
	public static void main(String[] args) {
		int intSu1 = 100, intSu2 = 200;
		System.out.println("1. " + (intSu1 + 100));
		
		//정수형 Boxing : int -> Integer 
		Integer objSu1 = new Integer(intSu1);
		Integer objSu2 = intSu1;
		
		System.out.println("2-1. " + (objSu1 + 100 ));
		System.out.println("2-2. " + (objSu2 + 100 ));
		
		//정수형 UnBoxing : Integer -> int
		int intSu3 = objSu2;
		System.out.println("3-1. " + (intSu3 + 100 ));
		System.out.println("3-2. " + (intSu3 + 100 ));
		
		// UnBoxing
		String strInt1 = "123";
		System.out.println("4. " + (Integer.parseInt(strInt1) + 100));
		
		//double <--> Double	
		double dblSu1 = 3.14;
		Double objDblSu2 = new Double(dblSu1);
		objDblSu2 = 123.456;
		System.out.println("5. " + (objDblSu2 + 100) );
	
		int su3 = 100;
		Integer objSu3 = Integer.valueOf(su3);
		System.out.println("6. " + (objSu3 + 100));
	
		int su4 = Integer.valueOf((objSu3));
		System.out.println("7. " +(su4 + 100));
		
	}
}
