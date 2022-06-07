package _2022_05_24;

import java.util.*;

public class YDY_Q2309 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int[] height = new int[9];
		int sum = 0;
		int lie1 = 0, lie2 = 0; // 가짜 난쟁이

		for (int i = 0; i < 9; i++) {
			height[i] = sc.nextInt();

			sum += height[i];
		}
		Arrays.sort(height);

		for (int a = 0; a < height.length; a++) {
			for (int b = a + 1; b < height.length; b++) {
				if (sum - height[a] - height[b] == 100) {
					lie1 = a;
					lie2 = b;
					break;
				}
			}
		}
		for (int j = 0; j < height.length; j++) {
			if (lie1 == j || lie2 == j)
				continue;
			System.out.println(height[j]);
		}
	}
}

/*
 * 2022-05-24
 * 문제 이해도 : 2
 * 문제 해결 : O
 * 코딩 시간 : 80분
 */