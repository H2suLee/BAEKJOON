package _q3003;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] a = {1, 1, 2, 2, 2, 8};
		for(int i=0; i<6; i++) {
			int b = sc.nextInt();
			a[i] = a[i]-b;
			System.out.print(a[i] + " ");
		}
	}
}
