package MyHomework.hw0514;

public class _basic03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 공유객체로 사용될 클래스 NumberPrinter를 만들고 
		// 멤버변수로 int num을 가지고 정수형 매개변수를 받아 매개변수로 받아온 값은 num에 저장하고 
		// num~50까지중 3의 배수를 출력하는 메소드 numPrint1(int num)과 
		// num~100까지 숫자 중 5와 7의 공배수를 출력하는 메소드 numPrint2(int num)를 구현하세요. 
		// 그리고 공유객체를 사용하며 numPrint1을 호출하는 스레드 클래스 1개와 numPrint2를 호출하는 스레드 클래스 1개를 구현하고 
		// 메인스레드에서 두 개의 스레드를 실행하세요.
		
		  NumberPrinter printer = new NumberPrinter();

	        NumPrintThread01 thread1 = new NumPrintThread01(printer, 1);
	        NumPrintThread02 thread2 = new NumPrintThread02(printer, 1);

	        thread1.start();
	        thread2.start();
	}

}
