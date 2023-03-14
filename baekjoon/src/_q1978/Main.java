package _q1978;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int totCnt = 0;
		for(int i=0; i<N; i++) {
			int cnt = 0;
			int val = sc.nextInt();
			for(int j=1; j<val;j++) {
				if(val%j==0) {
					cnt++;
				}
			}
			if(cnt==1) {
				totCnt++;
			}
		}
		
		System.out.println(totCnt);
	}
}
