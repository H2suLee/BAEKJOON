package _q10250;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int turn = sc.nextInt();
		
		for(int i=0; i<turn; i++) {
			
			int H = sc.nextInt();sc.nextInt();
			int N = sc.nextInt();
			
			int b = N/H + 1;
			int a = N%H;
			if(a == 0) {
				a = H;
				b -= 1;
			}
			System.out.println(a + String.format("%02d", b));
		}
	}
}