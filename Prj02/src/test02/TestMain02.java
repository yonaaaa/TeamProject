package test02;

public class TestMain02 {

	public static void main(String[] args) {
		int num1 = 123;
		System.out.println(num1);
		int num2 = 1234567890; // 10자리 숫자만 가능
		System.out.println(num2);
		long num3 = 12345678901L; // int out of range
		System.out.println(num3);
		// 강제 형변환 (int)
		int num4 = (int) 100L; // 데이터 손실 발생
		System.out.println(num4);
		
		//실수 : 소숫점 있는 숫자
		double val1 = 0.1;
		double val2 = 0.2;
		double val3;
		val3 = val1 + val2;
		System.out.println(val3);
		
		float f = 0.12345678f;
		System.out.println(f);
		
		boolean b1 = false;
		b1 = 3 > 1;
		System.out.println(b1);
		
		boolean b2 = (0 == 0.0); // 자동형변환 0.0 ==0.0
		System.out.println(b2);
		
		// 문자 char
		char ch1 = 'A';
		System.out.println(ch1);
		char ch2 = 0x41;
		System.out.println(ch2);
		
		String s1 = "Hello'홍길동'world";
		System.out.println(s1);
		
		String path = "D:\\ws\\java\\Prj02\\src\\test02";
		System.out.println(path);
		
		String snum1 = "36.65";
		String snum2 = "0.5";
		double result1 = Double.parseDouble (snum1); //문자열→double
		double result2 = Double.parseDouble (snum2);
		System.out.println(snum1 + snum2); // "36.5" + "0.5" = 36.50.5
		String result = String.valueOf(result1 + result2);
		System.out.println(result);
	}

}
