
public class Pies {
	
	private int height;
	private String name;
	private int age;
	
	public Pies () {
		
	}
	
	public Pies(int height, String name, int age) {
		super();
		this.height = height;
		this.name = name;
		this.age = age;
	}



	public void bark() {
		if(height > 23) {
			System.out.println("Houu!");
		} else if (height > 6) {
			System.out.println("Chau!");
		} else { 
			System.out.println("Hiau!");
		}
		
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
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

	@Override
	public String toString() {
		return "Pies [height=" + height + ", name=" + name + ", age=" + age + "]";
	}


}
