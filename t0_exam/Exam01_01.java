package t0_exam;

import java.util.Scanner;

public class Exam01_01 {
	public static void main(String[] args) {
		boolean run = true;
		int num = 0;
		int[] scores = null;		
		Scanner sc = new Scanner(System.in);
		
		while (run ) {
			System.out.println("---------------------------------------------");
			System.out.println("1.학생수 ㅣ 2.점수입력 ㅣ 3.점수리스트 ㅣ 4.분석 ㅣ 5.종료");
			System.out.println("---------------------------------------------");
			System.out.println("선택>");
			
			int selec = sc.nextInt();
			
			if (selec == 1) {
				
				System.out.println("학생수>");
				num = sc.nextInt();
				scores = new int[num];
			
			} else if (selec == 2 ) {
				
				for (int i =0; i < scores.length; i++) {
					System.out.println("scores[" + i + "]>");
					scores[i] = sc.nextInt();				
				} 
			}	else if (selec == 3 ) {
					
					for (int i =0; i < scores.length; i++) {
						System.out.println("scores[" + i + "]:" + scores[i] );		
					}
			}	else if (selec == 4) {
				int max = scores[0];
				int sum = 0;
				
				for(int score : scores) {
					if (score > max) {
						max = score;
					}
					sum += score;
				}
				double avg = (double) sum / scores.length;
				
				System.out.println("최고 점수 : "  + max);
				System.out.println("평균 점수 : " + avg);

			} else if (selec == 5) {
				run = false;
				}
			}
		
		System.out.println("프로그램 종료");
		sc.close();
		}
	}

			
		
		
	

