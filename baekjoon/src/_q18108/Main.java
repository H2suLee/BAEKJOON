package _q18108;

import java.util.Scanner;

// 불기 연도 -> 서기 연도
// 1998년생인 내가 태국에서는 2541년생?!

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int y = sc.nextInt();
		System.out.println(y-543);
	}
}
