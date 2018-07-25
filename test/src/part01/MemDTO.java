package part01;

public class MemDTO {
	private String name;
	private int age;
	
	public MemDTO() {
	
	}

	public MemDTO(String name, int age) {
		this.name = name;
		this.age = age;
	}


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
	
	
}
