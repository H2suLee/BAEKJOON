package _q25206;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args){
		Map<String, Double> map = new HashMap<>();
		map.put("A+", 4.5);
		map.put("A0", 4.0);
		map.put("B+", 3.5);
		map.put("B0", 3.0);
		map.put("C+", 2.5);
		map.put("C0", 2.0);
		map.put("D+", 1.5);
		map.put("D0", 1.0);
		map.put("F", 0.0);
		
		Scanner sc = new Scanner(System.in);
		StringTokenizer st = null;
		double totalPoint = 0;
		double pointTimesCredit = 0;
		for(int i=0;i<20;i++) {
			st = new StringTokenizer(sc.nextLine(), " ");
			st.nextToken();
			double str2 = Double.parseDouble(st.nextToken());
			String str3 = st.nextToken();
			if(!"P".equals(str3)) {
				totalPoint += str2;
				double dbl = map.get(str3);
				pointTimesCredit += (str2*dbl);				
			}
		}
		System.out.println(pointTimesCredit / totalPoint);
	}
}
