package api01_Object;

// toString
public class Test3Run {
	public static void main(String[] args) {
		
		String name = "김말숙";
		int age = 22;
		boolean gender = false;
		String job = "학생";
		String address = "서울";
		
		Test3Service service = new Test3Service();
		service.setPrint(name, age, gender, job, address);
		
		Test3vo vo = new Test3vo();
		vo.setName("이기자");
		vo.setAge(30);
		vo.setGender(true);
		vo.setJob("회사원");
		vo.setAddress("청주");
			
		System.out.println("처리전1 :" + vo.toString());
		System.out.println("처리전2 :" + vo);
		vo = service.setPrint2(vo);
		
		System.out.println("처리후1 :" + vo.toString());
		System.out.println("처리후2 :" +vo);
		
	}
}
