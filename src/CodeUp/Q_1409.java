package CodeUp;

import java.util.*;

public class Q_1409 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int[] a = new int[10];

		for (int i = 0; i < 10; i++) {
			a[i] = sc.nextInt();
		}
		int k = sc.nextInt();
		System.out.println(a[k - 1]);
	}
}