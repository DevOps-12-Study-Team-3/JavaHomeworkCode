package chap99_homework.homework10;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import chap19_generic.box.Box;

public class basic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 2.
		System.out.println(add(12,1));
		
		// 3.
		List<Integer> intList = new ArrayList<>();
		
		intList.add(1);
		intList.add(2);
		intList.add(3);
		intList.add(4);
		intList.add(5);
		
		System.out.println(Sum(intList));
		
		// 4.
		Integer[] intArray = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        printArr(intArray);
	}
	
	
//2. public static <T> String add(T t1, T t2) 제네릭 메소드를 정의하고 
//매개변수로 어떤 값이 들어오던 문자열 결합연산이 돼서 스트링값으로 리턴하도록 만드세요.	
	
	public static <T> String add(T t1, T t2) {
		return String.valueOf(t1) + String.valueOf(t2);
	}
//3. public static Integer sum(List<?> list) 와일드 카드를 
//이용하여 리스트의 총합을 구하는 메소드를 구현하세요.	
	public static Integer Sum(List<?> wildCardList) {

		int sum = 0;
		
		for(int i = 0; i < wildCardList.size(); i++) {
			sum += (int)wildCardList.get(i);
		}
		
		return sum;
		}	

//4. 어떤 배열이던지 받아서 인덱스가 3의 배수인 요소만 출력하는 
//메소드 void printArr을 구현하세요.
   public static <T> void printArr(T[] array) {
        for (int i = 1; i < array.length; i++) {
            if (i % 3 == 0) { // 인덱스가 3의 배수인 경우
                System.out.println(array[i]);
            }
	   }
	}
   
  
   
   
	
			
}
