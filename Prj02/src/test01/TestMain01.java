package test01;

public class TestMain01 {

	public static void main(String[] args) {
		//입력 : 이름, 태어난 연도, 전화
		String name1 = "아이유"; //문자열 : String
		int birth = 1999; //정수 : Integer
		String tel = "010-1234-5678";

		//처리  :  계산 나이
		int age = 2022 - birth + 1;
		
		//출력 : 이름, 나이, 전화
		System.out.println("이름:" + name1);
		System.out.println("태어난연도:" + birth);
		System.out.println("전화번호:" + tel);
		System.out.println("나이:" + age);
	}

}
