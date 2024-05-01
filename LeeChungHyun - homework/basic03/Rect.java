package chap99_homework.myself03;

public class Rect {
	int width;
	int height;
	
	public void Rect() {
		
	}
	
	public void Rect(int width, int height) {
		this.width = width;
		this.height = height;
	}
	
	public int round() {
		return width + height + width + height;
	}
	
	public int area() {
		return width * height;
	}
}
