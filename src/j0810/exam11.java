package j0810;

import java.util.Scanner;

public class exam11 {

	public static void main(String[] args) {
		// 실습11
		Scanner s1 = new Scanner (System.in);
		
		long num;
		System.out.print("정수를 입력하세요: ");
		num = s1.nextInt();
		
		long mul=1;
		for(int i=1; i<=num; i++) {
			mul=mul*i;
		
		}	System.out.printf("%d!은 %d입니다", num, mul);
		

	}

}
