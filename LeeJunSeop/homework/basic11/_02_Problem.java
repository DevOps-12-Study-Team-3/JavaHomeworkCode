package homework.basic11;

public class _02_Problem {
//	2. 1번 문제에서 join()메소드를 이용해서 서브 스레드가 먼저 실행돼서 끝난 후에 메인 스레드가 실행되도록 구현하세요.
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
						Thread.sleep(100);
					} catch(InterruptedException ie) {
						System.out.println(ie.getMessage());
					}
				}
			}
		};
		
		thread.start();
		try {
			thread.join();
		}catch(InterruptedException ie) {
			System.out.println(ie.getMessage());
		}

		
		for(int i = startVal; i <= lastVal; ++i) {
			if(i % 3 == 0 && i % 4 == 0) System.out.println(i+"는 3과 4의 공배수");
			try {
				Thread.sleep(100);
			} catch(InterruptedException ie) {
				System.out.println(ie.getMessage());
			}
		}


		
	}
}
