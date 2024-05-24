package homework.middle08;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class _01_Problem {
	public static void main(String[] args) {
//		1. 사용자가 입력한 날짜(yyyy-MM-dd 형식으로 입력받음)에 add 메소드로 3일뒤로 변경하고
//	     yyyy-MM-dd 형식으로 출력하세요. (SimpleDateFormat 클래스 사용. SimpleDateFormat의
//	     parse() 메소드를 이용하면 String -> Calendar로 변환가능)
		
		Scanner sc = new Scanner(System.in);
		int year, month, date;
		
		System.out.print("년입력 ");
		year = sc.nextInt();
		System.out.print("월입력 ");
		month = sc.nextInt();
		System.out.print("일입력 ");
		date = sc.nextInt();
		sc.nextLine();
		
		Calendar calendar = Calendar.getInstance();
		calendar.set(Calendar.YEAR, year);
		calendar.set(Calendar.MONTH, month - 1);
		calendar.set(Calendar.DATE, date);
		
		SimpleDateFormat simpleDateFormat1 = new SimpleDateFormat("yyyy-MM-dd");
		
		System.out.print("사용자 입력 : ");
		System.out.println(simpleDateFormat1.format(calendar.getTime()));
		
		calendar.add(Calendar.DATE, 3);
		
		System.out.print("3일 후 : ");
		System.out.println(simpleDateFormat1.format(calendar.getTime()));
		
		sc.close();
		
		
	}
}
