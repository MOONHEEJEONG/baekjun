package bj;

import java.util.Scanner;

public class bj10817 {

public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int tmp;
		int[] Array = new int[3];
		
		for(int i=0; i<3; i++) {
			Array[i]= sc.nextInt();
		}
		
		for(int i=0; i<Array.length-1; i++) {
			for(int j=0; j<Array.length-1-i; j++) {
				if(Array[j] > Array[j+1]) {
				tmp=Array[j];
				Array[j]=Array[j+1];
				Array[j+1]=tmp;
				}
			}
		}
	
		System.out.println(Array[1]);
		
		
		
	
	}
}