package homework.middle08;

import java.util.Calendar;

public class _03_Problem {
	public static void main(String[] args) {
//		3. 두 개의 날짜 데이터 2023-03-15 20:31:45와 2021-07-08 11:58:04의 차이를
//	     시 분 초 형태로 나타내시오.
		
		Calendar calendar1 = Calendar.getInstance();
		Calendar calendar2 = Calendar.getInstance();
		
		calendar1.set(2023, 2, 15, 20, 31, 45);
		calendar2.set(2021, 6, 8, 11, 58, 4);
		
		long diff = calendar1.getTimeInMillis() - calendar2.getTimeInMillis();
		
		long hour = diff / (1000 * 60 * 60);
		diff %= 1000 * 60 * 60;
		
		long minute = diff / (1000 * 60);
		diff %= 1000 * 60;
		
		long second = diff / 1000;
		
		System.out.println(hour+"시 "+minute+"분 "+second+"초");
		
	}
}
