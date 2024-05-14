package homework.advance10;

public enum Month {
//	1. 12달을 상수로 만들어서 enum을 선언하고 첫 번째 값은 평년일 때 
//	그 달의 일수 두 번째 값은 윤년일 때 그 달의 일수로 설정하고 사용자가 년도를 입력하면 
//	해당 년도의 1, 2, 3, 4, 5월의 일수의 총합을 출력하는 메소드를 구현하세요. sumDays(int year)
	JAN(31, 31),
	FEB(28, 29),
	MAR(31, 31),
	APR(30, 30),
	MAY(31, 31),
	JUN(30, 30),
	JUL(31, 31),
	AUG(31, 31),
	SEP(30, 30),
	OCT(31, 31),
	NOV(30, 30),
	DEC(31, 31);
	
	private int[] days;
	
	private Month(int day1, int day2) {
		days = new int[2];
		days[0] = day1;
		days[1] = day2;
	}

	public int[] getDays() {
		return days;
	}
//
//	public void setDays(int[] days) {
//		this.days = days;
//	}
	
	public void sumDays(int year) {
		int uptoMonth = 5;
		int posIdx = 0;
		int sum = 0;
		if(isLeapYear(year)) posIdx = 1;
		
		for(int i = 0; i < uptoMonth; ++i) {
			sum += Month.values()[i].getDays()[posIdx];
		}
		
		System.out.println(year + "년도의 1, 2, 3, 4, 5월의 일수의 총합 : " + sum );
	}
	
	private boolean isLeapYear(int year) {
		if(year % 400 == 0 || (year % 4 == 0 && year % 100 != 0)) return true;
		else return false;
	}
	
}
