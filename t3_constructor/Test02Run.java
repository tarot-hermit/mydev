package t3_constructor;

public class Test02Run {
	public static void main(String[] args) {
		Test02_2 t21 = new Test02_2("그랜져");
		System.out.println("모델 : " + t21.model);
		System.out.println("색상 : " + t21.color);
		System.out.println("스피드 : " + t21.speed);
		System.out.println();

		Test02_2 t22 = new Test02_2("그랜져", "은색");
		System.out.println("모델 : " + t22.model);
		System.out.println("색상 : " + t22.color);
		System.out.println("스피드 : " + t22.speed);
		System.out.println();
		
		Test02_2 t23 = new Test02_2("그랜져", "은색", 300);
		System.out.println("모델 : " + t23.model);
		System.out.println("색상 : " + t23.color);
		System.out.println("스피드 : " + t23.speed);
		System.out.println();
	}

}

