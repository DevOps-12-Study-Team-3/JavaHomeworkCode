package chap99_homework.myself08;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class basic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		1. Calendar 객체를 오늘날짜로 생성하세요.
//		   객체의 날짜를 2020년 4월 8일로 변경하고 출력하세요.
//		   위의 객체의 날짜를 add 메소드를 이용해서 5년뒤 2달뒤 3일뒤(동시에)로 변경하고 출력하세요.
		
		// Calendar 객체 생성
		Calendar calendar = Calendar.getInstance(); 
		
		// calendar 객체에 2020년 4월 8일 정보 저장
		calendar.set(2020, 3, 8); 
		
		System.out.println(calendar.get(Calendar.YEAR) + " 년 " + 
						(calendar.get(Calendar.MONTH) + 1) + " 월 " +
						calendar.get(Calendar.DATE) + "일");
		
		// calendar에 5년뒤 2달뒤 3일뒤 add
		calendar.add(Calendar.YEAR, 5);
		calendar.add(Calendar.MONTH, 2);
		calendar.add(Calendar.DATE, 3);
		
		System.out.println(calendar.get(Calendar.YEAR) + " 년 " + 
				(calendar.get(Calendar.MONTH) + 1) + " 월 " +
				calendar.get(Calendar.DATE) + "일");

		System.out.println("--------------");
		
//		2. Calendar 객체를 오늘날짜로 생성하세요.
//		   오늘날짜를 2023-03-24 형식으로 출력하세요.
//		   오늘날짜를 2023년 03월 24일 xx시 xx분 xx초 형식으로 출력하세요.
		
		// Calendar 객체 생성 - 디폴트는 오늘 날짜
		Calendar calendar2 = Calendar.getInstance(); 
		
		// 포맷 형식 이용하기 위해 Calendar 객체를 Data 객체로 변경
		Date date = new Date(calendar2.getTimeInMillis()); 
		
		// 포맷 형식 "yyyy-MM-dd"으로 SimpleDateFormat 객체 생성
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd"); 
		
		// date를 형식에 따라 출력
		System.out.println(simpleDateFormat.format(date));
		
		// 포맷 형식 "yyyy년 MM월 dd일 HH시 mm분 ss초"으로 SimpleDateFormat 객체 생성
		SimpleDateFormat simpleDateFormat2 = 
					new SimpleDateFormat("yyyy년 MM월 dd일 HH시 mm분 ss초");
		
		// date를 새로운 형식에 따라 출력
		System.out.println(simpleDateFormat2.format(date));
		
		System.out.println("--------------");
		
//		3. 정수형 데이터를 저장할 수 있는 ArrayList를 생성하고 사용자가 
		// 입력한 5개의 정수를 저장하고 출력하세요.
		
		// 래퍼 클래스로 List 생성
		List<Integer> intList = new ArrayList<Integer>();
		
		Scanner sc = new Scanner(System.in);
		
		// 숫자 받아서 add로 리스트에 추가
		for(int i = 0 ; i < 5 ; i++) {
			System.out.println("숫자를 입력하세요.");
			intList.add(sc.nextInt());
		}
		
		for(Integer i : intList) {
			System.out.println(i);
		}
	}

}
