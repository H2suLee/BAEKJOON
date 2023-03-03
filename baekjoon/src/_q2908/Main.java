package _q2908;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {
	// String builder와 Scanner 사용
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		
		A = Integer.parseInt(new StringBuilder().append(A).reverse().toString());
		B = Integer.parseInt(new StringBuilder().append(B).reverse().toString());
		
		System.out.println(A>B?A:B);
	}
	
	public static void main2(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		String str1 = st.nextToken();
		String str2 = st.nextToken();
		
		char[] arr1 = new char[str1.length()];
		char[] arr2 = new char[str2.length()];
		
		for(int i = 0; i<str1.length(); i++) {
			arr1[i] = str1.charAt(str1.length()-1-i);
		}
		
		for(int i = 0; i<str2.length(); i++) {                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                 
			arr2[i] = str2.charAt(str2.length()-1-i);
		}
		
		System.out.println(Math.max(Integer.parseInt(String.valueOf(arr1)), Integer.parseInt(String.valueOf(arr2))));
	}
}
