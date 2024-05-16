package homework.basic11;

public class _05_Problem {
	public static void main(String[] args) {
//		5. 3, 4번 문제에서 wait와 notify를 이용하여 스레드 두개가 각각 한 번씩 출력하도록 수정하세요.
		NumberPrinterNotifyWait np = new NumberPrinterNotifyWait();
		
		WaitNotifyThread1 numThread1 = new WaitNotifyThread1();
		WaitNotifyThread2 numThread2 = new WaitNotifyThread2();
		
		numThread1.setNumberPrinter(np);
		numThread2.setNumberPrinter(np);
		
		numThread1.start();
		numThread2.start();
	}
}
