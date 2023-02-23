package _q11718;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s;
		// 출력초과
//		do {
//			if(!"".equals(str)) {
//				System.out.println(str);
//			}
//		} while (!"".equals(str = br.readLine()));
		
		while ((s = br.readLine()) != null) {
            System.out.println(s);
        }
	}
	
}
