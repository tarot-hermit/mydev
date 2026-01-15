package t8_interfaceEx;

import java.util.Scanner;

public class MenuRun {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Menu child = new Child();
		
		System.out.println("<원생 점심 식단표 고르기>");
		
		while(true) {
			System.out.println("아이 이름을 입력하세요.");
			String name = sc.next();
				while(true) {
				int choice = 0;
				System.out.println("아이가 먹을 간식을 선택하세요?(기본제공(밥+불고기 = 2500원) ");
				for(int i=0; i<Menu.FOOD.length; i++) {
					System.out.print((i+1) + "."+Menu.FOOD[i] + "("+Menu.PRICE[i]+")" );
				}
				System.out.println("0.종료 ==>");
				choice = sc.nextInt();
				if(choice <= 0 || choice > 5) break;
				
				//boolean check = child.foodCalc(choice-1);
				child.foodCalc(choice-1);
				
				System.out.println(name + "어린이가 선택한 간식은? ");
				int cnt = child.foodChoice();
				System.out.println(cnt + "개의 간식을 선택하셨습니다.");
				System.out.println("현재 식대?" + child.getTotal());
				
				System.out.println("====================");
			}
			System.out.println("작업을 계속하시겠습니까? Y/N");
			String yn = sc.next();
			if(!yn.toUpperCase().equals("Y")) break;
			else { 
				for(int i=0; i<Menu.CHOICE_FOOD.length; i++) {
					Menu.CHOICE_FOOD[i] = null;
					child.setTotal(Menu.BASIC_PRICE);
				}
			}
		}
		System.out.println("\n\n작업을 종료합니다.");
		
		sc.close();
	}
}
