package CodeUp;

import java.util.*;

public class Q_1411 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	    int n = sc.nextInt();
	    int x = 0, y = 0;
	    
	    for (int i = 0; i < n-1; i++) {
			int s = sc.nextInt();
			
			x += s;
		}
	    for (int j = 1; j <= n; j++) {
	    	y += j;
		}
	    System.out.println(y-x);
	}
}

