package _q5086;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		boolean b;
		String msg ="";
		while(true){
			
			int A = sc.nextInt();
			int B = sc.nextInt();
			
			if(A==0&&B==0) {
				break;
			}
			
			if(A<B) {
				b=isWhat(A, B);
				if(b) {
					msg = "factor";
				}
			}else {
				b=isWhat(B, A);
				if(b) {
					msg = "multiple";
				}
			}
			
			if(!b) {
				msg = "neither";
			}
			System.out.println(msg);
		}
		
	}
	
	static boolean isWhat(int A, int B){
		boolean b=false;
		int C = B;
		while(B==C) {
			B = B%A;
			if(B==0) {
				b=true;
			}
		}
		return b;
	}
}
