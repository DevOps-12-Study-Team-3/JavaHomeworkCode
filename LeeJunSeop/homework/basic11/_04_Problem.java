package homework.basic11;

public class _04_Problem {
	public static void main(String[] args) {
//		4. 3번 문제에서 첫 스레드의 공유객체 점유가 끝날때까지 두 번째 스레드를 실행하지 못하도록 잠금 상태로 만드세요.
		NumberPrinterWithSync np = new NumberPrinterWithSync();
		
		NumSyncThread1 numThread1 = new NumSyncThread1();
		NumSyncThread2 numThread2 = new NumSyncThread2();
		
		numThread1.setNumberPrinter(np);
		numThread2.setNumberPrinter(np);
		
		numThread1.start();
		numThread2.start();
		
	}
}
