package _q11022;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int a = Integer.parseInt(br.readLine());
		for(int i=0;i<a;i++) {
			String str = br.readLine();
			String str1 = String.valueOf(str.charAt(0));
			String str2 = String.valueOf(str.charAt(2));
			bw.write("Case #" + (i+1) + ": " + str1 + " + " + str2 + " = " + (Integer.parseInt(str1) + Integer.parseInt(str2) + "\n"));
		}
		bw.flush();
	}
}
