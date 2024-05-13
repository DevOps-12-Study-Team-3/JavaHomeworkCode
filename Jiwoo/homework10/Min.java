package chap99_homework.homework10;


//5. Number를 상속받은 클래스타입의 배열만 받아서 배열의 최소값을 
//구해서 리턴하는 메소드 getMin을 구현하세요. 
public class Min {
	
	public static <T extends Number> T getMin(T[] array) {
		if(array == null || array.length == 0) {
			return null;
		}
		
			T min = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i].doubleValue() < min.doubleValue()) {
                min = array[i];
            }
        }
         return min;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Number[] numbers = {5, 25, 35f, 45};
        Number minNumber = getMin(numbers);
        System.out.println("최소값: " + minNumber);
	}

}
