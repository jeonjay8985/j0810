package j0810;

import java.util.Scanner;

public class exam10 {

	public static void main(String[] args) {
		// 실습10
		
		Scanner s1 = new Scanner (System.in);
		
		long standard, tax;
		
		System.out.print("과세 표준 금액을 입력하세요: ");
		standard=s1.nextInt();
		
		if(standard<=14000000) {
			tax=standard/100*6;
		}else if(14000000<standard && standard<=50000000) {
			tax=840000+((standard-14000000)/100*15);
		}else if(50000000<standard && standard<=88000000) {
			tax=6240000+((standard-50000000)/100*24);
	    }else if(88000000<standard && standard<=150000000) {
		    tax=15360000+((standard-88000000)/100*35);
	    }else if(150000000<standard && standard<=300000000) {
		    tax=37060000+((standard-150000000)/100*38);
	    }else if(300000000<standard && standard<=500000000) {
		    tax=94060000+((standard-300000000)/100*40);
	    }else if(500000000<standard && standard<=1000000000) {
		    tax=174060000+((standard-500000000)/100*42);
	    }else {
		    tax=384060000+((standard-1000000000)/100*45);
	}
       System.out.printf("과세표준은 %d이고 소득세는 %d입니다", standard, tax);
	}

 }
