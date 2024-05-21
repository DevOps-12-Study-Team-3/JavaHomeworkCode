package myhw.hw0513;

public enum Country {
	KOR("한국", "불고기"),
	CHI("중국", "짜장면"),
	JAP("일본", "초밥"),
	USA("미국", "햄버거");
	
	private String koreanName;
	private String foodName;
	
	Country(String koreanName, String foodName){
		this.koreanName = koreanName;
		this.foodName = foodName;
	}
	
	public String getKoreanName() {
		return this.koreanName;
	}
	
	public String getFoodName() {
		return this.foodName;
	}
	
	public void notifyFood(String country) {
		Country[] cArr = Country.values();
		
		for (Country c : cArr) {
			 if (c.getKoreanName().equals(country)) {
		    System.out.println(country + "의 대표음식은 " + 
		    		c.getFoodName() + "입니다.");
			 }             
			 
	
	

		}
	}
}
