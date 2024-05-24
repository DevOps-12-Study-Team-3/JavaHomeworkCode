package homework.homework12.chap02;

public class Book {

	public String Book_name ; // 책이름
	
	public String Book_author ; // 책 저자	
	
	public String Book_company ; // 책 출판사
	
	public int Book_Price ; // 책 가격

	public String getBook_name() {
		return Book_name;
	}

	public void setBook_name(String book_name) {
		Book_name = book_name;
	}

	public String getBook_author() {
		return Book_author;
	}

	public void setBook_author(String book_author) {
		Book_author = book_author;
	}

	public String getBook_company() {
		return Book_company;
	}

	public void setBook_company(String book_company) {
		Book_company = book_company;
	}

	public int getBook_Price() {
		return Book_Price;
	}

	public void setBook_Price(int book_Price) {
		Book_Price = book_Price;
	}

	public void Book_info_save( String Book_name , String Book_author , String Book_company , int Book_Price )
	{
		this.Book_name = Book_name ;
		this.Book_author = Book_author ;
		this.Book_company = Book_company ;
		this.Book_Price = Book_Price;
	}
	
	public void Book_info_print()
	{
		System.out.println( "도서 제목 : " + getBook_name() );
		System.out.println( "도서 저자 : " + getBook_author() );
		System.out.println( "도서 출판사 : " + getBook_company());
		System.out.println( "도서 가격 : " + getBook_Price() + "원");


	}
	

	
	
	
} 
