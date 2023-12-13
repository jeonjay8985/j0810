package j0810;

import java.util.Scanner;

public class exam02 {

	public static void main(String[] args) {
		// 실습02
		
		Scanner s1 = new Scanner(System.in);
		
		int r;
		float area;
		
		System.out.print("반지름을 입력하세요: ");
		r = s1.nextInt();
		area = (float)(r*r*3.14);
		System.out.printf("원의 면적은: %.2f ", area);
		
	}

}
