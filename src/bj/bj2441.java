package bj;

import java.util.Scanner;

public class bj2441 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n= sc.nextInt();
		
		//i= 5,4,3,2,1
		//j= 0,1,2,3,4
		//k= 5,4,3,2,1
		for(int i=n; i>0; i--) {
		
			for (int j=0; j<n-i; j++) {
				System.out.print(" ");
			}
			
			for(int k=i; k>=1; k--) {
				System.out.print("*");
			}		
			
			
			
			System.out.println();
		}
		
		sc.close();
}

}
