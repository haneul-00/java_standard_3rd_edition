package ch6;

class MyMath{
	long add(long a,long b) { return a+b; }
	long sub(long a,long b) { return a-b; }
	long mul(long a,long b) { return a*b; }
	double div(double a,double b) { return a/b; }
}

public class Ex6_06 {
	public static void main(String[] args) {
		MyMath mm = new MyMath();
		long result1 = mm.add(5L, 3L);
		long result2 = mm.sub(5L, 3L);
		long result3 = mm.mul(5L, 3L);
		double result4 = mm.div(5L, 3L);
		
		System.out.println("add(5L, 3L) = " +result1);
		System.out.println("sub(5L, 3L) = " +result2);
		System.out.println("mul(5L, 3L) = " +result3);
		System.out.println("div(5L, 3L) = " +result4);
	}
}
// p 256