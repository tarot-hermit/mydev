package t0_exam;

import java.util.Scanner;

public class Exam01 {
	public static void main(String[] args) {
	  boolean run = true;
    int studentNum = 0;
    int[] scores = null;

    Scanner sc = new Scanner(System.in);

    while (run) {
        System.out.println("--------------------------------------------");
        System.out.println("1.학생수 | 2.점수입력 | 3.점수리스트 | 4.분석 | 5.종료");
        System.out.println("--------------------------------------------");
        System.out.print("선택> ");

        int selectNo = sc.nextInt();

        if (selectNo == 1) {
            // 학생 수 입력
            System.out.print("학생수> ");
            studentNum = sc.nextInt();
            scores = new int[studentNum];

        } else if (selectNo == 2) {
            // 점수 입력
            for (int i = 0; i < scores.length; i++) {
                System.out.print("scores[" + i + "]> ");
                scores[i] = sc.nextInt();
            }

        } else if (selectNo == 3) {
            // 점수 리스트 출력
            for (int i = 0; i < scores.length; i++) {
                System.out.println("scores[" + i + "]: " + scores[i]);
            }

        } else if (selectNo == 4) {
            // 분석 (최고 점수, 평균)
            int max = scores[0];
            int sum = 0;

            for (int score : scores) {
                if (score > max) {
                    max = score;
                }
                sum += score;
            }

            double avg = (double) sum / scores.length;

            System.out.println("최고 점수: " + max);
            System.out.println("평균 점수: " + avg);

        } else if (selectNo == 5) {
            run = false;
        }
    }

    System.out.println("프로그램 종료");
    sc.close();
	}
}
