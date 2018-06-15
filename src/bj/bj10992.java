package bj;


import java.util.Scanner;

public class bj10992{

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		
		for(int i=1; i<=num; i++) {
			for(int j=1; j<=num-i; j++) {
				System.out.print(" ");
			}
			
			for(int k=1; k<=i*2-1; k++) {
				if(i==num) {
					System.out.print("*");
				}else {
				if(k==1) {
					System.out.print("*");
				}
				else {
					if(k==i*2-1) 
						System.out.print("*");
					
					else
						System.out.print(" ");

				}}
			}
			
			System.out.println();
		}
		
		
		sc.close();
		
}	

}