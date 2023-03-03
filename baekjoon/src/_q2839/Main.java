package _q2839;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] caseArr = new int[4];
		
		if(N%3==0) {
			caseArr[0] = N/3;
		}
		if(N%5==0) {
			caseArr[1] = N/5;
		}
		
		int cnt = 0;
		if(N%5>0) {
			cnt = 0;
			while(N<=0) {
				N = N-5;
				cnt++;
				if(N%3==0) {
					if(caseArr[2] < (N/3)+cnt) {
						caseArr[2] = (N/3)+cnt;
						break;
					}
				}
			}
			caseArr[2] = (N/5) + ((N%5)/3);
		}
		
		if(N%3>0&&(N%3)%5==0) {
			cnt = 0;
			caseArr[3] = (N/3) + ((N%3)/5);
		}
		
		System.out.println(Arrays.stream(caseArr).max().getAsInt());
		
	}
}
