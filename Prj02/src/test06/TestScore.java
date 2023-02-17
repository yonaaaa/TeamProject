package test06;

import java.util.Scanner;

public class TestScore {
/*
 0  ,1, 2, 3
사나,70,80,90
모모,0,70,100
쯔위,70,90,90
정연,80,90,70
*/
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		// 입력 : 번호 이름 국어 영어 수학
		System.out.println("입력 : 이름 국어 영어 수학");
		String Line = in.nextLine(); //"사나,70,80,90"
		String s[] =Line.split(","); //s[0]="사나", s[1]="70", s[2]="80", s[3]="90"
        String name =s[0].trim();
        int kor = Integer.parseInt( s[1].trim() ); //trim은 공백제거
        int eng = Integer.parseInt( s[2].trim() );
        int mat = Integer.parseInt( s[3].trim() );
        
       
        
		//계산
		
		//출력
		//총점 : 국어 + 영어 + 수학
        int tot = kor + eng + mat;
		//평균 : 총점/3	
        double avg = (double) tot /3.0;
		//평균 소수 이하 2자리로 반올림하여
        char grade = ' '; //빈문자
        if(90 <= avg && avg <= 100) {
        	grade = 'A';
        } else {
        	if(80 <= avg && avg <90) {
        		grade = 'B';
        	} else {
        		if(70 <= avg && avg <80) {
        			grade = 'C';
        		} else {
            		if(60 <= avg && avg <70) {
            			grade = 'D';
            		} else {
                		if(0 <= avg && avg <60) {
                			grade = 'F';
                		} else {
                			grade = ' ';
                		}
        		
    	} 
    	}
        	
        }
        }
		
		//출력 : 번호 이름 총점 평균 학점
        		System.out.println("이름 총점 평균 학점");
        		String fmt = "%s %d %.2f %c\n";
        		String msg = String.format(fmt, name, tot, avg, grade);
        		System.out.println(msg);
		}

}
