package j0810;

import java.util.Scanner;

public class exam09 {

	public static void main(String[] args) {
		// 실습09
		
	 Scanner s1 = new Scanner(System.in);
			
	 int hours;
	 int wage = 9620;
			
	System.out.print("근무 시간을 입력하세요 : ");
	hours = s1.nextInt();
	
	wage=hours*wage;

	if(hours>=8) {
		wage=9620*8+(((9620*(hours-8))/10)*15);
	}
	
	System.out.printf("임금은 %d입니다", wage);
	
	}

}
