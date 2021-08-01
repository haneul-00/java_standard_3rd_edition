package ch6;

public class Ex6_20 {
	
			int iv = 10;
			static int cv= 20;
			
			int iv2= cv;
//			static int cv2 = iv; // error 클래스 변수는 인스턴스 변수 사용불가
			static int cv2 = new Ex6_20().iv;
			
			static void staticMethod1() {
				System.out.println(cv);
//				System.out.println(iv); //error 클래스 메서드에서 인스턴스 변수 사용불가
				System.out.println(new Ex6_20().iv);
			}
			
			void instanceMethod1() {
				System.out.println(cv);
				System.out.println(iv);
			}
			
			static void staticMethod2() {
				staticMethod1();
//				instanceMethod1(); //error 클래스메서드에서는 인스턴스 메서드 호출 불가
				new Ex6_20().instanceMethod1();
			}
			
			void instanceMethod() {
				staticMethod1();
				instanceMethod1();
			
			}
	}

// p281