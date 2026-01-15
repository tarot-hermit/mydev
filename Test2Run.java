package api01_Object;

// toString
public class Test2Run {
	public static void main(String[] args) {
		
		String name = "김말숙";
		int age = 22;
		boolean gender = false;
		String job = "학생";
		String address = "서울";
		
		Test2Service service = new Test2Service();
		service.setPrint(name, age, gender, job, address);
		
		Test2vo vo = new Test2vo();
		vo.setName("이기자");
		vo.setAge(30);
		//vo.setGender(true);
		vo.setJob("회사원");
		vo.setAddress("청주");
			
		//System.out.println("1.Test2vo [name="+vo.getName()+", age="+vo.getAge()+", gender="+vo.isGender()+", sex="+vo.getSex()+", job="+vo.getJob()+", address="+vo.getAddress()+" ]");
		System.out.println("처리전 :" + vo.toPrint());
		vo = service.setPrint2(vo);
		
		//System.out.println("2.Test2vo [name="+vo.getName()+", age="+vo.getAge()+", gender="+vo.isGender()+", sex="+vo.getSex()+", job="+vo.getJob()+", address="+vo.getAddress()+" ]");
		

		System.out.println("처리후 :" + vo.toPrint());
		//service.voPrint();
		
	}
}
