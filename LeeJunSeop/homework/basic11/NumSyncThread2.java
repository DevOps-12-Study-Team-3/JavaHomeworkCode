package homework.basic11;

public class NumSyncThread2 extends Thread{
	private NumberPrinterWithSync npws;
	
	public NumSyncThread2() {
		npws = new NumberPrinterWithSync();
	}
	
	public NumSyncThread2(NumberPrinterWithSync npws) {
		this.npws = npws;
	}
	
	public NumberPrinterWithSync getNumberPrinter() {
		return this.npws;
	}
	
	public void setNumberPrinter(NumberPrinterWithSync npws) {
		this.npws = npws;
	}
	
	@Override
	public void run(){
		this.npws.numPrint2(1);
	}
}
