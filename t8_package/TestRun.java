package t8_package;

import t4_method.Test01;
//컨트롤 쉬프트 o 를 누르면 임포트 단축키.
public class TestRun {
	public static void main(String[] args) {
		
		Test01 t1 = new Test01();
		
		int res =	t1.mbc();
		System.out.println("res : " + res);
		
		t1.kbs();
	}
}
