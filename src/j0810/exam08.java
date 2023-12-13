package j0810;

import java.util.Scanner;

public class exam08 {

	public static void main(String[] args) {
		// 실습08
		
        Scanner s1 = new Scanner(System.in);
		
		int n1;
		int n2;
		
		System.out.print("첫 번째 정수를 입력하시오 : ");
		n1 = s1.nextInt();
		System.out.print("두 번째 정수를 입력하시오 : ");
		n2 = s1.nextInt();
		
		int quotient = n2/n1;
		int remainder = n2%n1;
		
		System.out.printf("%d를 %d로 나눈 몫은 %d이고 나머지는 %d입니다", n2, n1, quotient, remainder);

	}

}
