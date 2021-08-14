package ch8;

public class Ex8_09 {

	public static void main(String[] args) {
		try {
			Exception e = new Exception("고의로 발생시켰음.");
			throw e;
			// throw new Exception("고의로 발생시켰음."); // 위의 두 줄을 한줄로 쓰는 경우
		} catch (Exception e) {
			System.out.println("에러 메세지 : "+e.getMessage());
			e.printStackTrace();
		}
		System.out.println("프로그램이 정상 종료 되었음.");
	}

}
