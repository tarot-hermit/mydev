package api01_Object;

class Aa {
	String name;
	
	 public Aa(String name) {
		this.name = name;
	 }
	 
	 public void modAa() {
		 System.out.println("name : " + name);
	 }
}	 
	 class Bb {
		 String name;
		 
		 public Bb(String name) {
			 this.name = name;
		 }
		 
	 public void modBb() {
		 System.out.println("name : " + name);
	 }
	 
	 @Override
	public boolean equals(Object obj) {
		if(this.name == ((Bb)obj).name) return true;
		else return false;
	}
	 
	 @Override
	public int hashCode() {
		
		return name.hashCode();
	}
}

public class Test1 {
	public static void main(String[] args) {
		Aa aa = new Aa("홍길동");
		aa.modAa();
		
		Bb bb = new Bb("김말숙");
		bb.modBb();
		boolean temp1 = bb.equals(bb);
		System.out.println("temp1 : " + temp1);
		
		int temp2 =bb.hashCode();
		System.out.println("temp2 : " + temp2);
	}
}
