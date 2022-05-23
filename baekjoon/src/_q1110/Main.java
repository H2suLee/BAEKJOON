package _q1110;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int setNum = num;
		int count = 0;
		do {
			count++;

			int a = num / 10;
			int b = num % 10;

			num = b * 10 + ((a + b) % 10);

			if (num == setNum) {
				System.out.println(count);
				break;
			}

		} while (true);

	}
}
