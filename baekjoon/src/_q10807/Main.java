package _q10807;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		 BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		 BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		 
		 int N = Integer.parseInt(br.readLine());
		 String str = null;
		 for(int i = 0; i<N; i++) {
			 str = br.readLine();
		 }
		
		 System.out.println("??");
		 String[] arr = str.split(" ");
		
		 int cnt = 0;
		 String v = br.readLine();
		 
		 for(int i=0;i<N;i++) {
			 System.out.println(arr[i]);
			 if(v.equals(arr[i])) {
				 cnt++;
			 }
		 }
		  
		 System.out.println(cnt);
		 
		 
//		Scanner sc = new Scanner(System.in);
//		
//		int N = sc.nextInt();
//		int[] arr = new int[N];
//		for(int i=0;i<N;i++) {
//			arr[i] = sc.nextInt();
//		}
//		
//		int v = sc.nextInt();
//		int cnt = 0;
//
//		for(int i=0;i<N;i++) {
//			if(arr[i] == v) {
//				cnt++;
//			}
//		}
//		
//		System.out.println(cnt);
	}
}
