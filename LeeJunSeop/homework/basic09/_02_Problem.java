package homework.basic09;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

public class _02_Problem {
	public static void main(String[] args) {
		// 2. 이름과 전화번호를 쌍으로 하는 주소록을 HashMap으로 구현하고, 
		// 특정 이름의 전화번호를 조회하는 기능을 구현하세요.
	
		Map<String, String> phoneMap = new HashMap<>();
		
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			int menuNum = mainMenu(sc);
			sc.nextLine();
			
			switch(menuNum) {
			case 1:{
				String name;
				String phoneNum;
				System.out.print("이름 입력 : ");
				name = sc.nextLine();
				System.out.println("전화번호 입력 :");
				phoneNum = sc.nextLine();
				phoneMap.put(name, phoneNum);
				break;
			}
			case 2:{
				String name;
				System.out.print("검색할 이름 입력 : ");
				name = sc.nextLine();
				
				if(phoneMap.containsKey(name)) {
					
					System.out.println("이름 : " + name + ", 전화번호 : " + phoneMap.get(name));
				}
				break;
			}
			case 3:{
				System.out.println("프로그램 종료");
				break;
			}
			default:
			
			}
			if(menuNum == 3) break;
		}
		
		sc.close();
	}
	
	public static int mainMenu(Scanner sc) {
		
		System.out.println("---------------------------");
		System.out.println("1. 전화번호 등록");
		System.out.println("2. 전화번호 조회");
		System.out.println("3. 종료");
		
		return sc.nextInt();
	}
}
