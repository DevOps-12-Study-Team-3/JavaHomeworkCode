package chap99_homework.myself03;

import java.util.Scanner;

public class SmartPhone {
	
	String company;
	int size;
	int color;
	int price;
	
	int[] phoneNumbers;
	String[] userNames;
	int password;
	
	public void reseiveCall(int phoneNumber) {
		for(int i = 0 ; i < phoneNumbers.length ; i++) {
			if(phoneNumbers[i] == phoneNumber) {
				System.out.println(userNames[i] + "으로 부터 전화가 왔습니다.");
				return;
			}
		}
		System.out.println("모르는 사람으로부터 전화가 왔습니다.");
	}
	
	public void sendMessage(String message) {
		System.out.println("보낼 사람을 선택하세요 : ");
		Scanner sc = new Scanner(System.in);
		int index = sc.nextInt();
		System.out.println(userNames[index] + "님에게 메시지를 보냈습니다.");
		System.out.println("발신 내용 : " + message);
	}
	
	public void unLock(int password) {
		int cnt = 0 ;
		while(cnt <= 10){
			cnt++;
			if(password == this.password) {
				System.out.println("비밀번호가 맞습니다.");
				break;
			}else {
				System.out.println("비밀번호" + cnt + "회 틀렸습니다");
			}	
		}
		System.out.println("비밀번호 10회 이상 오류로 잠겼습니다.");
	}
	
	public void phoneInfo() {
		System.out.println("제조사 : " + company);
		System.out.println("사이즈 : " + size);
		System.out.println("색 : " + color);
		System.out.println("가격 : " + price);
	}
	
}
