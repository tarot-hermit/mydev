package t2_ArrayList;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Test4 {
	public static void main(String[] args) {
		
		List<SinSangVO> vos = new ArrayList<>();
		
		SinSangVO vo = new SinSangVO();
		
		vo.setName("홍길동");
		vo.setAge(25);
		vo.setGender(true);
		vo.setAddress("서울");
		vos.add(vo);
			
		vo.setName("김말숙");
		vo.setAge(22);
		vo.setGender(false);
		vo.setAddress("청주");
		vos.add(vo);
		System.out.println("1.vos 의 size : " + vos.size());
		System.out.println("==================");
		
		// 향상된 for문
		for(SinSangVO v : vos) {
			System.out.println(v);
		}
		System.out.println();
		
		//일반 for문
		for(int i=0; i<vos.size(); i++) {
			System.out.println(vos.get(i));
		}
	
		
		// 반복지시자(Iterator)
		Iterator<SinSangVO> it = vos.iterator();
		while(it.hasNext()) {
			vo = it.next();
			System.out.println(vo);
		}
		
//		Stream<SinSangVO> stream = vos.stream();
//		stream.forEach(v -> System.out.println(v));
	}
}
