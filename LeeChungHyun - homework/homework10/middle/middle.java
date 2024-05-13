package chap99_homework.myself10;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class middle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		1. key와 value 모두 Number를 상속받은 클래스만 받고 매개변수로 Map이 주어졌을 때 key, value의 곱이 가장 큰 Entry를 리턴하는 
//		메소드 getMaxMul을 구현하세요.
		
		Map<Integer, Integer> map = new HashMap<>();
		
		map.put(1, 2);
		map.put(3, 4);
		map.put(5, 6);
		map.put(4, 1);
		map.put(6, 0);
		
		System.out.println(getMaxMul(map));
		
		System.out.println("------------------------");
		
//		2.  Number 클래스를 상속받은 클래스만 지정가능한 제네릭 클래스를 만들고 T 배열을 매개변수로 받아서 합, 차, 곱셈, 나눗셈을 연산해주는 
//		메소드를 구현하세요. 각 메소드는 double로 리턴하고 add, sub, mul, div로 메소드명을 갖습니다.(Math.round()로 소수점 두자리까지만 표출)
		
		System.out.println(add (1, 4));
		System.out.println(sub (1, 4));
		System.out.println(mul (1, 4));
		System.out.println(div (1, 100));
		
		System.out.println("------------------------");

//		3. 커피 메뉴를 갖는 enum을 생성하고 AMERICANO, LATTE, MOCHA, COLDBREW 4개로 지정한다. 가격이 값이 되고 순서대로 2000, 3000, 
//		4000, 4500으로 지정한다. 메뉴의 총 가격을 계산하는 추상 메소드를 정의하고 각각의 상수에서 구현하는데 아메리카노(아이스 300 추가), 
//		라떼(아이스 500 추가), 모카(휘핑 1000 추가), 콜드브루(시럽 200 추가) 모든 메뉴 옵션 없는 주문은 지정한 가격대로 진행된다. 
//		totalPrice(int optionOrder, int normalOrder) 옵션 추가 잔수와 일반 메뉴 잔수를 받아서 각 메뉴의 가격을 계산하는 추상 메소드 구현한다. 
//		아아 2잔 뜨아 1잔 아라 1잔 휘핑 모카 2잔 콜드브루 2잔일 때의 가격을 출력하세요.
		
		int totalPrice = 0;
		
		CoffeeMenu americano = CoffeeMenu.AMERICANO;
		totalPrice += americano.totalPrice(2,1);
		
		CoffeeMenu latte = CoffeeMenu.LATTE;
		totalPrice += latte.totalPrice(1,0);
		
		CoffeeMenu mocha = CoffeeMenu.MOCHA;
		totalPrice += mocha.totalPrice(0,2);
		
		CoffeeMenu coldbrew = CoffeeMenu.COLDBREW;
		totalPrice += coldbrew.totalPrice(2,0);
		
		System.out.println("총 가격은 " + totalPrice + "원 입니다.");
		
		System.out.println("------------------------");
		
//		4. Map<Integer, Integer>을 매개변수로 받아서 List<Entry<K, V>>를 리턴하는 메소드 getOverHundr를 구현하세요. 
//		매개변수 Map에는 key는 50~60까지 value는 15~25까지 넣어주고 키와 밸류의 곱셈의 결과가 1000을 넘는 Entry만 List에 저장합니다.
		
		Map<Integer, Integer> map1 = new HashMap<>();
		
		for(int i = 0 ;  i < 11 ; i++) {
			map1.put(50+i, 15+i);
		}
		
		List<Entry<Integer, Integer>> entryList = getOverHundr(map1);
		System.out.println(entryList);
		
		System.out.println("------------------------");
		
		
//		5. 제네릭 타입의 리스트를 멤버 변수로 갖는 TList라는 제네릭 클래스를 만들고 splitList라는 메소드를 만들고 멤버변수인 List를 반반씩 두개의 
//		리스트로 나누는 기능을구현하세요.(리스트의 요소 개수가 짝수면 반반 동일한 개수로, 홀수면 첫 번째 리스트의 요소가 한 개씩 많게)
		
		TList<Integer> tList = new TList<Integer>();
		List<Integer> intList = new ArrayList<Integer>();
		
		intList.add(1);
		intList.add(2);
		intList.add(3);
		intList.add(4);
		intList.add(5);
		intList.add(6);
		intList.add(7);
		
		
		List<Integer> firstList  = tList.splitList(intList)[0];
		List<Integer> secondList  = tList.splitList(intList)[1];
		
		System.out.println(firstList);
		System.out.println(secondList);
	}
	
//	1. key와 value 모두 Number를 상속받은 클래스만 받고 매개변수로 Map이 주어졌을 때 key, value의 곱이 가장 큰 Entry를 리턴하는 
//		메소드 getMaxMul을 구현하세요.
	public static <K extends Number, V extends Number> Entry<K, V> getMaxMul(Map<K, V> map) {
		int cnt = 0 ;
		
		Entry<K, V> maxMulEntry = null;
		
		for(Entry<K, V> entry : map.entrySet()) {
			if(cnt == 0) {
				maxMulEntry = entry;
			}else {
				if(entry.getKey().intValue() * entry.getValue().intValue() > 
							maxMulEntry.getKey().intValue() * maxMulEntry.getValue().intValue() )
					maxMulEntry = entry;
			}
			cnt++;
		}
		
		return maxMulEntry;
	}
	
//	2.  Number 클래스를 상속받은 클래스만 지정가능한 제네릭 클래스를 만들고 T 배열을 매개변수로 받아서 합, 차, 곱셈, 나눗셈을 연산해주는 
//	메소드를 구현하세요. 각 메소드는 double로 리턴하고 add, sub, mul, div로 메소드명을 갖습니다.(Math.round()로 소수점 두자리까지만 표출)
	public static <T extends Number> double add(T a, T b) {
		double res = a.doubleValue() + b.doubleValue();
		return (double) Math.round(res * 100) / 100;
	}
	public static <T extends Number> double sub(T a, T b) {
		double res = a.doubleValue() - b.doubleValue();
		return (double) Math.round(res * 100) / 100;
	}
	public static <T extends Number> double mul(T a, T b) {
		double res = a.doubleValue() * b.doubleValue();
		return (double) Math.round(res * 100) / 100;
	}
	public static <T extends Number> double div(T a, T b) {
		if( b.doubleValue() == 0) {
			System.out.println("b가 0입니다.");
			return 0;
		}else {
			double res = a.doubleValue() / b.doubleValue();
			return (double) Math.round(res * 100) / 100;
		}
	}
	
//	4. Map<Integer, Integer>을 매개변수로 받아서 List<Entry<K, V>>를 리턴하는 메소드 getOverHundr를 구현하세요. 
//	매개변수 Map에는 key는 50~60까지 value는 15~25까지 넣어주고 키와 밸류의 곱셈의 결과가 1000을 넘는 Entry만 List에 저장합니다.
	
	public static <K, V> List<Entry<K, V>> getOverHundr(Map<K, V> map){
		List<Entry<K, V>> entryList = new ArrayList<>();
		for(Entry<K, V> entry : map.entrySet()) {
			if( (int)entry.getValue() * (int)entry.getKey() > 1000) {
				entryList.add(entry);
			}
		}
		
		return entryList;
	}
	
	
	
	
	
	
	
}
