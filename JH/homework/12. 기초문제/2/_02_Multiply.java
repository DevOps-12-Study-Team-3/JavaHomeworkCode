package chap00_practice;

public class _02_Multiply {
	public double Mul(long a, double b) {
		double sum = a * b;
		System.out.println(Math.round(sum * 1000) / 1000);
		System.out.println(Math.round(sum * 1000) / 1000.0);
		return Math.round(sum * 1000) / 1000;
	}
}
