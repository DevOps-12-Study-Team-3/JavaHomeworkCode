package myhw.hw0509;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.Scanner;

public class _basic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 1. Calendar 객체를 오늘날짜로 생성하세요.
		// 객체의 날짜를 2020년 4월 8일로 변경하고 출력하세요.
		// 위의 객체의 날짜를 add 메소드를 이용해서 5년뒤 2달뒤 3일뒤(동시에)로 변경하고 출력하세요.
		Calendar calendar = Calendar.getInstance();
		System.out.println(calendar.get(Calendar.YEAR) + "." +
				calendar.get(Calendar.MONTH) + "." +
				calendar.get(Calendar.DATE));
		
		Calendar oneDay = Calendar.getInstance();
		oneDay.set(2020, 3, 8); 
		
		System.out.println(oneDay.get(Calendar.YEAR) + "." +
				oneDay.get(Calendar.MONTH) + "." +
				oneDay.get(Calendar.DATE));
		
		
		calendar.add(Calendar.YEAR, 5);
		calendar.add(Calendar.MONTH, 2);
		calendar.add(Calendar.DATE, 3);
		
		System.out.println(calendar.get(Calendar.YEAR) + "." +
				calendar.get(Calendar.MONTH) + "." +
				calendar.get(Calendar.DATE));
	
		
		
		
		// 2. Calendar 객체를 오늘날짜로 생성하세요.
		// 오늘날짜를 2023-03-24 형식으로 출력하세요.
		// 오늘날짜를 2023년 03월 24일 xx시 xx분 xx초 형식으로 출력하세요.
		Calendar calendar2 = Calendar.getInstance();
		System.out.println(calendar2.get(Calendar.YEAR) + "-" +
				((calendar2.get(Calendar.MONTH) + 1) < 10 
						? "0" + (calendar2.get(Calendar.MONTH) + 1)
						: (calendar2.get(Calendar.MONTH) + 1)) + "-" +
				(calendar2.get(Calendar.DATE) < 10
						? "0" + calendar2.get(Calendar.DATE)
						: calendar2.get(Calendar.DATE)) + " " +
				 calendar2.get(Calendar.HOUR_OF_DAY) + "시 " +
				 calendar2.get(Calendar.MINUTE) + "분 " +
				 calendar2.get(Calendar.SECOND) + "초"
				);
		
		
		
		
		

		// 3. 정수형 데이터를 저장할 수 있는 ArrayList를 생성하고 
		// 사용자가 입력한 5개의 정수를 저장하고 출력하세요.
		Scanner sc = new Scanner(System.in);
		System.out.println("5개의 정수를 입력하세요.");
		
		StringBuilder sb = new StringBuilder(sc.nextLine());
		
		List<StringBuilder> sbList = new ArrayList<>();
		
	   for(int i = 0; i < 5; i++) {
		   
	   }

	       


	}

}
