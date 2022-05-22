package _q2525;

import java.util.Scanner;

public class Main {
	/*
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int h = sc.nextInt();
		int m = sc.nextInt();
		int add = sc.nextInt();
		
		if (m + add < 60) {
			System.out.println(h + " " + (m + add));
		} else {
			if (h == 23) {
				h = -1 + ((m + add) / 60);
			} else {
				h = h + ((m + add) / 60);
			}
			m = (m + add) % 60;
			System.out.println(h + " " + m);
		}
	}
	*/
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int h = sc.nextInt();
		int m = sc.nextInt();
		int add = sc.nextInt();
		
		h += add / 60;
		m += add % 60;
		
		if (m >= 60) {
			h++;
			m -= 60;
		}
		if (h >= 24) {
			h -= 24;
		}
		
		System.out.println(h + " " + m);
	}
}
