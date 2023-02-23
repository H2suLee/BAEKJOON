package _q10811;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
	// 틀림 // 스택써서 푸쉬 팝하라고 함.,,
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int[] arr = new int[N];
        for(int i=0;i<N;i++) {
        	arr[i] = i+1;
        }
        
        for(int i=0; i<M; i++) {
        	String str = br.readLine();
			String str1 = String.valueOf(str.charAt(0));
			String str2 = String.valueOf(str.charAt(2));
    		 int X = Integer.parseInt(str1)-1;
    	     int Y = Integer.parseInt(str2)-1;
    	     int temp = arr[X];
    	     arr[X] = arr[Y];
    	     arr[Y] = temp;
        }
        
        for(int i=0;i<arr.length;i++) {
			bw.write(arr[i] + " ");
		}
		bw.flush();
        
	}
}
