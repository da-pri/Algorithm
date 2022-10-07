package Baekjoon;
import java.util.*;

public class Q_2309 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int[] height = new int[9];
		int sum = 0;
		int lie1 = 0, lie2 = 0; // ��¥ ������

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