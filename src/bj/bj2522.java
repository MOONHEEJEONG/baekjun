package bj;

import java.util.Scanner;

public class bj2522{

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		
		for(int i=1; i<=num*2-1 ; i++) {
			int k=num-i;
			if(k<0) k=k*-1;
			
			
		
			for(int j=0; j<k; j++) {
				System.out.print(" ");
			}
			
			for(int m=0; m<num-k; m++) {
				System.out.print("*");
			}
			
			System.out.println();
		}
		
		sc.close();
		
}	

}