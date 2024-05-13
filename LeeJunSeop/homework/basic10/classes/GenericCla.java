package homework.basic10.classes;

public class GenericCla<T> {
//	1. 멤버변수로 private T t를 가지면서 getT(), setT() 메소드를 갖는 제네릭클래스 GenericCla를 생성하세요.
	private T t;
	
	public GenericCla() {
		
	}
	public GenericCla(T t){
		this.t = t;
	}
	
	public T getT() {
		return this.t;
	}
	
	public void setT(T t) {
		this.t = t;
	}
}
