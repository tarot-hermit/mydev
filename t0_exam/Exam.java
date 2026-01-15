package t0_exam;

public class Exam {
	public static void main(String[] args) {
	
	  for (int i = 1; i <= 99; i++) {
      int n = i;
      int clapCount = 0;

      while (n > 0) {
          int clap = n % 10; 
          if (clap == 3 || clap == 6 || clap == 9) {
              clapCount++;
          }
          n = n / 10;
      }
      if (clapCount > 0) {
          System.out.print(i + " : ");
          for (int k = 0; k < clapCount; k++) {
              System.out.print("짝");
          }
          System.out.println();
      }
	  }
	}
}