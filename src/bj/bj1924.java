package bj;
import java.util.Scanner;

public class bj1924 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		int mon= sc.nextInt();
		int day= sc.nextInt();
		int total=0;
		int[] days = {0, 31,28,31,30,31,30,31,31,30,31,30,31 };
		String results="";
		
		
		for(int i=1; i<mon; i++) {
			total += days[i];
			
		}
		
		for(int j=1; j<=day; j++) {
			total++;
		}
		
		
		switch(total%7) {
		case 1: 
			results="MON";
			break;
		case 2: 
			results="TUE";
			break;
		case 3: 
			results="WED";
			break;
		case 4: 
			results="THU";
			break;
		case 5: 
			results="FRI";
			break;
		case 6: 
			results="SAT";
			break;
		case 0: 
			results="SUN";
			break;
				
		
		}
		
		System.out.println(results);

		sc.close();
	}

}
