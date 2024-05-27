package chap00_practice;

public class _02_Book {
	public String title;
	public String author;
	public String publisher;
	public int price;
	
	public void SaveInfo(String title, String author, String publisher, int price) {
		this.title = title;
		this.author = author;
		this.publisher = publisher;
		this.price = price;

	}
	
	public void PrintInfo() {
		System.out.println(title + ", " + author + ", " + publisher + ", " + price);
	}
}
