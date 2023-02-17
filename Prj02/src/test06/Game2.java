package test06;

import java.util.Scanner;

public class Game2 {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("A. 컴퓨터(1. 가위, 2.바위, 3.보):");
		int val1 = in.nextInt();
		System.out.println("B. 유저(1. 가위, 2.바위, 3.보):");
		int val2 = in.nextInt();
		
		String result = "";
		//A 1. 가위
		if(val1 ==1) {
			if(val2 ==1) result = "비김";
			if(val2 ==2) result = "이김";
			if(val2 ==3) result = "짐";
		}
		//A 2. 바위
		if(val1 ==2) {
			if(val2 ==1) result = "짐";
			if(val2 ==2) result = "비김";
			if(val2 ==3) result = "이김";
		}
		//A 3. 보
		if(val1 ==3) {
			if(val2 ==1) result = "이김";
			if(val2 ==2) result = "짐";
			if(val2 ==3) result = "비김";
		}
		System.out.println(result);
	}
	
}
		
			
			
		
		
