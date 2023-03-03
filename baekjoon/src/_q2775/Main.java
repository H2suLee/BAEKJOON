package _q2775;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {
	// 다른풀이
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		// 아파트 생성 
		int[][] APT = new int[15][15];
 
		for(int i = 0; i < 15; i++) {
			APT[i][1] = 1;	// i층 1호
			APT[0][i] = i;	// 0층 i호
		}
 
 
		for(int i = 1; i < 15; i ++) {	// 1층부터 14층까지
 
			for(int j = 2; j < 15; j++) {	// 2호부터 14호까지
				APT[i][j] = APT[i][j - 1] + APT[i - 1][j];
			}
		}
		
		// 테스트 부분 		
		int T = in.nextInt();
		
		for(int i = 0; i < T; i++) {
			int k = in.nextInt();
			int n = in.nextInt();
			System.out.println(APT[k][n]);
		}
	}
	// 런타임 에러
	public static void main2(String[] args) throws NumberFormatException, IOException {
		int[][] arr = new int[14][15];
		int sum=0;
		for(int i=0;i<14;i++) {
			for(int j=1;j<15;j++) {
				if(i==0) {
					arr[i][j] = j;
				}
				else {
					sum=0;
					for(int k=1; k<=j; k++) {
						sum+=arr[i-1][k];
					}
					arr[i][j] = sum; 
				}
				
			}
		}
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int turn = Integer.parseInt(br.readLine());
		for(int i=0; i<turn; i++) {
			int k = Integer.parseInt(br.readLine());
			int n = Integer.parseInt(br.readLine());
			System.out.println(arr[k][n]);
		}	
	}
}
