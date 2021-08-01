package ch6;

public class Ex6_19 {
	public static void main(String[] args) {
		System.out.println(MyMath2.add(200L,100L));
		System.out.println(MyMath2.sub(200L,100L));
		System.out.println(MyMath2.mul(200L,100L));
		System.out.println(MyMath2.div(200.0,100.0));
		
		MyMath2 mm = new MyMath2();
		mm.a = 200l;
		mm.b = 100l;
		
		System.out.println(mm.add());
		System.out.println(mm.sub());
		System.out.println(mm.mul());
		System.out.println(mm.div());
	}

}

class MyMath2{
	long a,b;
	// 인스턴스 변수만을 이용하기에 매개변수가 필요없음
	long add() { return a+b; }
	long sub() { return a-b; }
	long mul() { return a*b; }
	double div() { return a/b; }
	
	// 인스턴수 변수와 관계 없이 매개변수만으로 작업이 가능
	static long add(long a,long b) { return a+b; }
	static long sub(long a,long b) { return a-b; }
	static long mul(long a,long b) { return a*b; }
	static double div(double a,double b) { return a/b; }
}
// p279