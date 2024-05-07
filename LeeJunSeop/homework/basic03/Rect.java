package homework.basic03;

public class Rect {
//	2. Rect 클래스를 생성하세요. int width, int height를 필드로 갖고
//	기본생성자와 모든 필드를 초기화하는 생성자 두 개를 정의하세요.
//	그리고 사각형의 둘레를 리턴하는 메소드와 사각형의 넓이를 리턴하는 메소드를 구현하세요.
	
	private int width;
	private int height;
	
	public Rect() {
		
	}
	public Rect(int width, int height) {
		this.width = width;
		this.height = height;
	}
	
	public int round() {
		return 2*(width + height);
	}
	
	public int area() {
		return width*height;
	}
}
