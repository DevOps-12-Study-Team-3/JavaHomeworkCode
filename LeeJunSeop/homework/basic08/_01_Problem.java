package homework.basic08;

import java.util.Calendar;

public class _01_Problem {
	public static void main(String[] args) {
//		1. Calendar 객체를 오늘날짜로 생성하세요.
//		   객체의 날짜를 2020년 4월 8일로 변경하고 출력하세요.
//		   위의 객체의 날짜를 add 메소드를 이용해서 5년뒤 2달뒤 3일뒤(동시에)로 변경하고 출력하세요.
		
		Calendar calendar = Calendar.getInstance();
		System.out.println(calendar.get(Calendar.YEAR) +"년 " + (calendar.get(Calendar.MONTH) + 1) 
				+ "월 " + calendar.get(Calendar.DATE) +"일");
		
		calendar.set(Calendar.YEAR, 2020);
		calendar.set(Calendar.MONTH, 3);
		calendar.set(Calendar.DATE, 8);
	
		System.out.println(calendar.get(Calendar.YEAR) +"년 " + (calendar.get(Calendar.MONTH) + 1) 
				+ "월 " + calendar.get(Calendar.DATE) +"일");
		
		calendar.add(Calendar.YEAR, 5);
		calendar.add(Calendar.MONTH, 2);
		calendar.add(Calendar.DATE, 3);
		
		System.out.println(calendar.get(Calendar.YEAR) +"년 " + (calendar.get(Calendar.MONTH) + 1) 
				+ "월 " + calendar.get(Calendar.DATE) +"일");
		
		
	}
}
