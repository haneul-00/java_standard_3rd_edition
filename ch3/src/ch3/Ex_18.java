package ch3;

public class Ex_18 {

		public static void main(String[] args) {
			double pi = 3.141592;
			double shortPi = Math.round(pi*1000)/1000.0;
			System.out.println(shortPi);
		}

	}
	// p107 소수점 3자리 아래 Math.round 사용하여 반올림