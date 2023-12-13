package j0810;

import java.util.Scanner;

public class exam01 {

	public static void main(String[] args) {
		// 실습01
		
		Scanner s1 = new Scanner(System.in);
		
		int salary;
		int amount;
		
		System.out.print("월급을 입력하세요 : ");
		salary = s1.nextInt();
		amount = salary*12*10;
		
		System.out.print("10년 동안의 저축액 : " +amount);
		
	}

}
