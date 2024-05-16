package homework.basic11;

public class NumThread1 extends Thread{
	private NumberPrinter np;
	
	public NumThread1() {
		np = new NumberPrinter();
	}
	
	public NumThread1(NumberPrinter np) {
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
		this.np.numPrint1(1);
	}
}
