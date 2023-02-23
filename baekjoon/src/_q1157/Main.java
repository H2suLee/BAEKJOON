package _q1157;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String S = br.readLine().toUpperCase();
		int[] arr = new int[26];
		for(int i=0; i<S.length(); i++) {
			int val = (int) S.charAt(i);
			arr[val-65] += 1;
		}
		
		int max = Arrays.stream(arr).max().getAsInt();
		int val = 0;
		int cnt = 0;
		// 자리값 확인
		for(int i=0; i<arr.length; i++) {
			if(arr[i] == max) {
				val = i;
				cnt++;
			}
		}
		
		if(cnt == 1) {
			System.out.println((char) (val+65));
		}else {
			System.out.println("?");
		}
	}
}
