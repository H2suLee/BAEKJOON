package _q2581;

import java.util.ArrayList;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		A = A==1?2:A;
		int B = sc.nextInt();
		List<Integer> list = new ArrayList<>();
		for(int i=A;i<=B;i++) {
			int modval = 1;
			int cnt = 0;
			while(cnt<3&&modval<i) {
				if(i%modval==0){
					cnt++;
				}
				modval++;
			}
			
			if(cnt<2) {
				list.add(i);
			}
		}
		IntSummaryStatistics s = list.stream().mapToInt(num -> num).summaryStatistics();
		System.out.println(list.size()==0?-1:s.getSum() + "\n" + s.getMin());
		
	}
}
