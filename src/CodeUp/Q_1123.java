package CodeUp;

import java.util.*;

public class Q_1123 {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
		int C = sc.nextInt();
		double F = (double)C*9/5+32;
		
		String st = String.format("%.3f", F);
		System.out.printf(st);
	}

}


