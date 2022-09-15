package CodeUp;

import java.util.*;

public class Q_2633 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt(), k = sc.nextInt();
		int s = 0;
		
		for (int i = 1; i <= n; i++) {
			int n2 = sc.nextInt();
			
			if(n2 < k) {
				s += 1;
			}
			else if(n2 >= k) {
				s += 1;
				break;
			}
			if(i == n-1) {
				s += 1;
			}
		}
		System.out.println(s);
	}
}

