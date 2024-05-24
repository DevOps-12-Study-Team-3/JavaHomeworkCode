package chap99_homework.myself12;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class middle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		1. 두 개의 StringBuilder 값을 매개변수로 받아 두 개의 값을 합친 후 역순으로 바꿔서 리턴하는 combineStrBuilder를 람다식으로 구현하세요.
//		StringBuilderUtils 함수형 인터페이스 선언, StringBuilder combineStrBuilder(StringBuilder sb1, StringBuilder sb2) 
//		추상메소드 선언
		
		System.out.println(combineStr((sb1, sb2) -> sb1.append(sb2).reverse()));
//
//		2. 2번 문제에서 StringBuilder 두 개를 합치는 메소드 appendSb와 역순으로 변경하는 메소드 reverseSb를 각각 선언하고 StringBuilder의 
//		메소드를 참조하여 combineStrBuilder 각각 구현하세요.
		
		StringBuilder sb = new StringBuilder();
		
		System.out.println(reverseSb(appendSb(StringBuilder :: append), StringBuilder :: reverse));
//
//		3. 매개변수로 받아온 정수 배열에서 최대값, 최소값, 중간값을 구하는 static 메소드 getMax, getMin, getMid를 갖는 클래스 IntArrUtils를 
//		구현하고 maxOrMinOrMid라는 메소드를 갖는 함수형 인터페이스 MaxMinMid를 만들고 람다식으로 IntArrUtils의 메소드를 참조하여 구현하세요.
		
		int max = IntArrUtils.getMax(new int[] {3,5,4,2,1}, intArr -> {
	        List<Integer> intList = new ArrayList<>();
	        for(int i = 0 ; i < intArr.length ; i++) {
	        	intList.add(intArr[i]);
	        }
	        intList.sort(null);
	        return intList.get(intArr.length-1);
		});
		
		System.out.println(max);
		
		int min = IntArrUtils.getMin(new int[] {3,5,4,2,1}, intArr -> {
	        List<Integer> intList = new ArrayList<>();
	        for(int i = 0 ; i < intArr.length ; i++) {
	        	intList.add(intArr[i]);
	        }
	        intList.sort(null);
	        return intList.get(0);
		});
		
		System.out.println(min);
		
		int mid = IntArrUtils.getMid(new int[] {3,5,4,2,1}, intArr -> {
	        List<Integer> intList = new ArrayList<>();
	        for(int i = 0 ; i < intArr.length ; i++) {
	        	intList.add(intArr[i]);
	        }
	        intList.sort(null);
	        return intList.get(intArr.length / 2);
		});
		
		System.out.println(mid);
		
	}

	public static StringBuilder combineStr(StringBuilderUtils stringBuilderUtils) {
		return stringBuilderUtils.combineStrBuilder(new StringBuilder ("1234"), new StringBuilder ("1234"));
	}
	
	public static StringBuilder appendSb(StringBuilderUtils stringBuilderUtils) {
		return stringBuilderUtils.combineStrBuilder(new StringBuilder ("1234"), new StringBuilder ("1234"));
	}
	
	public static StringBuilder reverseSb(StringBuilder sb, ReverseStr reverseStr) {
		return reverseStr.reverseStrBuilder(sb);
	}
	
}
