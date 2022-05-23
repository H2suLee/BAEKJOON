package _q10871;

import java.util.Scanner;

// 정수 N개로 이루어진 수열 A와 정수 X가 주어진다. 
// 이때, A에서 X보다 작은 수를 모두 출력하는 프로그램을 작성하시오.
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int x = sc.nextInt();

		for (int i = 1; i <= n; i++) {
			int a = sc.nextInt();
			if (a < x) {
				System.out.println(a);
			}
		}
	}
}
