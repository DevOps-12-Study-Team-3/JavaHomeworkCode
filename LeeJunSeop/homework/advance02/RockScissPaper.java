package homework.advance02;

import java.util.Random;
import java.util.Scanner;

public class RockScissPaper {
//	1. 가위, 바위, 보 게임을 RockScissPaper 클래스로 만드세요.
//	   컴퓨터가 0(가위), 1(바위), 2(보) 중 랜덤값을 하나 선택하고
//	   사용자가 가위, 바위, 보를 입력해서 사용자가 이기면 이겼습니다. 지면 졌습니다. 비기면 비겼습니다.를 출력하세요.
//	     사용자가 3을 입력하면 게임이 종료되면서 몇전 몇승 몇무 몇패인지 출력하세요.
	
	private Scanner sc = new Scanner(System.in);
	private Random rd = new Random();

	private boolean isExit = false;

	private int gameCnt = 0;
	private int winCnt = 0;
	private int drawCnt = 0;
	private int loseCnt = 0;

	//게임을 시작하는 메소드
	public void start() {
		System.out.println("가위 바위 보 게임을 시작합니다");
		int user;
		int com;
		while(true) {
			com = rd.nextInt(3);
			System.out.print("가위바위보 : ");
			String userSelect = sc.nextLine();
			if(userSelect.equals("가위")) user = 0;
			else if(userSelect.equals("바위")) user = 1;
			else if(userSelect.equals("보")) user = 2;
			else if(userSelect.equals("3")) break;
			else continue;
			
			printCom(com);
			
			judgeWDL(user, com);
			
		}
		System.out.println("게임을 종료합니다.");
		System.out.println(winCnt+drawCnt+loseCnt+"전 "+winCnt+"승 "+drawCnt+"무 "+loseCnt+"패");

	}

	

	//승무패 판단해주는 메소드

	public void judgeWDL(int user, int com) {
		if(user == 0) {
			if(com == 0) {
				System.out.println("비겼습니다");
				this.drawCnt++;
			}
			else if(com == 1) {
				 System.out.println("졌습니다");
				 this.loseCnt++;
			}
			else {
				 System.out.println("이겼습니다");
				 this.winCnt++;
			}
		}else if(user == 1) {
			if(com == 0) {
				 System.out.println("이겼습니다");
				 this.winCnt++;
			}
			else if(com == 1) {
				 System.out.println("비겼습니다");
				 this.drawCnt++;
			}
			else {
				 System.out.println("졌습니다");
				 this.loseCnt++;
			}
		}else {
			if(com == 0) {
				 System.out.println("졌습니다");
				 loseCnt++;
			}
			else if(com == 1) {
				 System.out.println("이겼습니다");
				 winCnt++;
			}
			else {
				System.out.println("비겼습니다");
				drawCnt++;
			}
		}
	}

	

	//컴퓨터 가위, 바위, 보 출력해주는 메소드

	public void printCom(int com) {
		if(com == 0) System.out.println("컴퓨터 : 가위");
		else if(com == 1) System.out.println("컴퓨터 : 바위");
		else System.out.println("컴퓨터 : 보");

	}
}
