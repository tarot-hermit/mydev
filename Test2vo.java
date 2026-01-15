package api01_Object;

public class Test2vo {
	private String name;
	private int age;
	private boolean gender;
	private String job;
	private String address;
	
	private String sex;
	
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
		this.age = age;
	}
	public boolean isGender() {
		return gender;
	}
	public void setGender(boolean gender) {
		this.gender = gender;
	}
	public String getJob() {
		return job;
	}
	public void setJob(String job) {
		this.job = job;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public String toPrint() {
		return "Test2vo [name="+name+", age="+age+", gender="+gender+", sex="+sex+", job="+sex+", address="+address+" ]";
	}
	
}
