package CodeUp;

import java.util.Scanner;

public class Q_1272 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int k = sc.nextInt();
		int h = sc.nextInt();

		int a = 0;
		int b = 0;
		if (k % 2 == 0) {
			a = k / 2 * 10;
		}
		if (k % 2 != 0) {
			a = (k + 1) / 2;
		}
		if (h % 2 == 0) {
			b = h / 2 * 10;
		}
		if (h % 2 != 0) {
			b = (h + 1) / 2;
		}
		System.out.println(a + b);
	}
}