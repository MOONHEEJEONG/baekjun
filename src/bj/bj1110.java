package bj;

import java.util.Scanner;

public class bj1110 {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		int input = sc.nextInt();
		int[] num = new int[2];
		
		if(input < 10) {
			num[0]=0;
			num[1]=input;
		}
		
		else {
			num[0]=input/10;
			num[1]=input%10;
		}
		
	//	System.out.println(num[0]);
	//	System.out.println(num[1]);

		int cnt=0;
		
		while(true) {
			
			int sum = num[0]+num[1];
	//		System.out.println("sum : " + sum);
			
			num[0]=num[1];
			num[1]=sum%10;
			
			cnt++;
			
			if(num[0]*10 + num[1] == input) {
				System.out.println(cnt);
				break;
			}
			
			
		}
				
		sc.close();
}

}