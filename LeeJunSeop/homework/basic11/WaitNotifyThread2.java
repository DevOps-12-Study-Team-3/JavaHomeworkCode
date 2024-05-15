package homework.basic11;

public class WaitNotifyThread2 extends Thread{
	private NumberPrinterNotifyWait npnw;
	
	public WaitNotifyThread2() {
		npnw = new NumberPrinterNotifyWait();
	}
	
	public WaitNotifyThread2(NumberPrinterNotifyWait npnw) {
		this.npnw = npnw;
	}
	
	public NumberPrinterNotifyWait getNumberPrinter() {
		return this.npnw;
	}
	
	public void setNumberPrinter(NumberPrinterNotifyWait npnw) {
		this.npnw = npnw;
	}
	
	@Override
	public void run(){
		this.npnw.numPrint2(1);
	}
}
