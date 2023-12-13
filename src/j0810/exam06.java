package j0810;

import java.util.Scanner;

public class exam06 {

	public static void main(String[] args) {
		// 실습06
    Scanner s1 = new Scanner(System.in);
    
    System.out.print("수도입니까?(수도:1  수도아님:0) : ");
    String capital = s1.nextLine();
    int cap = Integer.parseInt(capital);
    
    int population;
    int rich;
    
    System.out.print("인구(단위: 만) : ");
    population = s1.nextInt();
    System.out.print("부자의 수(단위: 만) : ");
    rich = s1.nextInt();
    
    if(cap==1 && population>=100 && rich>=50) {
    	System.out.print("메트로폴리스입니다");
    }else {
    	System.out.print("메트로폴리스가 아닙니다");
    }
    

	}

}
