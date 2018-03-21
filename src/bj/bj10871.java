package bj;


import java.util.Scanner;

public class bj10871 {

public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		int x =sc.nextInt();
		int[] array = new int[num];
		int[] result = new int[num];
		int index=0;
		
		for(int i=0; i<num; i++) {
			array[i]=sc.nextInt();
			if(array[i] <x) {
				result[index]=array[i];
				index++;
				}
			}
		
		for(int i=0; i<index; i++) {
			System.out.print(result[i]);
			if(i != (index-1)) {
				System.out.print(" ");
			}
		}
		
			
		sc.close();
	}
}