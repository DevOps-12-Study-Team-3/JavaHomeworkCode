package homework.basic10;

public class _05_Problem {
	public static void main(String[] args) {
//		5. Number를 상속받은 클래스타입의 배열만 받아서 배열의 최소값을 구해서 리턴하는 메소드 getMin을 구현하세요.
		Integer[] intArr = {4,1,5,6,3,6,8,2};	
		System.out.println(getMin(intArr));
		
	}
	
	public static <T extends Number> T getMin(T[] arr) {
		T t = arr[0];
		
		for(int i = 0; i < arr.length; ++i) {
			if(t.getClass().getSimpleName().equals("Double")) {
				if(t.doubleValue() > arr[i].doubleValue()) t = arr[i];
			}else if(t.getClass().getSimpleName().equals("Float")) {
				if(t.floatValue() > arr[i].floatValue()) t = arr[i];
			}else if(t.getClass().getSimpleName().equals("Long")) {
				if(t.longValue() > arr[i].longValue()) t = arr[i];
			}else if(t.getClass().getSimpleName().equals("Integer")) {
				if(t.intValue() > arr[i].intValue()) t = arr[i];
			}else if(t.getClass().getSimpleName().equals("Short")) {
				if(t.shortValue() > arr[i].shortValue()) t = arr[i];
			}else{
				if(t.byteValue() > arr[i].byteValue()) t = arr[i];
			}
		}
		
		return t;
	}
	
}
