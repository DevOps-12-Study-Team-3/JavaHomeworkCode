package homework.basic10;

import homework.basic10.classes.GenericCla;

public class _01_Problem {
	public static void main(String[] args) {
//		1. 멤버변수로 private T t를 가지면서 getT(), setT() 메소드를 갖는 제네릭클래스 GenericCla를 생성하세요.
		
		GenericCla<Integer> genericCla = new GenericCla(Integer.valueOf(1));
		
		System.out.println(genericCla.getT());
		
		genericCla.setT(3);
		
		System.out.println(genericCla.getT());
	}
	

}
