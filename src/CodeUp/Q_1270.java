package CodeUp;

import java.util.Scanner;

public class Q_1270 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt(), sum = 0;
		
		for(int i = 1; i <= n; i++) {
			if(i % 10 == 1) {
				sum += 1;
			}
		}
		System.out.println(sum);
	}

}