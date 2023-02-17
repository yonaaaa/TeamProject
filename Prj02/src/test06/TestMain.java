package test06;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class TestMain {
	// 함수 : function
	public static void line(){
		System.out.println("--------------------");
	
	}

	public static void main(String[] args) {
		// 입력
		Scanner in = new Scanner(System.in); // 키보드로 입력받기
		System.out.println("이름을 입력하세요");
		String name = in.nextLine();
		System.out.println("태어난 연도를 입력하세요");
		int birthYear = in.nextInt(); 
		
		//처리 (현재연도 가져오기)
		LocalDate now = LocalDate.now();
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy"); // "yyyy/mm/dd"
		String formatedNow = now.format(dtf);
		
		int thisYear = Integer.parseInt(formatedNow);
		int age = thisYear - birthYear + 1;
		
		// 출력
		line();
		System.out.printf("이름 : %s\n태어난 연도 : %d\n나이 : %d\n", name, age, birthYear);
		if(age>=20) {
			System.out.println("성년");
			}
		else {
			System.out.println("미성년자");}
		
		}
}
