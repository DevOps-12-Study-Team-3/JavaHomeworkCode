package MyHomework.hw0514;

public class NumPrintThread02 extends Thread {
	    private NumberPrinter printer;
	    private int num;

	    public NumPrintThread02(NumberPrinter printer, int num) {
	        this.printer = printer;
	        this.num = num;
	    }

	    @Override
	    public void run() {
	        printer.numPrint2(num);
	    }
	
}
