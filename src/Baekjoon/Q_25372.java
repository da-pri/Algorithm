package Baekjoon;

import java.util.Scanner;

public class Q_25372 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		for (int i = 0; i < n; i++) {
			String passwd = sc.next();

			if (passwd.length() <= 9 && passwd.length() >= 6) {
				System.out.println("yes");
			} else
				System.out.println("no");
		}
	}

}
