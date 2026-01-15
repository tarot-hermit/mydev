package t7_static;

public class Test4 {
	static final	String NATION = "korea";
	//static final String jumin; (x)
	 final String jumin;
	//private String name;
	 String name;
	public Test4(String jumin) {
	 this.jumin = jumin;
	}
	
	String getNation() {
		return NATION;
	}
	
	String getJumin() {
		return jumin;
	}
	
	String getName() {
		return name;
	}
}
