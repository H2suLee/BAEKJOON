package _q3052;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		boolean[] boolArr = new boolean[42];		
		for(int i=0; i<10; i++) {
			boolArr[Integer.parseInt(String.valueOf(br.readLine())) % 42] = true;
		}
		int cnt = 0;
		for(boolean val : boolArr) {
			if(val) {
				cnt++;
			}
		}
		System.out.println(cnt);
	}
	
	// 해쉬셋은 중복값을 저장하지 않는다고 함
	public static void main2(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		HashSet<Integer> set = new HashSet<>();
		for(int i=0; i<10; i++) {
			set.add((Integer.parseInt(String.valueOf(br.readLine()))) % 42);
		}
		System.out.println(set.size());
	}
	
	// 틀렸다고 함.. 같은 값 10개일 때 1을 표출해야하는데 0을 표출,,,
	public static void main3(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int[] arr = new int[10];
		for(int i=0; i<10; i++) {
			arr[i] = (Integer.parseInt(String.valueOf(br.readLine()))) % 42;
		}
		List<Integer> newList = new ArrayList<>();
		for(int i=0; i<9; i++) {
			for(int j=0;j<10;j++) {
				if(arr[i] != arr[j]) { 
					if(!newList.contains(arr[j])) {
						newList.add(arr[j]);
					}
				}
			}
		}
		System.out.println(newList.size());
	}
}
