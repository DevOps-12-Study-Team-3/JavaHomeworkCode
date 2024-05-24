package chap99_homework.myself11;

public class basic {
	public static void main(String args[]) {
	//	1. 메인스레드는 1~20까지 3과 4의 공배수를 출력하는 작업을 하고 1~20까지의 숫자중 30의 약수를 출력하는 서브 스레드를 하나 갖는다. 
	//	각각의 스레드를 실행하십시오.	
		
		Thread thread = new Thread() {
			@Override
			public void run() {
				for(int i = 1 ; i <= 20 ; i ++) {
					if(30 % i == 0) {
						System.out.println(i);
					}
				}
			}
		};
		
		thread.start();
		
	//	2. 1번 문제에서 join()메소드를 이용해서 서브 스레드가 먼저 실행돼서 끝난 후에 메인 스레드가 실행되도록 구현하세요.
		
		try {
			thread.join();
		}catch(InterruptedException ie) {
			System.out.println(ie.getMessage());
		}
	
		for(int i = 1 ; i <= 20 ; i ++) {
			if(i % 3 == 0 & i % 4 == 0) {
				System.out.println(i);
			}
		}
		
		System.out.println("------------------------------------");
		
	//	3. 공유객체로 사용될 클래스 NumberPrinter를 만들고 멤버변수로 int num을 가지고 정수형 매개변수를 받아 매개변수로 받아온 값은 num에 저장하고 
	//	num~50까지중 3의 배수를 출력하는 메소드 numPrint1(int num)과 num~100까지 숫자 중 5와 7의 공배수를 출력하는 메소드 numPrint2(int num)를 
	//	구현하세요. 그리고 공유객체를 사용하며 numPrint1을 호출하는 스레드 클래스 1개와 numPrint2를 호출하는 스레드 클래스 1개를 구현하고 메인스레드에서 
	//	두 개의 스레드를 실행하세요.
		
		NumberPrinter numberPrinter = new NumberPrinter();
		
		PrintNumThread01 printNumThread01 = new PrintNumThread01();
		PrintNumThread02 printNumThread02 = new PrintNumThread02();
		
		
		
		printNumThread01.setNumberprinter(numberPrinter);
		printNumThread02.setNumberprinter(numberPrinter);
		
		printNumThread01.start();
		printNumThread02.start();
		
		
	//	4. 3번 문제에서 첫 스레드의 공유객체 점유가 끝날때까지 두 번째 스레드를 실행하지 못하도록 잠금 상태로 만드세요.
		// 동기화 사용
		
	//	5. 3, 4번 문제에서 wait와 notify를 이용하여 스레드 두개가 각각 한 번씩 출력하도록 수정하세요.
		// wait과 notify는 동기화의 효율성을 늘리기 위한 방법. 무조건 동기화 블록 혹은 동기화 내부 메소드 내에서만 정의
	}
}
