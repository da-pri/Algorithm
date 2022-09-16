package _2022_05_07;

import java.util.*;

public class Q_1082 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String n = sc.next();

		int num = Integer.parseInt(n, 16);

		for (int i = 1; i <= 15; i++) {
			int mul = num * i;

			String a = Integer.toHexString(i);
			String b = Integer.toHexString(mul);

			System.out.println(n + "*" + a.toUpperCase() + "=" + b.toUpperCase());
		}

	}
}
