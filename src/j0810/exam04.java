package j0810;

import java.util.Scanner;

public class exam04 {

	public static void main(String[] args) {
		// 실습04
		
		  Scanner s1 = new Scanner(System.in);
			
		 int money;
		 int price;
			
		 System.out.print("받은 돈: ");
		 money = s1.nextInt();
		 System.out.print("상품 가격: ");
		 price = s1.nextInt();
		 
		 int tax, rest;
		 
		 tax = price/100*10;
		 rest = money-price;
		 
		 System.out.printf("부가세: %d%n", tax);
		 System.out.printf("잔돈: %d", rest);
		
		 
		 

	}

}
