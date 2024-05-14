package chap99_homework.myself11;

public class NumberPrinter {
	//	3. 공유객체로 사용될 클래스 NumberPrinter를 만들고 멤버변수로 int num을 가지고 정수형 매개변수를 받아 매개변수로 받아온 값은 num에 저장하고 
	//	num~50까지중 3의 배수를 출력하는 메소드 numPrint1(int num)과 num~100까지 숫자 중 5와 7의 공배수를 출력하는 메소드 numPrint2(int num)를 
	//	구현하세요. 그리고 공유객체를 사용하며 numPrint1을 호출하는 스레드 클래스 1개와 numPrint2를 호출하는 스레드 클래스 1개를 구현하고 메인스레드에서 
	//	두 개의 스레드를 실행하세요.
	
	//	4. 3번 문제에서 첫 스레드의 공유객체 점유가 끝날때까지 두 번째 스레드를 실행하지 못하도록 잠금 상태로 만드세요.
	
	private int num;
	
	public void setNum(int num) {
		this.num = num;
	}

	public synchronized void numPrint1(int num) {
		this.setNum(num);
		for(int i = num ; i <= 50 ; i++) {
			if( i % 3 == 0) {
				System.out.println("numPrint1 : " + i);
				
				notify();
				
				try {
					wait();
				} catch(InterruptedException ie) {
					System.out.println(ie.getMessage());
				}
			}
		}
	}
	
	public synchronized void numPrint2(int num) {
		this.setNum(num);
		for(int i = num ; i <= 100 ; i++) {
			if( i % 5 == 0 && i % 7 == 0) {
				System.out.println("numPrint2 : " + i);
				
				notify();
				
				try {
					wait();
				} catch(InterruptedException ie) {
					System.out.println(ie.getMessage());
				}
			}
		}
	}
	
}
