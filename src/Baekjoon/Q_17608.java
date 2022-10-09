package Baekjoon;

import java.util.Scanner;

public class Q_17608 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int count = 1;
		int n = sc.nextInt();
		int stick[] = new int[n];

		for (int i = 0; i < n; i++) {
			stick[i] = sc.nextInt();
		}
		int max = stick[n - 1];

		for (int i = n - 2; i >= 0; i--) {
			if (max < stick[i]) {
				max = stick[i];
				count++;
			}
		}
		System.out.println(count);
	}
}