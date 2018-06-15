package bj;

import java.util.Scanner;

public class bj2446{

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		
		for(int i=num; i>=1 ; i--) {

			for(int j=0; j<num-i; j++ ) {
				System.out.print(" ");
			}	
			
			for(int k=2*i-1; k>=1; k--) {
				System.out.print("*");
			}					
						
			System.out.println();
		}
		
		for(int i=2; i<=num; i++) {
			for(int j=1; j<=num-i; j++) {
				System.out.print(" ");
			}
			
			for(int k=1; k<=2*i-1; k++) {
				System.out.print("*");
			}
			
			System.out.println();
		}
		
		sc.close();
		
}	

}