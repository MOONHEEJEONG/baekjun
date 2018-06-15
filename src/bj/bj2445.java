package bj;

import java.util.Scanner;

public class bj2445 {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		
			
		for(int i=1; i<=num ; i++) {
			for(int j=1; j<=i; j++ ) {
				System.out.print("*");
			}
			
			for(int k=1; k<=(num-i)*2; k++) {
				System.out.print(" ");
			}
			
			for(int l=1; l<=i; l++ ) {
				System.out.print("*");
			}
			
			System.out.println();
		}
		
		for(int i=1; i<num; i++) {
			for(int j=1; j<=num-i; j++) {
				System.out.print("*");
			}
			
			for(int k=1; k<=2*i; k++) {
				System.out.print(" ");
			}
			
			for(int l=1; l<=num-i; l++) {
				System.out.print("*");
			}
			
			System.out.println();
		}
		
		sc.close();
		
}	

}