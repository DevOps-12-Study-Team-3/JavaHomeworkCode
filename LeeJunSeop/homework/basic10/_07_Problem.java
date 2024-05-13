package homework.basic10;

import homework.basic10.classes.CountryFood;

public class _07_Problem {
	public static void main(String[] args) {
		CountryFood kor = CountryFood.KOR;
		CountryFood chi = CountryFood.CHI;
		CountryFood jap = CountryFood.JAP;
		CountryFood usa = CountryFood.USA;
		
		kor.notifyFood(kor.getCountry());
		chi.notifyFood(chi.getCountry());
		jap.notifyFood(jap.getCountry());
		usa.notifyFood(usa.getCountry());
	}
}
