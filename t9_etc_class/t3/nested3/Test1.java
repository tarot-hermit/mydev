package t9_etc_class.t3.nested3;

public class Test1 {
int su = 300;
	
	public Test1() {
		System.out.println("이곳은 Test1클래스 입니다.");
	}
		
		public void modT1() {
			System.out.println("이곳은 Test1클래스안의 Aa클래스의 modAaT1메소드 입니다. : su ="+ su);
		}
	
		public void modClass() {
			int atom = 100;
			System.out.println("이곳은 Test1클래스안의 Aa클래스의 modAaT1메소드 입니다. : atom ="+ atom);
			
			class Aa {
				
			}	
		}
		public void modClass2() {
			int atom = 100;
			System.out.println("이곳은 Test1클래스안의 Aa클래스의 modClass2메소드 입니다. : atom ="+ atom);
			
			class Aa {
				int suAa = 250;
				
				public Aa() {
					System.out.println("이곳은 Test1클래스안의 Aa클래스의 modClass2메소드 Aa클래스입니다. : suAa ="+ suAa);
				}
				
				public void modClass2Aa() {
					System.out.println("이곳은 Test1클래스안의 Aa클래스의 modClass2메소드 Aa클래스의 modClass2Aa메소드 입니다. : suAa ="+ suAa);					
				}			
			}	
			
			Aa aa = new Aa();
			System.out.println("중첩클래스안의 메소드" +aa.suAa );
			aa.modClass2Aa();
			
		}
	
	}

class Aa {
	public Aa() {
		System.out.println("이곳은 Aa클래스 입니다.");
			}
	}

