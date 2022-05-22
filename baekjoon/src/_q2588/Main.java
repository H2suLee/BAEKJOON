package _q2588;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt(); // 472
		int b = sc.nextInt(); // 385

		int c = b % 10; // 5
		int d = (b % 100) / 10; // 8
		int e = (b - (b % 100)) / 100; // 3

		System.out.println(a * c);
		System.out.println(a * d);
		System.out.println(a * e);
		System.out.println(a * b);

	}

}
