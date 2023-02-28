package _q2566;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[][] arr = new int[9][9];
		
		int max = 0;
		int maxRow = 0;
		int maxCol = 0;
		for(int i=0;i<9;i++) {
			for(int j=0; j<9; j++) {
				int input = sc.nextInt();
				arr[i][j] = input;
				if(input > max) {
					max = input;
					maxRow = i;
					maxCol = j;
				}
			}
		}
		System.out.println(max);
		System.out.println((maxRow+1) + " " + (maxCol+1));
	}
}
