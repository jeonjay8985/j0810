package j0810;

public class exam16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*for(int dan=1; dan<=9; dan+=3) {	
			 System.out.printf("     %d단     ",dan);
			 System.out.printf("     %d단     ",dan+1);
			 System.out.printf("     %d단     \n",dan+2);
			 for(int j=1; j<=9; j++) {
					System.out.printf("%2d *%2d = %2d",dan,j,dan*j);
					System.out.printf("  %2d *%2d = %2d",dan+1,j,(dan+1)*j);
					System.out.printf("  %2d *%2d = %2d\n",dan+2,j,(dan+2)*j);
			} System.out.print("............ ............ ............");
			System.out.println(); */
		
		for(int i=1 ; i<=9 ; i++) {
			for(int k=1 ; k<=9 ; k++) {
				System.out.print(k+"*"+i+"="+i*k+"\t");
			
			}

			System.out.println("\t");
			
			
			

	  }
	}
}
