package ch6;


class Tv{
	String color;
	boolean power;
	int channel;
	
	void power() {power = !power;}
	void channelUp() {++channel;}
	void channelDown() {--channel;}
}

public class Ex6_01 {
	public static void main(String[] args) {
		Tv t;
		t= new Tv();
		t.channel = 7;
		t.channelDown();
		System.out.println("현재 채널은 "+t.channel + " 입니다.");

	}
}
// p235 클래스 연습
