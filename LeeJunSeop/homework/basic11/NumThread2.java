package homework.basic11;

public class NumThread2 extends Thread{
	private NumberPrinter np;
	
	public NumThread2() {
		np = new NumberPrinter();
	}
	
	public NumThread2(NumberPrinter np) {
		this.np = np;
	}
	
	public NumberPrinter getNumberPrinter() {
		return this.np;
	}
	
	public void setNumberPrinter(NumberPrinter np) {
		this.np = np;
	}
	
	@Override
	public void run(){
		this.np.numPrint2(1);
	}
}
