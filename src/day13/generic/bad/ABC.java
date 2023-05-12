package day13.generic.bad;

public class ABC {

	//제네릭이 없다면?
	//ABC에 뭐든 저장하고 싶다!
	private Object obj;
	
	public void setObj(Object obj) {
		this.obj = obj;
	}
	
	public Object getObj() {
		return obj;
	}
	
}
