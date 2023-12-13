package j0810;

import java.util.Scanner;

public class exam05 {

	public static void main(String[] args) {
		// 실습05
		
        Scanner s1 = new Scanner(System.in);
		
		double r;
		double volume;
		
		System.out.print("구의 반지름: ");
		r = s1.nextInt();
		volume = 4*r*r*r/3;
		System.out.printf("구의 부피: %.2f ", volume);

	}

}
