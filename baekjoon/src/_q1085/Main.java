package _q1085;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[] a = new int[4];
		for(int i=0; i<4; i++) {
			a[i] = sc.nextInt();
		}
		
		a[2] = a[2]-a[0];
		a[3] = a[3]-a[1];
				
		System.out.println(Arrays.stream(a).min().getAsInt());
	}
}
