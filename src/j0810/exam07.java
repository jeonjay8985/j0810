package j0810;

import java.util.Scanner;

public class exam07 {

	public static void main(String[] args) {
		// 실습07
		
        Scanner s1 = new Scanner(System.in);
		
		String name;
		String age;
		
		System.out.print("이름 : ");
		name = s1.nextLine();
		System.out.print("나이 : ");
		age = s1.nextLine();
		
		System.out.print("이름은 " +name+ "이고 나이는 " +age+ "입니다");

	}

}
