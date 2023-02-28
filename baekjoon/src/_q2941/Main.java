package _q2941;
// 	런타임 에러 (StringIndexOutOfBounds)
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String S = sc.nextLine();
		int lng = S.length();
		for(int i=0; i<S.length(); i++) {
			char C = S.charAt(i);
			switch(C) {
				case 'c':
					if(S.charAt(i+1) == '=' || S.charAt(i+1) == '-' ) {
						lng-=1;
					}
					break;
				case 'd':
					if(S.charAt(i+1) == 'z' && S.charAt(i+2) == '=') {
						lng-=2;
						i+=2;
					}else if(S.charAt(i+1) == '-') {
						lng-=1;
					}
					break;
				case 'l':
					if(S.charAt(i+1) == 'j') {
						lng-=1;
					}
					break;
				case 'n':
					if(S.charAt(i+1) == 'j') {
						lng-=1;
					}
					break;
				case 's':
					if(S.charAt(i+1) == '=') {
						lng-=1;
					}
					break;
				case 'z':
					if(S.charAt(i+1) == '=') {
						lng-=1;
					}
					break;
			}
		}
		System.out.println(lng);
	}
}
