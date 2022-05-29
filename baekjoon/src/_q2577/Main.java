package _q2577;

import java.util.Scanner;

// 세 개의 자연수 A, B, C가 주어질 때 A × B × C를 계산한 결과에 0부터 9까지 각각의 숫자가 몇 번씩 쓰였는지를 구하는 프로그램을 작성하시오.

// 예를 들어 A = 150, B = 266, C = 427 이라면 A × B × C = 150 × 266 × 427 = 17037300 이 되고, 계산한 결과 17037300 에는 0이 3번, 1이 1번, 3이 2번, 7이 2번 쓰였다.

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int multi = a * b * c;
		String str = String.valueOf(multi);
//		System.out.println(str);
		int zero = 0, one = 0, two = 0, three = 0, four = 0, five = 0, six = 0, seven = 0, eight = 0, nine = 0;

		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == '0') {
				zero++;
			} else if (str.charAt(i) == '1') {
				one++;
			} else if (str.charAt(i) == '2') {
				two++;
			} else if (str.charAt(i) == '3') {
				three++;
			} else if (str.charAt(i) == '4') {
				four++;
			} else if (str.charAt(i) == '5') {
				five++;
			} else if (str.charAt(i) == '6') {
				six++;
			} else if (str.charAt(i) == '7') {
				seven++;
			} else if (str.charAt(i) == '8') {
				eight++;
			} else if (str.charAt(i) == '9') {
				nine++;
			}
		}
		System.out.printf("%d\n %d\n %d\n %d\n %d\n %d\n %d\n %d\n %d\n %d\n", zero, one, two, three, four, five, six, seven, eight,
				nine);
	}
}
