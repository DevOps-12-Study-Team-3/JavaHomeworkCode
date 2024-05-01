package homework.middle03;

public class PhoneInfo {
//	1. PhoneInfo 클래스를 생성하세요.
	String[] names = new String[100];
	String[] phoneNums = new String[100];

	int index = 0;

	public void insertPhoneInfo(String name, String phoneNum) {
	    //매개변수로 전달된 이름과 번호를 각각의 배열에 저장하는 기능 구현
		for(int i = 0; i < names.length; ++i) {
			names[i] = name;
			phoneNums[i] = phoneNum;
		}
	}

	public void printAllPhoneInfo() {
	    //배열에 저장된 모든 이름과 번호를 순서대로 출력하는 기능 구현
		for(int i = 0; i < names.length; ++i) {
			printPhoneInfo(i);
		}
	}

	public void printPhoneInfo(int index) {
	    //매개변수로 전달된 인덱스에 해당하는 이름과 번호 출력하는 기능 구현
		System.out.println(index+"번째 이름 : " + names[index] + ", 번호 : " + phoneNums[index]);
	}
}
