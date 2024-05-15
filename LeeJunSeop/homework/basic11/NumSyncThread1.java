package homework.basic11;

public class NumSyncThread1 extends Thread{
	private NumberPrinterWithSync npws;
	
	public NumSyncThread1() {
		npws = new NumberPrinterWithSync();
	}
	
	public NumSyncThread1(NumberPrinterWithSync npws) {
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
		this.npws.numPrint1(1);
	}
}
