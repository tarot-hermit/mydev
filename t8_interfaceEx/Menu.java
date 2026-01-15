package t8_interfaceEx;

public interface Menu {
	String[] FOOD = {"두부조림","미역국","요플레","바나나","우유"};
	int[] PRICE = {1000,1000,800,500,500};
	String[] CHOICE_FOOD = new String[FOOD.length];
	int BASIC_PRICE = 500 + 2000; // 쌀밥 + 불고기
	
	void foodCalc (int choice); // 식대 누적메소드
	
	int foodChoice(); // 후식 메뉴 선택
	int getTotal();
	void setTotal(int i);
	

	//__ foodPrint (); // 처리된 식단표 출력메소드
	}

