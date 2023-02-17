package test06;

import java.util.Scanner;

public class TestYear {

	public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
		
		System.out.println("연도를 입력하세요");
		int Year = in.nextInt();
		String Animal = "";
		
		if(Year %12== 0) {
			Animal = "원숭이";
		} else {
			if(Year %12== 1) {
				Animal = "닭";
			} else {
				if(Year %12== 2) {
					Animal = "개";
				} else {
					if(Year %12== 3) {
						Animal = "돼지";
					} else {
						if(Year %12== 4) {
							Animal = "쥐";
						} else {
							if(Year %12== 5) {
								Animal = "소";
							} else {
								if(Year %12== 6) {
									Animal = "호랑이";
								} else {
									if(Year %12== 7) {
										Animal = "토끼";
									} else {
										if(Year %12== 8) {
											Animal = "용";
										} else {
											if(Year %12== 9) {
												Animal = "뱀";
											} else {
												if(Year %12== 10) {
													Animal = "말";
												} else {
													if(Year %12== 11) {
														Animal = "양";
													} 
												}
											}
										}
									}
								}
							}
						}
					}
				}
			}
		}
		System.out.println(Animal);
		

	}

}
