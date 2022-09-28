package Baekjoon;

import java.util.Scanner;

public class Q_25238 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int a = sc.nextInt(), b = sc.nextInt();

		double tmp = a - a * (1d * b / 100);

		if (tmp >= 100) {
			System.out.println(0);
		} else
			System.out.println(1);

	}

}
