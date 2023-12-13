package j0810;

import java.util.Scanner;

public class exam03 {

	public static void main(String[] args) {
		// 실습03
		
        Scanner s1 = new Scanner(System.in);
		
		int mile;
		float km;
		
		System.out.print("마일을 입력하세요: ");
		mile = s1.nextInt();
		km = (float)(mile*1.609);
		System.out.printf("%.1f마일은 %.2f킬로미터입니다 ",(float)mile, km);

	}

}
