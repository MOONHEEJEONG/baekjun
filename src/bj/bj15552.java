package bj;

import java.io.*;
import java.util.StringTokenizer;

public class bj15552 {
public static void main(String[] args) {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); //버퍼리더 선언
		BufferedWriter bw = new BufferedWriter( new OutputStreamWriter( System.out ) ); //버퍼라이터 선언
		
		try {
			int num =Integer.parseInt(br.readLine()); //들어올 입력 갯수
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
