package homework.homework10.basic;

public enum Country {

	KOR( "한국" , "불고기" ) ,
	CHI( "중국" , "짜장면" ) ,
	JAP( "일본" , "초밥" ) , 
	USA( "미국" , "햄버거" ) ;
	

	private String Country_name ; // 나라이름
	private String Representative_Food ; // 대표음식

	Country( String Country_name   , String Representative_Food  )
	{
		this.Country_name = Country_name ;
		this.Representative_Food = Representative_Food ;	
	}
	
	public String getCountry_name() {
		return Country_name;
	}

	public String getRepresentative_Food() {
		return Representative_Food;
	}

	
	// [ basic ] - 7번문제 
	
	public static void notifyFood(String country) 
	{
	      for ( Country c : Country.values() ) 
	        {
	            if ( c.getCountry_name().equals(country) ) 
	            {
	                System.out.println(country + "의 대표음식은 " + c.getRepresentative_Food() + "입니다.");
	                
	                return;
	            }
	        }
	        System.out.println("해당하는 나라의 대표음식을 찾을 수 없습니다.");
		
	}

	

	
	
	
	
	
	
}
