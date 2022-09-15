package CodeUp;

import java.util.*;

public class Q_1095 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int min = 23;
		
		for(int i = 1; i < n; i++) {
			int k = sc.nextInt();
			if(min > k) {
				min = k;
			}
		}
		System.out.println(min);
	}
}

