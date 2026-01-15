package t0_Bunsik;

public class Run {
	public static void main(String[] args) {
		Bonsa[] shops = new Bonsa[3];
		
		shops[0] = new WangjaBunsik("왕자분식");
		shops[1] = new SeoulBunsik("서울분식");
		shops[2] = new WoojuBunsik("우주분식");
		
		for(Bonsa shop : shops) {
			System.out.println("\n===  "+shop.name +"메뉴판");
			System.out.println("==김치찌개==");
			shop.kimch();
			System.out.println("==부대찌개==");
			shop.budea();
			System.out.println("==비빔밥==");
			shop.bibim();
			System.out.println("==순대국==");
			shop.sundea();
			System.out.println("==공기밥==");
			shop.gong();
			
			
		}
		
	}
	
}
	
