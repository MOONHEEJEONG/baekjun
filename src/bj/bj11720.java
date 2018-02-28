package bj;
import java.util.Scanner;

public class bj11720 {
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		int n= sc.nextInt();
		String number= sc.next();
		int results=0;	
		
		for(int i=0; i<n; i++) {

			results+= (int)number.charAt(i)-'0';
			
		}
		System.out.println(results);

		
		
		sc.close();
}
}
