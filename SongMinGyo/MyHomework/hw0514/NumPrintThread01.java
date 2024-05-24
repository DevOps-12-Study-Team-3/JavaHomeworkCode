package MyHomework.hw0514;

public class NumPrintThread01 extends Thread {
	    private NumberPrinter printer;
	    private int num;

	    public NumPrintThread01(NumberPrinter printer, int num) {
	        this.printer = printer;
	        this.num = num;
	    }

	    @Override
	    public void run() {
	        printer.numPrint1(num);
	    }
}
