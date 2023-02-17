package _q10951;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		String str; 
		int str2;
		int str1;
		while((str = br.readLine())!= null) {
			str1 = Integer.parseInt(String.valueOf(str.charAt(0)));
			str2 = Integer.parseInt(String.valueOf(str.charAt(2)));
			System.out.println((str1+str2));
		}
//		
//		Scanner sc = new Scanner(System.in);
//		while(sc.hasNextInt()) {
//			int a = sc.nextInt();
//			int b = sc.nextInt();
//			System.out.println(a + b);
//		}
//		sc.close();
	}
}
