package test06;

public class TestYear2 {

	public static void main(String[] args) {
		int year = 2022;
		int na = year % 12;
		String ddi = "";
		switch(na) {
		case 0 : ddi ="원숭이"; break;
		case 1 : ddi ="닭"; break;
		case 2 : ddi ="개"; break;
		case 3 : ddi ="돼지"; break;
		case 4 : ddi ="쥐"; break;
		case 5 : ddi ="소"; break;
		case 6 : ddi ="호랑이"; break;
		case 7 : ddi ="토끼"; break;
		case 8 : ddi ="용"; break;
		case 9 : ddi ="뱀"; break;
		case 10 : ddi ="말"; break;
		case 11 : ddi ="양"; break;
		}
        System.out.println(ddi); 
	}

}
