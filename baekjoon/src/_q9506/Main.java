package _q9506;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A = 0;
		while(true){
			A = sc.nextInt();
			if(A==-1) {
				break;
			}
			 			
			String str = "";
			int cnt=1;
			int sum=1;
			while(cnt<A) {
				cnt++;
				if(A==cnt) {
					break;
				}
				if(A%cnt==0) {
					sum += cnt;
					str += " + " + cnt;
				}
			}
			
			String msg = A + " = 1";
			if(sum == A) {
				msg += str;
			}else {
				msg = A + " is NOT perfect.";
			}
		
			System.out.println(msg);
		}
	}
}
