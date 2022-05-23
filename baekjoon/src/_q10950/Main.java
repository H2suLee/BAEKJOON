package _q10950;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int turn = sc.nextInt();
		int a, b;
		for (int i = 0; i < turn; i++) {
			a = sc.nextInt();
			b = sc.nextInt();
			System.out.println(a + b);
		}
	}
}
