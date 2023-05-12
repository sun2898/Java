package day12.api.lang.object;

public class Person implements Cloneable{

	//모든 클래스는 Object class를 상속받는다.
	
	private String name;
	private int age;
	
	public Person(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public boolean equals(Object obj) {
		//객체의 name 멤버변수의 값이 같다면 TRUE 반환
		
		if(obj instanceof Person) {
			Person p = (Person)obj;
			
			if(p.getName() != null) {
				if(p.getName().equals(this.name)) {
					return true;
				}
			}
		}
		
		return false;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}

	@Override
	protected void finalize() throws Throwable {
		//객체가 사라지는 시점에서 자동으로 실행 
		System.out.println(this.name + "님이 소멸되었습니다.");
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		//객체 복사 메서드
		//clone()을 오버라이드 하면 외부에서 사용이 가능해진다.
		//Cloneable 인터페이스를 상속받아야 사용 가능
		return super.clone();
	}
	
	
	
	
	 
	
	
	
}
