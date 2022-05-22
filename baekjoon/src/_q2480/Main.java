package _q2480;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();

		if (a == b) {
			if (b == c) {
				System.out.println(10000 + (a * 1000));
			} else if (b != c) {
				System.out.println(1000 + (a * 100));
			}
		} else if (a != b) {
			if (b == c) {
				System.out.println(1000 + (b * 100));
			} else if (a == c) {
				System.out.println(1000 + (c * 100));
			} else if (b != c) {
				int max1 = Math.max(a, b);
				int max2 = Math.max(max1, c);
				System.out.println(max2 * 100);
			}
		}
	}
}
