package t9_gettersetter;

public class Test1 {
	// vo 객체
	private String name;
	private int age;
	private String gender;
	private String address;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		if(age < 0) return;
		this.age = age;
	}
	
	public String getGender() {
		if(gender.equals("1")) 		return "남자";
		else return "여자";
	}
	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	

	}
	
