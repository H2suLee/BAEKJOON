package _q10807;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
        
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];

        StringTokenizer st = new StringTokenizer(br.readLine());

        for(int i=0; i<arr.length; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }
        int searchNum = Integer.parseInt(br.readLine());
        int cnt = 0; // searchNum과 일치할시 갯수를 올리는 변수

        for(int i =0; i< arr.length; i++){
            if(arr[i]==searchNum){
                cnt++;
            }
        }
        System.out.println(cnt);
        br.close();
		 
        
        // 스캐너 사용해서 풀기
//		Scanner sc = new Scanner(System.in);
//		
//		int N = sc.nextInt();
//		int[] arr = new int[N];
//		for(int i=0;i<N;i++) {
//			arr[i] = sc.nextInt();
//		}
//		
//		int v = sc.nextInt();
//		int cnt = 0;
//
//		for(int i=0;i<N;i++) {
//			if(arr[i] == v) {
//				cnt++;
//			}
//		}
//		
//		System.out.println(cnt);
	}
}
