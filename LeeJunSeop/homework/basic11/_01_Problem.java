package homework.basic11;

public class _01_Problem {
//	1. 메인스레드는 1~20까지 3과 4의 공배수를 출력하는 작업을 하고 
//	1~20까지의 숫자중 30의 약수를 출력하는 서브 스레드를 하나 갖는다. 각각의 스레드를 실행하십시오.
	public static void main(String[] args) {
		int startVal = 1;
		int lastVal = 20;
		Thread thread = new Thread() {
			@Override
			public void run() {
				int num = 30;

				for(int i = startVal; i <= lastVal; ++i) {
					if(num % i == 0) System.out.println(i+"는 "+num+"의 약수");
					try {
						Thread.sleep(500);
					} catch(InterruptedException ie) {
						System.out.println(ie.getMessage());
					}
				}
			}
		};

		thread.start();
		
		for(int i = startVal; i <= lastVal; ++i) {
			if(i % 3 == 0 && i % 4 == 0) System.out.println(i+"는 3과 4의 공배수");
			try {
				Thread.sleep(500);
			} catch(InterruptedException ie) {
				System.out.println(ie.getMessage());
			}
		}
		
	}
}
