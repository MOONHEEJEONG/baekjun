package bj;

import java.io.*;
import java.util.StringTokenizer;

public class bj15552 {
public static void main(String[] args) {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); //���۸��� ����
		BufferedWriter bw = new BufferedWriter( new OutputStreamWriter( System.out ) ); //���۶����� ����
		
		try {
			int num =Integer.parseInt(br.readLine()); //���� �Է� ����
			int[] results = new int[num];
			for (int i=0; i<num ; i++)
			{
				StringTokenizer st = new StringTokenizer( br.readLine() );
				int a = Integer.parseInt( st.nextToken() );
				int b = Integer.parseInt( st.nextToken() );
				results[i]=a+b;
							}
			
			for (int i=0; i<num ; i++) {
				bw.write(Integer.toString(results[i]));
				bw.write("\n");
			}
		bw.close();
			
		}  catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	
	}

}
