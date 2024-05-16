package MyHomework.hw0514;

public class NumberPrinter {
	private int num;

    public synchronized void numPrint1(int num) {
        this.num = num;
        System.out.println("numPrint1 메소드 실행 - Thread: " + Thread.currentThread().getName());
        for (int i = num; i <= 50; i++) {
            if (i % 3 == 0) {
                System.out.println("numPrint1: " + i);
            }
        }
    }

    public synchronized void numPrint2(int num) {
        this.num = num;
        System.out.println("numPrint2 메소드 실행 - Thread: " + Thread.currentThread().getName());
        for (int i = num; i <= 100; i++) {
            if (i % 5 == 0 && i % 7 == 0) {
                System.out.println("numPrint2: " + i);
            }
        }
    }
}
