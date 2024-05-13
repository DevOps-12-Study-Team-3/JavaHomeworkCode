package chap99_homework.myself10;

public enum Month {
	
//	1. 12달을 상수로 만들어서 enum을 선언하고 첫 번째 값은 평년일 때 그 달의 일수 두 번째 값은 윤년일 때 그 달의 일수로 설정하고 
//	사용자가 년도를 입력하면 해당 년도의 1, 2, 3, 4, 5월의 일수의 총합을 출력하는 메소드를 구현하세요. sumDays(int year)
	
	JAN(31,31), 
	FEB(28,29), 
	MAR(31,31), 
	APR(30,30), 
	MAY(31,31), 
	JUN(30,30), 
	JUL(31,31), 
	AUG(31,31), 
	SEP(30,30), 
	OCT(31,31), 
	NOV(30,30), 
	DEC(31,31);
	
	private int dateNum;
	private int dateNumLeap;

	Month(int dateNum, int dateNumLeap){
		this.dateNum = dateNum;
		this.dateNumLeap = dateNumLeap;
	}
	
	public static void sumDays(int year) {
		Month[] monthArr = Month.values();
		int sum = 0;
		
		if(year % 400 == 0 || (year % 4 == 0 && year % 100 != 0)) {
			for(int i = 0; i < 5 ; i++) {
				sum += monthArr[i].dateNumLeap;
			}
		}else {
			for(int i = 0; i < 5 ; i++) {
				sum += monthArr[i].dateNum;
			}
		}
		System.out.println(year + "년의 1월부터 5월까지의 일수 합은 " + sum + "일 입니다." );
	}
	
}

