package bj;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
	
	Scanner sc = new Scanner(System.in);
	int n= sc.nextInt();
	
	for(int i=1; i<=n; i++) {
		for(int j=1; j<=n-i; j++){
			System.out.print(" ");
		}
		
		for(int k=n-i+1; k<=n; k++) {
			System.out.print("*");
		}
		System.out.println();
	}
	
	sc.close();
}

}