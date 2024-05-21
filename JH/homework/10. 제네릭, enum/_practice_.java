package chap00_practice;

public class _practice_ {

	public static void main(String[] args) {
		GenericCla gc = new GenericCla();
		System.out.println(gc.add(13, 43));
		
		// 기본타입 출력 불가?
		String[] strArr = {"hi", "hello", "bye"};
		gc.printArr(strArr);
	}

}
