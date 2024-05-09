package homework.middle08;

import java.util.Calendar;
import java.util.Scanner;

public class _02_Problem {
	public static void main(String[] args) {
//		2. 길이가 8이며 한글로 된 요일이 저장되어 있는 요일 배열을 만들고
//		   사용자가 입력한 날짜(yyyy-MM-dd 형식으로 입력받음)의 요일을 한글로 출력하세요.
		
		String[] dayOfWeekStrArr = {"", "일요일", "월요일", "화요일", "수요일", "목요일", "금요일", "토요일"};
		
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
		calendar.set(year, month - 1, date);
		System.out.println(dayOfWeekStrArr[calendar.get(Calendar.DAY_OF_WEEK)]);
		
		sc.close();
	}
}
