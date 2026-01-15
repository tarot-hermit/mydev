package t8_interfaceEx;

public class Child implements Menu {
	private int total = BASIC_PRICE;
	@Override
	public void foodCalc(int choice) {	
		CHOICE_FOOD[choice] = FOOD[choice];
		total += PRICE[choice];
					
		}
	@Override
	public int foodChoice() {
		int cnt = 0;
		for(int i=0; i<CHOICE_FOOD.length; i++) {
			if(CHOICE_FOOD[i] != null) {
				System.out.println(CHOICE_FOOD[i] + "\t");
				cnt++;
			}
		}
		return cnt;
	}
	
	@Override
	public int getTotal() {
		return total;
	}
	@Override
	public void setTotal(int total) {
		this.total = total;
	}
}
