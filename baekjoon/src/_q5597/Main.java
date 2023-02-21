package _q5597;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] arr = new String[28];
		for(int i=0; i<28; i++) {
			arr[i] = String.valueOf(br.readLine());
		}
		
		List<Integer> list = new ArrayList<>();
		for(int i=1; i<31; i++) {
			if(Arrays.asList(arr).indexOf(String.valueOf(i)) == -1) {
				list.add(i);
			}
		}
		
		Collections.sort(list);
		for(int i : list) {
			System.out.println(i);
		}
		
	}
	
	
	public static void main2(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] student = new int[31];
		
		for(int i=1; i<29; i++) {
			int success = sc.nextInt();
			student[success] = 1;
		}
		for(int i=1; i<student.length; i++) {
			if(student[i]!=1)
				System.out.println(i);
		}
		
		
		sc.close();

	}
}
