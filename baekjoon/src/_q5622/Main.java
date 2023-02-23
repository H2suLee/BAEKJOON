package _q5622;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		String[] arr = new String[11];
		arr[3] = "ABC";
		arr[4] = "DEF";
		arr[5] = "GHI";
		arr[6] = "JKL";
		arr[7] = "MNO";
		arr[8] = "PQRS";
		arr[9] = "TUV";
		arr[10] = "WXYZ";
		
		Scanner sc = new Scanner(System.in);
		String S = sc.nextLine();
		int sec =0;
		for(int i=0; i<S.length(); i++) {
			for(int j=3;j<arr.length;j++) {
				if(arr[j].indexOf(S.charAt(i)) > -1) {
					sec += j;
				}
			}
		}
		System.out.println(sec);
	}
}
