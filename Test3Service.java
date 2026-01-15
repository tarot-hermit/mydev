package api01_Object;

public class Test3Service {

	public void setPrint(String name, int age, boolean gender, String job, String address) {
		String sex = getGender(gender);
		
		System.out.println("성명 : " + name);
		System.out.println("나이 : " + age);
		System.out.println("성별 : " + sex);
		System.out.println("직업 : " + job);
		System.out.println("주소 : " + address);	
	}

	private String getGender(boolean gender) {
		
		return gender ?"남자" :"여자" ;
	}

	public Test3vo setPrint2(Test3vo vo) {
		System.out.println("vo의 시작 : " + vo.toString());
		vo.setSex(getGender(vo.isGender()));
		System.out.println("성명 : " + vo.getName());
		System.out.println("나이 : " + vo.getAge());
		System.out.println("성별 : " + vo.getSex());
		System.out.println("직업 : " + vo.getJob());
		System.out.println("주소 : " + vo.getAddress());
		
		//vo.setSex(sex);
		
		System.out.println("vo의 끝 : " + vo.toString());
		return vo;
	}

}
