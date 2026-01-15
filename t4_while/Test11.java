package t4_while;
// -1+2-3+4-5+6-7+8-9+10 = ?
public class Test11 {
	public static void main(String[] args) {
		
		int i=0, tot=0, s=1;
		
		while(i <10) {
			i++;			//i = i + i
			s *= -1;	// s = s * (-1)
			tot += i*s; // tot = tot + (i*s)
		}
		
		System.out.println("-1+2-3+4-5+6-7+8-9+10 = " + tot );
	}
}
