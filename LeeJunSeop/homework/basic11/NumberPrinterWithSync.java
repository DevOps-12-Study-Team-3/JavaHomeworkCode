package homework.basic11;

public class NumberPrinterWithSync {
	private int num;

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}
	
	public NumberPrinterWithSync() {
		
	}
	
	public NumberPrinterWithSync(int num) {
		this.num = num;
	}
	
	public synchronized void numPrint1(int num) {
		for(int i = num; i <= 50; ++i) {
			if(i % 3 == 0) System.out.println(i+"는 3의 배수");
			try {
				Thread.sleep(100);
			}catch(InterruptedException ie) {
				System.out.println(ie.getMessage());
			}
		}
	}
	
	public void numPrint2(int num) {
		synchronized(this) {
			for(int i = num; i <= 100; ++i) {
				if(i % 5 == 0 && i % 7 == 0) System.out.println(i+"는 5와 7의 공배수");
			}
		}
	}
}
