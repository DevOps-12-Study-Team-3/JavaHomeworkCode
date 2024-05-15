package homework.basic11;

public class WaitNotifyThread1 extends Thread{
	private NumberPrinterNotifyWait npnw;
	
	public WaitNotifyThread1() {
		npnw = new NumberPrinterNotifyWait();
	}
	
	public WaitNotifyThread1(NumberPrinterNotifyWait npnw) {
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
		this.npnw.numPrint1(1);
	}
}
