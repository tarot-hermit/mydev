package t3_use;


public class SinSangRun {
	public static void main(String[] args) {
		SinSangVO vo = new SinSangVO();
		
		vo.setName("홍길동");
		vo.setAge(22);
		vo.setGender(true);
		vo.setAddress("서울");
		
		System.out.println("성명 : " + vo.getName());
		System.out.println("나이 : " + vo.getAge());
		System.out.println("성별 : " + vo.isGender());
		System.out.println("주소 : " + vo.getAddress());
		System.out.println();
		
		SinSangService<SinSangVO> service = new SinSangService<>();
		service.setT(vo);
		System.out.println("신상 : " + service.getT());
		
	}
}
