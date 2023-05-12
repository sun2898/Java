package day13.collection.queue;

public class User implements Comparable<User>{

	private String name;
	private int age;
	
	public User() {
		// TODO Auto-generated constructor stub
	}

	public User(String name, int age) {
		super();
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
	
	@Override
	public String toString() {
		return "User [name=" + name + ", age=" + age + "]";
	}

	@Override
	public int compareTo(User o) {
		//자신과 매개변수로 들어오는 다른 객체의 비교하고 싶은 멤버변수의 값을 비교한다.

		// return 값이 음수면 오름차순, 양수면 내림차순
//		return this.name.compareTo(o.getName()); 
//		return o.getName().compareTo(this.name);
		
		return Integer.compare(this.age, o.getAge()); // 나이 오름차순
//		return Integer.compare(o.getAge(), this.age); // 나이 내림차순
	}
	
	
}
