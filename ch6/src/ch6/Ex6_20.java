package ch6;

public class Ex6_20 {
	
			int iv = 10;
			static int cv= 20;
			
			int iv2= cv;
//			static int cv2 = iv; // error Ŭ���� ������ �ν��Ͻ� ���� ���Ұ�
			static int cv2 = new Ex6_20().iv;
			
			static void staticMethod1() {
				System.out.println(cv);
//				System.out.println(iv); //error Ŭ���� �޼��忡�� �ν��Ͻ� ���� ���Ұ�
				System.out.println(new Ex6_20().iv);
			}
			
			void instanceMethod1() {
				System.out.println(cv);
				System.out.println(iv);
			}
			
			static void staticMethod2() {
				staticMethod1();
//				instanceMethod1(); //error Ŭ�����޼��忡���� �ν��Ͻ� �޼��� ȣ�� �Ұ�
				new Ex6_20().instanceMethod1();
			}
			
			void instanceMethod() {
				staticMethod1();
				instanceMethod1();
			
			}
	}

// p281