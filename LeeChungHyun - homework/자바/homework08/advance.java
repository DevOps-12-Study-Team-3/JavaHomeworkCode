package chap99_homework.myself08;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class advance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		1. 2001년 12월 19일이 결혼기념일인 부부가 있다. 
//	    윤년이 있는 년도에는 결혼기념일의 날짜를 하루씩 더하기로 했다.
//	    2022년의 결혼기념일 날짜를 구하세요.
		
		Calendar calendar = Calendar.getInstance();
		
		// 2001년 12월 19일 정보 입력. 
		calendar.set(2001, 11, 19);
		
		for(int i = 2002 ; i <= 2022 ; i++) {
			// 당연히 1년이 지나므로 년에는 add 1
			calendar.add(Calendar.YEAR, 1);
			// i 가 윤년인지 아닌지 체크 후 윤년이면 날에만 add 1
			if( i % 400 == 0 || (i % 4 == 0) && ( i % 100 != 0 )) {
				calendar.add(Calendar.DATE, 1);
			}
		}
		
		System.out.println(calendar.get(Calendar.YEAR) + " 년 " + 
						(calendar.get(Calendar.MONTH) + 1) + " 월 " +
						calendar.get(Calendar.DATE) + "일");
		
		System.out.println("----------------------");

//	2. 사용자가 두 개의 날짜(yyyy-MM-dd 형식)를 입력하고 입력받은
//	    두 날짜 사이의 날짜를 모두 출력하세요. (Calendar 클래스를 사용하세요).		
//	    ex) 2023-01-29 2023-02-05 입력
//		출력       2023-01-29
//	             2023-01-30
//	             2023-01-31
//	             2023-02-01
//	             2023-02-02
//	             2023-02-03
//	             2023-02-04
//	             2023-02-05

		
		Scanner sc = new Scanner(System.in);
		
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
		
		Calendar calendar2 = Calendar.getInstance();
		Calendar calendar3 = Calendar.getInstance();
		
		try {
			System.out.println("날짜를 입력하세요.");
			calendar2.setTime(simpleDateFormat.parse(sc.nextLine()));
			System.out.println("날짜를 입력하세요.");
			calendar3.setTime(simpleDateFormat.parse(sc.nextLine()));
		}catch(Exception e) {
			System.out.println(" 에러 발생 ");
		}
		
		// 이제 입력된 날짜를 기준으로 계속 1씩 추가해 나가는데 1씩 추가한 뒤 
		// 년, 월, 일 모두 같을 때까지 추가하면서 주어진 형식으로 프린트
		// 이때 Calendar를 date 객체로 변환해주는 과정이 필요
		
		while(!calendar2.equals(calendar3)) {
			Date date = new Date(calendar2.getTimeInMillis());
			System.out.println(simpleDateFormat.format(date));
			calendar2.add(Calendar.DATE, 1);
		}
		
		Date date = new Date(calendar2.getTimeInMillis());
		System.out.println(simpleDateFormat.format(date));
		
		System.out.println("----------------------");
		
//	3. 사용자가 입력한 5개의 정수를 저장하는 List<Integer>를 생성하고
//	    연속된 두 수의 합이 가장 커지는 구간의 두 수를 출력하세요.
//	    ex) [1, 2, 3, 4, 5] => 4, 5 출력

		System.out.println("숫자를 입력하세요.");
		
		List<Integer> intList = new ArrayList<>();
		
		for(int i = 0 ; i < 5 ; i++) {
			intList.add(sc.nextInt());
		}
		
		// 시작 인덱스 설정 
		int idx = 0;
		
		for(int i = 0 ; i < 3 ; i++) {
			if( intList.get(i) + intList.get(i+1) 
					< intList.get(i+1) + intList.get(i+2)) {
				// i번째와 i+1번째 합보다 i+1번째와 i+2번쨰의 합이 더 큰 경우에 idx를 갱신
				idx = i+1;
			}
		}
		
		System.out.println(intList.get(idx) + ", " + intList.get(idx+1));
		
		System.out.println("----------------------");
		
		
		
//	4. 사용자가 입력한 6개의 정수를 저장하는 List<Integer>를 생성하고
//	    두 수의 합이 유일한 값이 되는 개수를 출력하세요.(중복 숫자 사용불가)
//	    ex) [1, 2, 3, 4, 5, 6] => 총 4개(3, 4, 10, 11)
		
		System.out.println("숫자를 입력하세요.");
		
		List<Integer> intList2 = new ArrayList<>();
		
		for(int i = 0 ; i < 6 ; i++) {
			intList2.add(sc.nextInt());
		}
		
		
		// intList3은 가능한 모든 합을 저장하는 리스트
		List<Integer> intList3 = new ArrayList<>();
		
		for(int i = 0 ; i < 5 ; i++) {
			for(int j = i + 1 ; j < 6 ; j++) {
				intList3.add(intList2.get(i) + intList2.get(j));
			}
		}
		
		// 검사를 쉽게 하기 위해 오름차순으로 정렬
		Collections.sort(intList3);
		
		// 중복아닌 값들의 개수
		// 사실 아래의 intList의 size로도 구할 수는 있음
		int cnt = 0;
		
		// intList4는 중복아닌 값들을 저장해 놓을 새로운 리스트
		List<Integer> intList4 = new ArrayList<>();
		
		for(int i = 0; i < intList3.size() ; i++) {
			// 오름차순으로 정렬되었기 때문에 특정 값이 나오는 첫 인덱스 == 마지막 인덱스 는
			// 중복이 아니라는 것과 동치
			// 중복이 아니면 intList4에 해당 값을 넣고 cnt++
			if( intList3.indexOf(intList3.get(i)) == intList3.lastIndexOf(intList3.get(i))) {
				intList4.add(intList3.get(i));
				cnt ++;
			}else {
				// 효율화를 위해 중복되는게 있으면 검사 다 건너뛰고 마지막 중복되는 마지막 인덱스로 감
				// 이후에 i++ 되면서 새로운 값을 검사할 수 있음
				i = intList3.lastIndexOf(intList3.get(i));
			}
		}
		
		System.out.println("총 " + cnt + " 개 ");
		
		for(Integer i : intList4) {
			System.out.println(i);
		}

	}

}
