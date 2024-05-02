package chap99_homework.myself02;

import java.util.Random;
import java.util.Scanner;

public class RockScissPaper {
	
	private Scanner sc = new Scanner(System.in);
	private Random rd = new Random();

	private boolean isExit = false;
	
	private int gameCnt = 0;
	private int winCnt = 0;
	private int drawCnt = 0;
	private int loseCnt = 0;

	//게임을 시작하는 메소드
	public void start() {
		
		while(!isExit) {
			System.out.println("가위(0), 바위(1), 보(2) 를 내주세요. 3을 내면 종료합니다.");
			int user = sc.nextInt();
			int com = rd.nextInt(3);
			isExit = (user == 3);
			if(isExit) {
				System.out.println("게임을 종료합니다.");
				System.out.println(gameCnt + "전" + winCnt + "승" + drawCnt + "무" + loseCnt + "패");
			}else {
				printUser(user);
				printCom(com);
				judgeWDL(user, com);
			}
		}
	}
	//승무패 판단해주는 메소드
	public void judgeWDL(int user, int com) {
			gameCnt++;
			if((user - com) % 3 == 0) {
				System.out.println("무승부입니다");
				drawCnt ++;
			}else if((user - com) % 3 == 1) {
				System.out.println("승리했습니다");
				winCnt++;
			}else {
				System.out.println("패했습니다");
				loseCnt++;
			}
	}

	//컴퓨터 가위, 바위, 보 출력해주는 메소드
	public void printCom(int com) {
			if(com == 0) {
				System.out.println("컴퓨터는 가위");
			}else if(com == 1) {
				System.out.println("컴퓨터는 바위");
			}else {
				System.out.println("컴퓨터는 보");
			}
	}
	
	//User 가위, 바위, 보 출력해주는 메소드
		public void printUser(int user) {
				if(user == 0) {
					System.out.println("당신은 가위");
				}else if(user == 1) {
					System.out.println("당신은 바위");
				}else {
					System.out.println("당신은 보");
				}
		}
}
