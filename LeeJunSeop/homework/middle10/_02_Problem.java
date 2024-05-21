package homework.middle10;

import homework.middle10.classes.Calc;

public class _02_Problem {
	public static void main(String[] args) {
		Double[] dArr = new Double[10];
		
		for(int i = 0 ; i < 10; ++i) {
			dArr[i] = Math.random() * 100;
		}
		
		Calc<Double> dCalc = new Calc<>();
		
		System.out.println(dCalc.add(dArr));
		System.out.println(dCalc.sub(dArr));
		System.out.println(dCalc.mul(dArr));
		System.out.println(dCalc.div(dArr));

		
	}
}
