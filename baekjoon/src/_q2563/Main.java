package _q2563;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		boolean[][] paper = new boolean[101][101];
		Scanner sc = new Scanner(System.in);
		int turn = Integer.parseInt(sc.nextLine());
		for(int i=0;i<turn;i++) {
			int x = sc.nextInt();
			int y = sc.nextInt();
			int w = x+10;
			int h = y+10;
			
			for(int a=x;a<w;a++) {
				for(int b=y;b<h;b++) {
					paper[a][b] = true;
				}
			}
		}
		int cnt=0;
		for(int i=0; i<101;i++) {
			for(int j=0; j<101;j++) {
				if(paper[i][j]) {
					cnt++;
				}
			}
		}
		
		System.out.println(cnt);
	}
}
