package tast04;

import java.util.Scanner;

public class TestMain {

	public static void main(String[] args) {
		//키보드로 두 수를 입력받아 계산하여 출력
		Scanner in = new Scanner(System.in);
		
		System.out.println("숫자1 : ");
		int num1 = in.nextInt();
		System.out.println("숫자2 : ");
		int num2 = in.nextInt();
		if( num2 == 0 ) {
			System.out.println("숫자 2는 0이 될 수 없습니다.");
			System.exit(-1); // 프로그램 강제 종료
		}
		// 계산
		int result1 = num1 + num2;
		int result2 = num1 - num2;
		int result3 = num1 * num2;
		int result4 = num1 / num2;
		int result5 = num1 % num2;
		double result6 = num1 / num2;
		double result7 = (double) num1 / (double) num2;
	
		
				
	    // 출력 +
		System.out.println("결과 더하기:" + result1);
		System.out.println("결과 빼기:" + result2);
		System.out.println("결과 곱하기:" + result3);
		System.out.println("결과 나누기:" + result4);
		System.out.println("결과 나머지:" + result5);
		System.out.println("결과 나누기2:" + result6);		
		System.out.println("결과 나누기3:" + result7);		
	}

}
