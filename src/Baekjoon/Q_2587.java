package Baekjoon;

import java.util.Arrays;
import java.util.Scanner;

public class Q_2587 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[] num = new int[5];
		int avg = 0, sum = 0;
		int center = 0;
		
		for (int i = 0; i < 5; i++) {
			num[i] = sc.nextInt();
			sum += num[i];
			
		}
		Arrays.sort(num);
		avg = sum / 5;
		center = num[2];
		
		System.out.println(avg);
		System.out.println(center);

	}
}