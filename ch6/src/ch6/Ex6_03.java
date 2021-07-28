package ch6;

public class Ex6_03 {
		
	public static void main(String[] args) {
		Tv t1=new Tv();
		Tv t2=new Tv();
		System.out.println("t1의 channel값은 "+ t1.channel + "입니다.");
		System.out.println("t2의 channel값은 "+ t2.channel + "입니다.");
		
		t2 = t1;
		t1.channel = 7;
		System.out.println("t1의 channel 값을 7로 변경하였습니다.");
		
		System.out.println("t1의 channel값은 "+ t1.channel + "입니다.");
		System.out.println("t2의 channel값은 "+ t2.channel + "입니다.");
	}
}
// p238 참조변수와 인스턴스의 관계 