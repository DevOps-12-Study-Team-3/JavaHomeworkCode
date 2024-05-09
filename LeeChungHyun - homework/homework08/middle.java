package chap99_homework.myself08;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class middle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		1. 사용자가 입력한 날짜(yyyy-MM-dd 형식으로 입력받음)에 add 메소드로 3일뒤로 변경하고
//	     yyyy-MM-dd 형식으로 출력하세요. (SimpleDateFormat 클래스 사용. SimpleDateFormat의
//	     parse() 메소드를 이용하면 String -> Calendar로 변환가능)
		
		Scanner sc = new Scanner(System.in);
		
		// Calendar 객체 생성
		Calendar calendar = Calendar.getInstance();
		
		// "yyyy-MM-dd" 형식을 가지는 SimpleDateFormat 객체 생성
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
		
		System.out.println("날짜(yyyy-MM-dd 형식)를 입력하세요.");
		
		// SimpleDateFormat 의 인스턴스 메소드 .parse(String) 을 이용하면
		// String이 data로 변환되므로 이를 다시 setTime 메소드를 이용하면 Calendar 객체로 변환가능
		// 단 parse 메소드는 throws ParseException 가 있으므로 예외 처리가 강제
		// parse 안에는 원래 String이 매개변수인데 여기서는 sc.nextLine()으로 곧바로 대입
		
		try {
			calendar.setTime(simpleDateFormat.parse(sc.nextLine()));
		}catch(Exception e) {
			System.out.println(" 에러 발생 ");
		}
		
		// 만들어진 Calendar 객체에 3일 추가
		calendar.add(Calendar.DATE, 3);
		
		// 포맷 형식으로 출력하려면 date 객체가 필요하므로 Calendar의 인스턴스 메소드 .getTimeInMillis()
		// 을 이용하면 date 객체로 변환가능
		Date date = new Date(calendar.getTimeInMillis());
		
		// 만들어진 최종 date 객체를 형식에 따라 출력
		System.out.println(simpleDateFormat.format(date));
		
		System.out.println("----------------------");

		
//	2. 길이가 8이며 한글로 된 요일이 저장되어 있는 요일 배열을 만들고
//	   사용자가 입력한 날짜(yyyy-MM-dd 형식으로 입력받음)의 요일을 한글로 출력하세요.
		
		// Calendar.DAY_OF_WEEK 이라는 변수는 1부터 7까지 일요일에서 토요일에 대응하므로 다음과 같은 배열 필요		
		String[] dayArr = {"", "일요일", "월요일", "화요일", "수요일", "목요일", "금요일", "토요일"};
		
		System.out.println("날짜(yyyy-MM-dd 형식)를 입력하세요.");
		
		Calendar calendar3 = Calendar.getInstance();
		
		try {
			calendar3.setTime(simpleDateFormat.parse(sc.nextLine()));
		}catch(Exception e) {
			System.out.println(" 에러 발생 ");
		}
		
		// 나오는 인덱스에 대응하게 요일을 뽑으면 됨
		System.out.println(dayArr[calendar3.get(Calendar.DAY_OF_WEEK)]);
		
		System.out.println("----------------------");
		
//	3. 두 개의 날짜 데이터 2023-03-15 20:31:45와 2021-07-08 11:58:04의 차이를
//	     시 분 초 형태로 나타내시오.
		
		Calendar calendar1 = Calendar.getInstance();
		Calendar calendar2 = Calendar.getInstance();
		
		calendar1.set(2024, 2, 15, 20, 31, 45);
		calendar2.set(2021, 6, 8, 11, 58, 5);
		
		// .getTimeInMillis() 메소드는 특정 시점에서 부터 지나간 시간을 밀리세컨드로 long타입 리턴
		// 둘 차를 구하면 OK
		long diff = calendar1.getTimeInMillis() - calendar2.getTimeInMillis();
		
		long hour = diff / (1000 * 60 * 60);
		
		diff %= 1000 * 60 * 60;
		
		long minute = diff / (1000 * 60);
		
		diff %= 1000 * 60;
		
		long second = diff / (1000);
	
		System.out.println("calendar2부터 calendar1까지 " + hour + " 시간 " +
							minute + " 분 " + second + " 초 가 지났습니다.");
	
	}

}
