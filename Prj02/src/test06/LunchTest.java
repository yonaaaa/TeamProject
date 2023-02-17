package test06;

import java.util.Scanner;

public class LunchTest {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.println("시간을 입력하세요(0~23시)");
		int time = in.nextInt();
		String mealTime = "";
		if(0<=time && time <=10) {
			mealTime = "아침 시간 입니다";
		} else {
			if(11<=time && time <=15) {
				mealTime = "점심 시간 입니다";
			} else {
			if(16<=time && time <=23) {
			mealTime = "저녁 시간 입니다";
		} else {
			mealTime = "시간(0~23)시 사이입니다";
		}
			}
		} System.out.println(mealTime);
	}
	
}

			
			
			
		


