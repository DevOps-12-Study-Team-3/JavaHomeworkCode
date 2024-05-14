package homework.basic11;

public class NumberPrinter {
//	멤버변수로 int num을 가지고 정수형 매개변수를 받아 매개변수로 받아온 값은 num에 저장하고 
//	num~50까지중 3의 배수를 출력하는 메소드 numPrint1(int num)과 
//	num~100까지 숫자 중 5와 7의 공배수를 출력하는 메소드 numPrint2(int num)를 구현하세요. 
	private int num;

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}
	
	public NumberPrinter() {
		
	}
	
	public NumberPrinter(int num) {
		this.num = num;
	}
}
