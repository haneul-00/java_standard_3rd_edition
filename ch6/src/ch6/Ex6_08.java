package ch6;

public class Ex6_08 {

	public static void main(String[] args) {
		System.out.println("main �Լ� ����");
		firstMethod();
		System.out.println("main �Լ� ����");
	}
	
	static void firstMethod() {
		System.out.println("firstMethod �Լ� ����");
		secondMethod();
		System.out.println("firstMethod �Լ� ����");
	}
	
	static void secondMethod() {
		System.out.println("secondMethod �Լ� ����");
		System.out.println("secondMethod()");
		System.out.println("secondMethod �Լ� ����");
	}
}
//p263