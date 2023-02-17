package test05;

public class TestMain {

	public static void main(String[] args) {
		int v1, v2; // 변수 : variable == instance
		v1 = 7; v2 = 2;
		int v;
		
		v = v1 + v2;
		System.out.println("v1 + v2 =" + v);
		v = v1 - v2;
		System.out.println("v1 - v2 =" + v );
		v = v1 * v2;
		System.out.println("v1 * v2 =" + v);
		v = v1 / v2;
		System.out.println("v1 / v2 =" + v);
		
		double result = 0.0;
		result = (double) v1 / v2;
		System.out.println("v1 / v2 =" + result);
		
		int result2 = v1 * v1 * v1; //v1의 3승
		System.out.println("v2의 3승 =" + result2);
		
		//x의 y승 : double Math.pow(double x, double y)
		double result3 = Math.pow((double) v2, 3.0);
		System.out.println("v2의 3승 = " + (int) result3);
		
		// sin 30도 : 0.5 단위 : degree
		// sin 30 radian 단위 : radian
		double result4 = Math.sin(30 + Math.PI / 180);
		System.out.println("sin 30도 = "+ result4);
		
		//---------------------------------
		System.out.printf("%.3f", result4); // 소숫점 3자리까지
		
		// %d : decimal =10진수
		// %o : ocat decimal =8진수
		// %x : hexa decimal =16진수
		// %e : exponent 지수 10의 3
		// %f : float, double 실수
		// %c : char 문자
		// %s : string 문자열
		int num1 = 0x3cf;
		System.out.printf("%d %o %x", num1, num1, num1);
		
		int num2 = 65;
		System.out.printf("\n%d %c", num2, num2);
		
		char ch1 = '김';
		System.out.printf("\n%x %c", (int) ch1, ch1);
		
		char ch2 = 0xae40;
		System.out.printf("\n%x %c", (int) ch2, ch2);
		
		double result5 = 0.345e + 20; //0.345 * 10의 20승
		System.out.printf("\n%f %e", result5, result5);
	}

}
