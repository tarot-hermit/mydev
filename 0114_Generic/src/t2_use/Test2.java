package t2_use;

class Myclass2<T, V> {
	private T t;
	private V v;
	
	public T getT() {
		return t;
	}
	public void setT(T t) {
		this.t = t;
	}
	public V getV() {
		return v;
	}
	public void setV(V v) {
		this.v = v;
	}
}

public class Test2 {
	public static void main(String[] args) {
		Myclass2<String, Integer> mc1 = new Myclass2<>();
		mc1.setT("나이");
		mc1.setV(25);
		System.out.println(mc1.getT()+" : " + mc1.getV());
		
	}
}
